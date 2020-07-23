export interface IConcertsModel {
  concert_id: number;
  concert_name: string;
  concert_image?: string;
  concert_date: number;
  concert_url: string;
  type_id: number;
  place_name?: string;
  city?: string;
  province?: string;
  artist_name: string;
  artist_image?: string;
  collaborators?: number;
  genres: string;
}