export class Proyecto {
    id?: number;
    nombreP: string;
    descripcionP: string;
    imagen: string;
    inicio: string;
    fin: string

    constructor(nombreP: string, descripcionP: string, imagen: string,  inicio: string, fin: string){
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imagen = imagen;
        this.inicio = inicio;
        this.fin = fin
    }

}
