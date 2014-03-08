/**
 * Aplicación muy simple que muestra 7 botones, los cuales 
 * al ser pulsados reproduciran cada una de las 
 * notas musicales básicas (do, re, mi, fa, sol, la, si).
 * 
 * Cada boton, al ser pulsado, cambiara su color de fondo por
 * el gris, y después recuperara el color que tenía anteriormente.
 * 
 * @author Pablo Medina Suarez
 */
package hlc.android.piandroid;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Piano extends Activity {
	MediaPlayer notaDo, notaRe, notaMi, notaFa, notaSol, notaLa, notaSi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_piano);

		// Reproductores de las notas:
		notaDo = MediaPlayer.create(this, R.raw.nota_do);
		notaRe = MediaPlayer.create(this, R.raw.nota_re);
		notaMi = MediaPlayer.create(this, R.raw.nota_mi);
		notaFa = MediaPlayer.create(this, R.raw.nota_fa);
		notaSol = MediaPlayer.create(this, R.raw.nota_sol);
		notaLa = MediaPlayer.create(this, R.raw.nota_la);
		notaSi = MediaPlayer.create(this, R.raw.nota_si);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.piano, menu);
		return true;
	}
	
	/**
	 * Reproduce la nota correspondiente a cada boton.
	 * @param view La vista que se ha pulsado
	 */
	public void tocarNota(View view) {
		switch (view.getId()) {
		case R.id.nota_do:
			notaDo.start();
			break;
		case R.id.nota_re:
			notaRe.start();
			break;
		case R.id.nota_mi:
			notaMi.start();
			break;
		case R.id.nota_fa:
			notaFa.start();
			break;
		case R.id.nota_sol:
			notaSol.start();
			break;
		case R.id.nota_la:
			notaLa.start();
			break;
		case R.id.nota_si:
			notaSi.start();
			break;

		default:
			break;
		}
	}
}
