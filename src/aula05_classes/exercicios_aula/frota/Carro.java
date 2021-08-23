package aula05_classes.exercicios_aula.frota;

public class Carro {
        private int ano;
        private String chassi;
        private String placa;
        private Integer kmPercorrido = 0;
        private boolean garantia=true;

    public Carro(int ano, String chassi) {
        this.ano = ano;
        this.chassi = chassi;
    }
        public void acelerar(int kmHora){
        this.kmPercorrido = this.kmPercorrido + kmHora;
    }
        public void acelerarPadrao(){
        this.kmPercorrido = this.kmPercorrido + 10;
    }
        public void setPlaca(String placa) {
        this.placa = placa;
    }

        public int getAno(){
        return ano;
    }

        public String getChassi() {
        return chassi;
    }

        public String getPlaca() {
        return placa;
    }

        public Integer getKmPercorrido() {
        return kmPercorrido;
    }
}

