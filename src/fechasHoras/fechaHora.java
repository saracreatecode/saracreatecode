package fechasHoras;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class fechaHora {
	public static void main(String[] args) {
		// La función now pilla la hora actual y la guarda en hoy
		LocalDate hoy = LocalDate.now();
		// se muestra en formato inglés
		System.out.println(hoy);

		// hora actual muy precisa
		LocalTime ahora = LocalTime.now();
		System.out.println(ahora);

		// tenemos que poner los 3 parámetros obligatoriamente tanto año, mes como día
		LocalDate cumple = LocalDate.of(2006, 8, 19);
		System.out.println(cumple);
		// Al menos en la hora tenemos que poner horas y minutos ya que solo con hora da
		// error
		LocalTime citaMedica = LocalTime.of(10, 15, 59);
		System.out.println("Hora de mi cita médica: " + citaMedica);

		// Aumentar el tiempo con plus
		LocalTime dentroDeUnaHora = ahora.plusHours(1);
		LocalTime dentroDeDiezMinutos = ahora.plusMinutes(10);
		LocalTime dentroDeTreintaSegundos = ahora.plusSeconds(30);
		// Restar el tiempo con minus
		LocalTime haceUnaHora = ahora.minusHours(1);
		LocalTime haceDiezMinutos = ahora.minusMinutes(10);
		LocalTime haceTreintaSegundos = ahora.minusSeconds(30);

		// Aumentamos el tiempo en 1 año
		LocalDate dentroDeUnAnio = hoy.plusYears(1);
		System.out.println(dentroDeUnAnio);

		// LocalDateTime devuelve el día actual seguido de una "T" y luego la hora
		// actual
		LocalDateTime fechaYHora = LocalDateTime.now();
		System.out.println(fechaYHora);

		/*
		 * formatear la fecha a la versión española MM de mes en mayúscula y podemos
		 * poner el año con "yy" o "yyyy" si ponemos "MMMM" escribe el mes en formato
		 * texto en el idioma que tengamos el teclado configurado Podemos poner
		 * cualquier tipo de separación " " o "-" "/" lo que queramos si ponemos EEEE
		 * delante del formato pone el día de la semana. Podemos añadir la hora de
		 * seguido ya que estamos usando la clase DateTimeFormatter y esta incluye la
		 * hora, la ponemos con HH:mm:ss
		 */
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy - HH:mm:ss");
		String fechaConFormato = fechaYHora.format(formato1);
		System.out.println(fechaConFormato);

		/*
		 * Podemos leer la fecha de alguna bbdd o de teclado etc y podemos pasarlo a un
		 * objeto de formato fecha para poder operar con esta fecha
		 */
		String fechaTxt = "08/10/1968";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate cumpleanios = LocalDate.parse(fechaTxt, formato);
		System.out.println(cumpleanios);

		// Comparación de fechas anteriores con isAfter
		if (cumpleanios.isAfter(hoy)) {
			System.out.println(cumpleanios + " es posterior a " + hoy);
		} else {
			System.out.println(cumpleanios + " no es posterior a " + hoy);
		}

		// Comparación de fehcas posteriores con isBefore
		if (cumpleanios.isBefore(hoy)) {
			System.out.println(cumpleanios + " es posterior a " + hoy);
		} else {
			System.out.println(cumpleanios + " no es posterior a " + hoy);
		}

		// Comparación de fehcas iguales con isEqual
		if (hoy.equals(hoy)) {
			System.out.println(hoy + " es igual a " + hoy);
		} else {
			System.out.println(hoy + " no es igual a " + hoy);
		}
	}
}
