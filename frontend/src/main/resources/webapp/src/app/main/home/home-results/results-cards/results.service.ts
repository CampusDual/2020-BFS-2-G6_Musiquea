import { Injectable } from "@angular/core";
import { OntimizeEEService, Observable } from "ontimize-web-ngx";
import { CONFIG } from "app/app.config";
import { HttpHeaders } from "@angular/common/http";
import { share } from "rxjs/operators";

@Injectable({
  providedIn: "root",
})
export class ResultsService extends OntimizeEEService {
  buildHeaders() {
    const myData = JSON.parse(localStorage.getItem(CONFIG.uuid));
    return new HttpHeaders({
      "Access-Control-Allow-Origin": "*",
      "Content-Type": "application/json;charset=UTF-8",
      Authorization: "Bearer " + myData.session.id,
    });
  }

  getResultData(searchText: string, monthText?: string) {
    const url = CONFIG.apiEndpoint + "/" + "concerts/search";

    let concertDate: string;

    if (!monthText) {
      concertDate = this.getDate();
    } else {
      concertDate = monthText;
    }

    let options = {
      headers: this.buildHeaders(),
    };
    let body = JSON.stringify({
      filter: {
        CONCERT_NAME: searchText.toUpperCase(),
        ARTIST_NAME: searchText,
        CONCERT_DATE: concertDate,
      },
    });
    let self = this;
    let dataObservable = new Observable(function (_innerObserver) {
      self.httpClient.post(url, body, options).subscribe(
        function (resp) {
          self.parseSuccessfulQueryResponse(resp, _innerObserver);
        },
        function (error) {
          self.parseUnsuccessfulQueryResponse(error, _innerObserver);
        },
        function () {
          return _innerObserver.complete();
        }
      );
    });
    return dataObservable.pipe(share());
  }

  getDate() {
    let today = new Date();
    let date: string;
    let day: string;
    let month = today.getUTCMonth() + 1;
    let year = today.getUTCFullYear();

    if (today.getUTCDate() >= 1 && today.getUTCDate() <= 9) {
      day = "0" + today.getUTCDate();
    } else {
      day = "" + today.getUTCDate();
    }

    if (month == 12) {
      date = year + "-" + month + "-" + day + "_" + (year + 1) + "-01-01";
    } else {
      if (month >= 1 && month <= 9 && month + 1 != 10) {
        date = year + "-0" + month + "-" + day + "_" + year + "-0" + (month + 1) + "-01";
      } else if (month >= 1 && month <= 9 && month + 1 == 10) {
        date = year + "-0" + month + "-" + day + "_" + year + "-" + (month + 1) + "-01";
      } else {
        date = year + "-" + month + "-" + day + "_" + year + "-" + (month + 1) + "-01";
      }
    }
    return date;
  }
}
