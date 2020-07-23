import { Injectable } from '@angular/core';
import { OntimizeEEService, Observable } from 'ontimize-web-ngx';
import { CONFIG } from 'app/app.config';
import { HttpHeaders } from '@angular/common/http';
import { share } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ConcertsService extends OntimizeEEService {
  buildHeaders() {
    const myData = JSON.parse(localStorage.getItem(CONFIG.uuid));
    return new HttpHeaders({
      "Access-Control-Allow-Origin": "*",
      "Content-Type": "application/json;charset=UTF-8",
      Authorization: "Bearer " + myData.session.id,
    });
  }

  getDetailsData(concertId: number) {
    const url = CONFIG.apiEndpoint + "/" + "concerts/details/search";

    let options = {
      headers: this.buildHeaders(),
    };
    let body = JSON.stringify({
      filter: {
        concert_id: concertId
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
}
