public abstract class Criatura implements Generica{

    public Criatura(String nome, String classe, int nivel, int vida, int magia, int forca, int agilidade, int destreza, int inteligencia, int carisma) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.magia = magia;
        this.forca = forca;
        this.agilidade = agilidade;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
    }
        private String nome;
	private String classe;
	private int nivel;
	private int vida;
	private int magia;
	private int forca;
	private int agilidade;
	private int destreza;
	private int inteligencia;
	private int carisma;

    public String getNome() { 
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
    
    public void atacar(){
    
    }
    public void defender(){
    
    }
    
    public boolean vivo(){
        //a tratar
        return true;
    }
    
    public void perdeVida(){
    
    }
    
    public void revitalizar(){
    
    }
    
    public abstract void descansar();

    public String toString(){
        return "a"; //a tratar  
   }
    
    public void call(){
    
    }
    
 }