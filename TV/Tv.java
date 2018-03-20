class Tv {

// descrição da tv. - tudo o que ela é/ Atributos imutável/ constante.

  final double tamanho;
  final String tipo;
  final int resolucaoX, resolucaoY;
  final boolean smart;

// Atributos mutáveis - Tudo que ela está.

boolean ligada;
int volume;
boolean mudo;
int canal;

//=============================================================

tv (double tamanho, String tipo, int resolucaoX, int resolucaoY, boolean smart){

// todo: (Falta a validação!!!)

this.tamanho = tamanho;
this.tipo = tipo;
this.resolucaoX = resolucaoX;
this.resolucaoY = resolucaoY;
this.smart = smart;

this.ligada = false;
this.volume = 10;
this.mudo = false;
this.canal = 14;

  }
// Métodos
// void - não retorna nada. (vazio, não retorna nada, apenas executa)
// método sempre inicia minúscula

void ligarDesligar(){
  this.ligada = !this.ligada;
    this.mudo = false;
  }

  void aumentarVolume(){
    if(this.ligada && this.volume < 100)
      this.volume ++;
    }

    void diminuirVolume(){
      if(this.ligada && this.volume > 1)
        this.volume --;
      }

      void ativarDesativarMudo(){
        if(this.ligada)
          this.mudo = !this.mudo;
        }

        void subirCanal(){
          if(this.ligada)
          // expressão ternária
            this.canal = this.canal < 69 ? this.canal + 1 : 14;
            // ? = if    : = else
          }

          void irParaCanal(int canal){
            if(this.ligada && canal > = 14 && canal < = 69)
              this.canal = canal;
            }

}


// se tornar o int canal privado (ex: private int canal;)
// método para leitura e consulta
// int canal (){
// return this.canal
}
