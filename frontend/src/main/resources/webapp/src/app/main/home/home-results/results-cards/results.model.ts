export interface IResultsModel {
  concert_id: number;
  concert_image?: string;
  concert_date: number;
  type_id: number;
  place_name?: string;
  city?: string;
  artist_name: string;
  collaborators?: number;
}