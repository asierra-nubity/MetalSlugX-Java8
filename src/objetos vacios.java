import java.awt.Point;
//~abstract class Rehen extends ObjetoCombate {
	//~Rehen() {
		//~super(0, new java.awt.Point(10,10));
	//~}
	//~
	//~public boolean colisionar(ObjetoDeJuego o){
		//~return true;
	//~}
//~}
//~ abstract class Municion extends ObjetoCombate {
	//~ Municion() {
		//~ super(0, new java.awt.Point(10,10));
	//~ }
	//~ public boolean colisionar(ObjetoDeJuego o){
		//~ return true;
	//~ }
	//~ boolean esEnemiga() {
		//~ return true;
	//~ }
//~ }
//~ abstract class Enemigo extends ObjetoCombate {
	//~ Enemigo() {
		//~ super(0, new java.awt.Point(10,10));
	//~ }
	//~ public boolean colisionar(ObjetoDeJuego o){
		//~ return true;
	//~ }
//~ }
//~abstract class Bonus extends ObjetoDeJuego {
	//~Bonus() {
		//~super(0, new java.awt.Point(10,10));
	//~}
	//~Bonus(Point p, Sprite s) {
		//~super(p, s);
	//~}
	//~
	//~
	//~public boolean colisionar(ObjetoDeJuego o){
		//~return true;
	//~}
//~}
//~ class Palo extends Soldado implements Enemigo {
//~ 
	//~ static final Sprite spriteClase;
	//~ static {
		//~ spriteClase = new Sprite( DIR_SPRITES.resolve("palo.png"), new java.awt.Dimension(42, 74) );
//~ 
		//~ spriteClase.addFilaElementos(0, 82, 82, 6, 8, 6);
		//~ spriteClase.addFilaElementos(82, 62, 96, 6, 22, 6);
		//~ spriteClase.addFilaElementos(178, 62, 120, 6, 46, 6);
		//~ spriteClase.addFilaElementos(298, 102, 100, 16, 26, 1);
		//~ spriteClase.addFilaElementos(398, 94, 88, 51, 14, 5);
//~ 
		//~ spriteClase.addCuadroSecuencia(PARADO, 0, 0, -1);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO, 0, 1, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO, 0, 2, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO, 0, 3, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO, 0, 4, 7);
		//~ spriteClase.addCuadroSecuencia(SALTANDO, 0, 5, -1);
//~ 
		//~ spriteClase.addCuadroSecuencia(PARADO + DIAGONAL, 1, 0, -1);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO + DIAGONAL, 1, 1, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO + DIAGONAL, 1, 2, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO + DIAGONAL, 1, 3, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO + DIAGONAL, 1, 4, 7);
		//~ spriteClase.addCuadroSecuencia(SALTANDO + DIAGONAL, 1, 5, -1);
//~ 
		//~ spriteClase.addCuadroSecuencia(PARADO + ARRIBA, 2, 0, -1);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO + ARRIBA, 2, 1, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO + ARRIBA, 2, 2, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO + ARRIBA, 2, 3, 7);
		//~ spriteClase.addCuadroSecuencia(AVANZANDO + ARRIBA, 2, 4, 7);
		//~ spriteClase.addCuadroSecuencia(SALTANDO + ARRIBA, 2, 5, -1);
//~ 
		//~ spriteClase.addCuadroSecuencia(GRANADA, 3, 0, 10);
//~ 
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 0, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 1, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 2, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 3, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 4, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 3, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 4, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 3, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 4, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 3, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 4, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 3, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 4, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 3, 10);
		//~ spriteClase.addCuadroSecuencia(MURIENDO, 4, 4, 10);
	//~ }
//~ 
	//~ Palo() {
		//~ super(0, new java.awt.Point(50,300), spriteClase );
//~ 
		//~ setRapidez(3.0f);
		//~ setImpulsoSalto(-15.0f);
		//~ setMiras(new Point(51, 18),new Point(0, -39),new Point(30, -17));
	//~ }
//~ 
	//~ public void morir() {
		//~ muriendo = true;
	//~ }
//~ 
	//~ private boolean muriendo;
//~ 
	//~ public void actualizar() {
//~ 
		//~ if (!muriendo) {
			//~ int random = (int) (300 * Math.random());
			//~ switch (random) {
				//~ case 0 : case 1 : avanzarDerecha(); break;
				//~ case 2 : case 3 : avanzarIzquierda(); break;
				//~ case 4 : case 5 : case 11 : case 12 : detener(); break;
				//~ case 6 : disparar(); break;
				//~ case 7 : saltar(); break;
				//~ case 8 : lanzarGranada(); break;
				//~ case 9 : apuntarArriba(true); break;
				//~ case 10 : apuntarArriba(false); break;
			//~ }
			//~ super.actualizar();
		//~ }
		//~ else
			//~ muriendo = !actualizarSecuencia(MURIENDO, AdminSprite.NINGUNO);
	//~ }
//~ }

//~class SoldadoJugador extends Palo {
	//~public void actualizar() {
		//~super.actualizar();
	//~}
	//~
	//~Temporizador t = new Temporizador(5);
	//~
	//~Jugador getJugador() {
		//~return jugador;
	//~}
//~}

class Nivel1 extends Nivel {
	public int getSuelo(int x) {
		//return x % 500 > 250 ? 150 : 450;
		return 400;
	}

	public void cargar() {
		
		// Corregir estaFueraDeLimites() para Dimension(0,0)
		
		setTiempoMaximo(999);

		setFondo(MetalSlugT.DIR_IMAGENES.resolve("mision1.gif"));
//~add(400, new EnemigoFinal1(400+640+100));
		//~add(800, new Tanque(800+640+50, 800+640-120));
//~
		//~add(500, new GrupoHelicopteros(new Point(500, 0), 5));
		//~//add(200, new Torre(new Point(520, 100)));
		//~
		//~add(EdificioTorres.getXActivacion(3812), new EdificioTorres(new Point(3812, 377)));
		//~
		add(0, new Rehen(800, BonusFactory.newBonusArma(BonusFactory.ARMA_H)));
		add(0, new Rehen(600, BonusFactory.newBonusArma(BonusFactory.ARMA_H)));
		add(0, new Rehen(700, BonusFactory.newBonusArma(BonusFactory.ARMA_H)));
		add(0, new Rehen(400, BonusFactory.newBonusArma(BonusFactory.ARMA_R)));
		add(0, new Rehen(500, BonusFactory.newBonusArma(BonusFactory.ARMA_R)));
		add(0, new Rehen(900, BonusFactory.newBonusArma(BonusFactory.ARMA_R)));
		add(0, new Rehen(950, BonusFactory.newBonusArma(BonusFactory.ARMA_R)));
		add(0, new Rehen(1000, BonusFactory.newBonusGranadas()));
		add(0, new Rehen(1100, BonusFactory.newBonusPuntos(BonusFactory.BANANAS)));
		add(0, new Rehen(1200, BonusFactory.newBonusTiempo()));
		add(0, new Rehen(1300, BonusFactory.newBonusPuntos(BonusFactory.JOYA_AZUL)));
		add(0, new Rehen(1400, BonusFactory.newBonusPuntos(BonusFactory.JOYA_ROJA)));

//~
		//~add(0, new PruebaItem());
//~
		//~add(10, new SoldadoEnemigo(new Point(720,200)));
		//~add(100, new SoldadoEnemigo(new Point(840,200)));
		//~add(200, new SoldadoEnemigo(new Point(200 + 650,200)));
		//~add(400, new SoldadoEnemigo(new Point(400 + 650,200)));
		//~add(400, new SoldadoEnemigo(new Point(400 + 700,200)));
		//~add(500, new SoldadoEnemigo(new Point(500 - 70,200)));
		//~add(500, new SoldadoEnemigo(new Point(500 - 170,200)));
		//~add(500, new SoldadoEnemigo(new Point(500 + 660,200)));
		//~ SoldadoEnemigo s;

		//~ for (int i = 0; i < 1 ; i++) {
			//~ s = new SoldadoEnemigo();
			//~ s.desplazar(200+450,-i * 100);
			//~ add(200, s);
		//~ }
//~
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(500+450,0);
		//~ add(500, s);
//~
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(500+450,-100);
		//~ add(500, s);
//~
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(1000+450,0);
		//~ add(1000, s);
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(1000+450,-100);
		//~ add(1000, s);
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(1000+450,-200);
		//~ add(1000, s);
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(1000+450,-300);
		//~ add(1000, s);
//~
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(1100+450,0);
		//~ add(1100, s);
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(1100+450,-100);
		//~ add(1100, s);
//~
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(1200+450,0);
		//~ add(1200, s);
		//~ s = new SoldadoEnemigo();
		//~ s.desplazar(1100+450,-200);
		//~ add(1100, s);
	}
}
