export class Experiencia {
    id?: number;
    nombreE: string;
    descripcionE: string;
    imagen: string;
    inicio: string;
    fin: string

    constructor(nombreE: string, descripcionE: string, imagen: string, inicio: string, fin: string){
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imagen = imagen;
        this.inicio = inicio;
        this.fin = fin
    }
}
