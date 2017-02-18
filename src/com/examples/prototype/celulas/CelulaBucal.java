package com.examples.prototype.celulas;

import com.examples.prototype.celulas.interfaces.Celula;

/**
 * Created by ricardo on 2/18/17.
 */
public class CelulaBucal extends Celula {

    public CelulaBucal() {
        tipo = "Bucal";
    }

    @Override
    public Object mitose() {
        System.out.println("Nova célula bucal criada");
        try {
            return this.clone();
        } catch (CloneNotSupportedException err) {
            return null;
        }
    }
}
