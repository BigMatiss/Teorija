// Komentārs - programmas koda dala, kas palīdz programmas izstrādātājiem labāk 
// izprast koda darbibas principus. Programmas darbības laikā komentāri netiek ņemti vērā 

// - Viens rindas komentārs 

/* 
 * Vairāku
 * rindu 
 * komentārs
 */

package lv.jak.sevels.sintekse;  //pakotne - klases atrašanās vieta projektā

//import komanda - komandrinda,kas nodrošina citas klases vai pakotnes pieskaitīti šai klasei.
//Tā veidā tiek nodrošina dažādu funkciju izmantošanas iespējas šajā klasē, piemeram,
//datu ievade no tastatūras 
/*
 * iespējamas pieraksta formas 
 * import <pakotne>.<klase>;
 * import <pakotne>.*;
 */
import java.util.Scanner;

// JAVA klases daļa - galvenā programmēšanas daļa
// Sinktakse - Klaes nosaukums 
/*
 * Sintakses nosacījumi uz klases nosaukumu 
 *      1. Kalses nosaukums sakas ar lielo burtu
 *      2. Ja klases nosaukums satur vairākus vārdus, katrs vārds sakas ar lielo burtu 
 *      3. Nosaukumas var saturēt TIKIA BURTUS un CIPARUS!!!
 *      4. Ja klases nosaukums satur vairākus vārdus, tas ar atstarpēm NEATDLA!!!
 */
public class Sintakse {
	
	
	// Klases kermenis - šajā daļā aprakstītais koda faragments jr pieejams visai klasei,
	// izņēmuma nosacjyms  - apraksītās lietas ir radzamas tikai tai daļai koda , kas atrodas zemāk.
	// !!! NEDRĪKST rakstīt funkcionālus procesus, izņemot vēŗtības vērtibas vai objekta izveidi
	
	//Mainīgie - programmas valodas pamatelements
	/*
	 * Sintakses nosacijumi un mainīgā nosaukumu 
	 *      1.Mainīgā nosaukums sākas ar mazo kurtu
	 *      2.Ja mainīgā nosaukums satur vairākus vārdus,
	 *      pirmais vārds ar mazo,kats nākamais vārds sākas ar lielo burtu 
	 *      3.Ja mainīgā nosaukums satur vairākus vārdus, tas ar atstarpēm NEATDLA!!!
	 *      4.Nosaukumas var saturēt TIKIA BURTUS un CIPARUS!!!
	 * Izņēmuma gadijumi:  
	 *      1.Ja maiīgais uzglabā NEMAINĪGI (KONSTANTU) vērtību, nosaukums jāraksta ar lieliem burtiem un apakšvītrām (ja nosaukumā ir vairāki vārdi)
	 *      2.    
	 */
	// Mainīgā izvedošana
	/* Pierakasta forma:
	 *       --> ja ieprieķšējā mainīgais NAV izveidots: <datuTips> <mainīgaNosaukums>;      
	 */
	static int veselsSkaitlis;
	
	// vērtības piešķiršanas mainīgajam 
	/* Pieraksta forma:
	 *     --> ja ieprieķšējā mainīgais NAV izveidots: <datuTips> <mainīgaNosaukums> = <vērtiba>;
	 *     --> ja ieprieķšējā mainīgais IR  izveidots: <mainīgaNosaukums> = <vērtības>;
	 *     (Šo procesu var veikt TIKAI metodēs)
	 */
	double PI_VERTIBA = 4.14;  // konstants mainīgais
	
    // metode MAIN - galvenā moetodi.
	/*
	 * MAIN metode:
	 *      1. Uz visu projektu jābūt VISMAZ 1 MAIN metodei 
	 *      2. Metodes pieaksts ir TIEŠI 
	 */
	
	public static void main(String[] args) {
        //metodes kermenis - aprakstam algoritmu, kuru vēlamies izpildt
		veselsSkaitlis = 5; //vērtības piešķiršana jau eksistējošam mainīgajam 
	}
// Klases kermenis ir beizdies 
}
// NEKO ŠEIT NEDĪKST RAKSTĪT.