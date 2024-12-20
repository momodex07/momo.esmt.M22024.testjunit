package mesources;

public class CalculerImpôts {
    public int calculerimpôts(int salairebrut, int nombreparts){
    if (nombreparts > 5)
            throw new IllegalArgumentException("Le nombre de parts doit être inférieur à 6");
    if (nombreparts == 0)
            throw new ArithmeticException("Le nombre de parts doit être suoérieur à 0");
    return Integer.divideUnsigned(salairebrut, nombreparts) ;
}
    public int CalculerNombreParts(int nbConjoints, String statutConjoint, int nbEnfants) {
        int parts = 1; // Part de l'employé
        if (nbConjoints > 0 && "N".equalsIgnoreCase(statutConjoint)) {
            parts += 0.5;
        }
        parts += Math.min(nbEnfants * 0.5, 5 - parts); // Appliquer le plafond de 5 parts
        return (int) parts;
    }
}
