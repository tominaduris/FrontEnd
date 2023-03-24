export class Skill {
    id: number;
    nombre: string;
    porcentaje: number;
    imagen: string;
    color: string;

    constructor(nombre: string, porcentaje: number, imagen: string, color: string){
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.imagen = imagen;
        this.color = color;
    }
}
