package katawars;

public class ComplementaryDNA {

    /*
    Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for
     the development and functioning of living organisms.

     In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with
      one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is
       never empty or there is no DNA at all (again, except for Haskell).
     */

    public static void main(String[] args) {
        System.out.println(makeComplement("TTTT"));
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));

    }

    public static String makeComplement(String dna) {
        return dna.replaceAll("A", "t")
                .replaceAll("T", "a")
                .replaceAll("G", "c")
                .replaceAll("C", "g").toUpperCase();
    }

}
