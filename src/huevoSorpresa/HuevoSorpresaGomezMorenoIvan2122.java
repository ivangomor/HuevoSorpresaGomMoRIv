package huevoSorpresa;

public class HuevoSorpresaGomezMorenoIvan2122 {

    /**
     * @return the precioMaximoGomezMorenoIvan2122
     */
    public double getPrecioMaximoGomezMorenoIvan2122() {
        return precioMaximoGomezMorenoIvan2122;
    }

    /**
     * @param precioMaximoGomezMorenoIvan2122 the precioMaximoGomezMorenoIvan2122 to set
     */
    public void setPrecioMaximoGomezMorenoIvan2122(double precioMaximoGomezMorenoIvan2122) {
        this.precioMaximoGomezMorenoIvan2122 = precioMaximoGomezMorenoIvan2122;
    }

    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precioMaximoGomezMorenoIvan2122;//precio máximo que puede tener un huevo sorpresa

    /*Constructor por defecto*/
    public HuevoSorpresaGomezMorenoIvan2122() {
    }


    /*Constructor por parámetros*/
    public HuevoSorpresaGomezMorenoIvan2122(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precioMaximoGomezMorenoIvan2122 = precio_max;
    }


    /*Método que devuelve el número de huevos sorpresa que tiene la tienda*/
    public int obtenerUnidades() {
        return this.unidades;
    }

    /*Método que devuelve el precio que tiene cada huevo sorpresa*/
    public double obtenerPrecio() {
        return this.getPrecio();
    }


    /* Método que devuelve la sorpresa que tiene el huevo*/
    public String obtenerSorpresa() {
        return sorpresa;
    }

    /* Método que permite modificar la sorpresa del huevo*/
    public void modificarSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }


    /*Método que permite modificar el número de huevos sorpresa que tiene la tienda*/
    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }


    /*Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay 
suficientes unidades en la tienda*/
    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresaGomezMorenoIvan2122) throws Exception {
        if (dinero <= 0) {
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }


    /*Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
    el aumento que se indica siempre que no se sobrepase el precio máximo de venta*/
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecioMaximoGomezMorenoIvan2122() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
