package pkgs.pkgExes;

import java.time.*;
import java.time.format.*;
import java.time.temporal.TemporalAdjusters;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1();
		System.out.println("</>");
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		ZonedDateTime zdt = ZonedDateTime.of(2024, 4, 1, 18, 35, 59, 9999, ZoneId.systemDefault());
		System.out.println(zdt);
		OffsetDateTime osdt = zdt.toOffsetDateTime();
		System.out.println(osdt);
	}

}

/*
<>
Exe001.m1()
2024-04-01T18:35:59.000009999-04:00[America/Cuiaba]
2024-04-01T18:35:59.000009999-04:00
</>
*/

/*
4. As principais diferenças
Primeiro, não faz sentido (sem conversões) comparar diretamente duas datas com informações completas de fuso horário. Portanto, devemos sempre preferir armazenar OffsetDateTime no banco de dados em vez de ZonedDateTime, pois datas com um deslocamento de horário local sempre representam os mesmos instantes no tempo.

Além disso, diferentemente do ZonedDateTime, adicionar um índice sobre uma coluna que armazena o OffsetDateTime não mudará o significado da data.

Vamos resumir rapidamente as principais diferenças.

ZonedDateTime:

*armazena todos os campos de data e hora, com uma precisão de nanossegundos, e um fuso horário, com um deslocamento de zona usado para lidar com datas e horas locais ambíguas
*não pode definir deslocamentos livremente, pois a zona controla os valores de deslocamento válidos
*é totalmente compatível com o horário de verão e lida com ajustes de horário de verão
*é útil para exibir campos de data e hora em um fuso horário específico do usuário

OffsetDateTime:

*armazena todos os campos de data e hora, com uma precisão de nanossegundos, bem como o deslocamento de GMT/UTC (sem informações de fuso horário)
*deve ser usado para armazenar uma data no banco de dados ou comunicá-la por uma rede
*/
