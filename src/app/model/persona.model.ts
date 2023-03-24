export class persona{
    id?: number;
    nombre: string;
    apellido: string;
    descripcion: string;
    constructor(nombre: string, apellido: string, descripcion: string){
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
    }
}