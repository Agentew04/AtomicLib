package io.github.agentew04.atomiclib;

import java.util.HashMap;
import java.util.Map;

public enum Elements {
    HYDROGEN("Hidrogênio","H",1,1,"1s1"),
    HELIUM("Hélio","He",2,4,"1s2"),
    LITHIUM("Lítio","Li",3,7, HELIUM.Distribution+" 2s1"),
    BERYLLIUM("Berílio","Be",4,9,HELIUM.Distribution+" 2s2"),
    BORON("Boro","B",5,11,HELIUM.Distribution+" 2s2 2p1"),
    CARBON("Carbono","C",6,12, HELIUM.Distribution+" 2s2 2p2"),
    NITROGEN("Nitrogênio","N",7,14, HELIUM.Distribution+" 2s2 2p3"),
    OXYGEN("Oxigênio","O",8,16, HELIUM.Distribution+" 2s2 2p4"),
    FLUORINE("Flúor","F",9,1, HELIUM.Distribution+" 2s2 2p5"),
    NEON("Neônio","Ne",10,20, HELIUM.Distribution+" 2s2 2p6"),
    SODIUM("Sódio","Na",1,23, NEON.Distribution+" 3s1"),
    MAGNESIUM("Magnésio","Mg",12,24, NEON.Distribution+" 3s2"),
    ALUMINIUM("Alumínio","Al",3,27, NEON.Distribution+" 3s2 3p1"),
    SILICON("Silício","Si",14,28, NEON.Distribution+" 3s2 3p2"),
    PHOSPHORUS("Fósforo","P",15,31, NEON.Distribution+" 3s2 3p2"),
    SULFUR("Enxofre","S",16,32, NEON.Distribution+" 3s2 3p4"),
    CHLORINE("Cloro","Cl",17,35,NEON.Distribution+" 3s2 3p5"),
    ARGON("Argônio","Ar",18,40,NEON.Distribution+" 3s2 3p6"),
    POTASSIUM("Potássio","K",19,39,ARGON.Distribution+" 4s1"),
    CALCIUM("Cálcio","Ca",20,40,ARGON.Distribution+" 4s2"),
    SCANDIUM("Escândio","Sc",21,45,ARGON.Distribution+" 4s2 3d1"),
    TITANIUM("Titânio","Ti",22,48,ARGON.Distribution+" 4s2 3d2"),
    VANADIUM("Vanádio","V",23,51,ARGON.Distribution+" 4s2 3d3"),
    CHROMIUM("Cromo","Cr",24,52,ARGON.Distribution+" 4s1 3d5"),
    MANGANESE("Manganês","Mn",25,55,ARGON.Distribution+" 4s2 3d5"),
    IRON("Ferro","Fe",26,56,ARGON.Distribution+" 4s2 3d6"),
    COBALT("Cobalto","Co",27,59,ARGON.Distribution+" 4s2 3d7"),
    NICKEL("Níquel","Ni",27,59,ARGON.Distribution+" 4s2 3d8"),
    COPPER("Cobre","Cu",29,63,ARGON.Distribution+" 4s1 3d10"),
    ZINC("Zinco","Zn",30,65,ARGON.Distribution+" 4s2 3d10"),
    GALLIUM("Gálio","Ga",31,70),
    GERMANIUM("Germânio","Ge",32,72),
    ARSENIC("Arsênio","As",33,75),
    SELENIUM("Selênio","Se",34,79),
    BROMINE("Bromo","Br",35,80),
    KRYPTON("Criptônio","Kr",36,84),
    RUBIDIUM("Rubídio","Rb",37,85),
    STRONTIUM("Estrôncio","Sr",38,88),
    YTTRIUM("Ítrio","Y",39,89),
    ZIRCONIUM("Zircônio","Zr",40,91),
    NIOBIUM("Nióbio","Nb",41,93),
    MOLYBDENUM("Molibdênio","Mo",42,96),
    TECHNETIUM("Tecnésio","Tc",43,98),
    RUTHENIUM("Ruthênio","Ru",44,101),
    RHODIUM("Ródio","Rh",45,103),
    PALLADIUM("Paládio","Pd",46,106),
    SILVER("Prata","Ag",47,109),
    CADMIUM("Cádmio","Cd",48,112),
    INDIUM("Indío","In",49,115),
    TIN("Estanho","Sn",50,119),
    ANTIMONY("Antimônio","Sb",51,122),
    TELLURIUM("Telúrio","Te",52,128),
    IODINE("Iodo","I",53,127),
    XENON("Xenônio","Xe",54,131),
    CAESIUM("Césio","Cs",55,133),
    BARIUM("Bário","Ba",56,137),
    LANTHANUM("Lantânio","La",57,139),
    CERIUM("Cério","Ce",58,140),
    PRASEODYMIUM("Praseodímio","Pr",59,141),
    NEODYMIUM("Neodímio","Nd",60,144),
    PROMETHIUM("Promécio","Pm",61,145),
    SAMARIUM("Samário","Sm",62,150),
    EUROPIUM("Európio","Eu",63,152),
    GADOLINIUM("Gadolínio","Gd",64,157),
    TERBIUM("Terbio","Tb",65,159),
    DYSPROSIUM("Disprósio","Dy",66,162),
    HOLMIUM()
    ;
    private static final Map<Integer,Elements> protonsMap;
    private static final Map<Integer,Elements> massMap;

    static {
        protonsMap = new HashMap<Integer,Elements>();
        for (Elements v : Elements.values()) {
            protonsMap.put(v.Protons, v);
        }
        massMap = new HashMap<Integer,Elements>();
        for (Elements v : Elements.values()) {
            massMap.put(v.Mass, v);
        }
    }
    public Elements fromProtons(int z){
        return protonsMap.get(z);
    }
    public String Name;
    public int Protons;
    public int Neutrons;
    public int Mass;
    public int Electrons;
    public String Distribution;
    public String Symbol;
    Elements(String name,String symbol, int protons, int mass, String distribution){
        this.Name=name;
        this.Protons=protons;
        this.Neutrons=mass-protons;
        this.Mass=mass;
        this.Electrons = protons;
        this.Symbol=symbol;
        this.Distribution=distribution;
    }
}
