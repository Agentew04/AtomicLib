package io.github.agentew04.atomiclib;

import java.util.HashMap;
import java.util.Map;

public enum Elements {
    HYDROGEN("Hidrogênio","H",1,1.008,"1s1"),
    HELIUM("Hélio","He",2,4.0026,"1s2"),
    LITHIUM("Lítio","Li",3,6.94, HELIUM.Distribution+" 2s1"),
    BERYLLIUM("Berílio","Be",4,9.0122,HELIUM.Distribution+" 2s2"),
    BORON("Boro","B",5,10.81,HELIUM.Distribution+" 2s2 2p1"),
    CARBON("Carbono","C",6,12.011, HELIUM.Distribution+" 2s2 2p2"),
    NITROGEN("Nitrogênio","N",7,14.007, HELIUM.Distribution+" 2s2 2p3"),
    OXYGEN("Oxigênio","O",8,15.999, HELIUM.Distribution+" 2s2 2p4"),
    FLUORINE("Flúor","F",9,18.998, HELIUM.Distribution+" 2s2 2p5"),
    NEON("Neônio","Ne",10,20.180, HELIUM.Distribution+" 2s2 2p6"),
    SODIUM("Sódio","Na",11,22.990, NEON.Distribution+" 3s1"),
    MAGNESIUM("Magnésio","Mg",12,24.305, NEON.Distribution+" 3s2"),
    ALUMINIUM("Alumínio","Al",3,26.982, NEON.Distribution+" 3s2 3p1"),
    SILICON("Silício","Si",14,28.085, NEON.Distribution+" 3s2 3p2"),
    PHOSPHORUS("Fósforo","P",15,30.974, NEON.Distribution+" 3s2 3p2"),
    SULFUR("Enxofre","S",16,32.06, NEON.Distribution+" 3s2 3p4"),
    CHLORINE("Cloro","Cl",17,35.45,NEON.Distribution+" 3s2 3p5"),
    ARGON("Argônio","Ar",18,39.948,NEON.Distribution+" 3s2 3p6"),
    POTASSIUM("Potássio","K",19,39.098,ARGON.Distribution+" 4s1"),
    CALCIUM("Cálcio","Ca",20,40.078,ARGON.Distribution+" 4s2"),
    SCANDIUM("Escândio","Sc",21,44.956,ARGON.Distribution+" 4s2 3d1"),
    TITANIUM("Titânio","Ti",22,47.867,ARGON.Distribution+" 4s2 3d2"),
    VANADIUM("Vanádio","V",23,50.942,ARGON.Distribution+" 4s2 3d3"),
    CHROMIUM("Cromo","Cr",24,51.996,ARGON.Distribution+" 4s1 3d5"),
    MANGANESE("Manganês","Mn",25,54.938,ARGON.Distribution+" 4s2 3d5"),
    IRON("Ferro","Fe",26,55.845,ARGON.Distribution+" 4s2 3d6"),
    COBALT("Cobalto","Co",27,58.933,ARGON.Distribution+" 4s2 3d7"),
    NICKEL("Níquel","Ni",27,58.693,ARGON.Distribution+" 4s2 3d8"),
    COPPER("Cobre","Cu",29,63.546,ARGON.Distribution+" 4s1 3d10"),
    ZINC("Zinco","Zn",30,65.38,ARGON.Distribution+" 4s2 3d10"),
    GALLIUM("Gálio","Ga",31,69.723,ARGON.Distribution+" 4s2 3d10 4p1"),
    GERMANIUM("Germânio","Ge",32,72.630,ARGON.Distribution+" 4s2 3d10 4p2"),
    ARSENIC("Arsênio","As",33,74.922,ARGON.Distribution+" 4s2 3d10 4p3"),
    SELENIUM("Selênio","Se",34,78.971,ARGON.Distribution+" 4s2 3d10 4p4"),
    BROMINE("Bromo","Br",35,79.904,ARGON.Distribution+" 4s2 3d10 4p5"),
    KRYPTON("Criptônio","Kr",36,83.798,ARGON.Distribution+" 4s2 3d10 4p6"),
    RUBIDIUM("Rubídio","Rb",37,85.468,KRYPTON.Distribution+" 5s1"),
    STRONTIUM("Estrôncio","Sr",38,87.62,KRYPTON.Distribution+" 5s2"),
    YTTRIUM("Ítrio","Y",39,88.906,KRYPTON.Distribution+" 5s2 4d1"),
    ZIRCONIUM("Zircônio","Zr",40,91.224,KRYPTON.Distribution+" 5s2 4d2"),
    NIOBIUM("Nióbio","Nb",41,92.906,KRYPTON.Distribution+" 5s1 4d4"),
    MOLYBDENUM("Molibdênio","Mo",42,95.950,KRYPTON.Distribution+" 5s1 4d5"),
    TECHNETIUM("Tecnésio","Tc",43,98,KRYPTON.Distribution+" 5s2 4d5"),
    RUTHENIUM("Ruthênio","Ru",44,101.07,KRYPTON.Distribution+" 5s1 4d7"),
    RHODIUM("Ródio","Rh",45,102.91,KRYPTON.Distribution+" 5s1 4d8"),
    PALLADIUM("Paládio","Pd",46,106.42,KRYPTON.Distribution+" 4d10"),
    SILVER("Prata","Ag",47,107.87, KRYPTON.Distribution+" 5s1 4d10"),
    CADMIUM("Cádmio","Cd",48,112.41, KRYPTON.Distribution+" 5s2 4d10"),
    INDIUM("Indío","In",49,114.82, KRYPTON.Distribution+" 5s2 4d10 5p1"),
    TIN("Estanho","Sn",50,118.71, KRYPTON.Distribution+" 5s2 4d10 5p2"),
    ANTIMONY("Antimônio","Sb",51,121.76, KRYPTON.Distribution+" 5s2 4d10 5p3"),
    TELLURIUM("Telúrio","Te",52,127.60, KRYPTON.Distribution+" 5s2 4d10 5p4"),
    IODINE("Iodo","I",53,126.90, KRYPTON.Distribution+" 5s2 4d10 5p5"),
    XENON("Xenônio","Xe",54,131.29, KRYPTON.Distribution+" 5s2 4d10 5p6"),
    CAESIUM("Césio","Cs",55,132.91, XENON.Distribution+" 6s1"),
    BARIUM("Bário","Ba",56,137.33, XENON.Distribution+" 6s2"),
    LANTHANUM("Lantânio","La",57,138.91, XENON.Distribution+" 6s2 5d1"),
    CERIUM("Cério","Ce",58,140.12, XENON.Distribution+" 6s2 4f1 5d1"),
    PRASEODYMIUM("Praseodímio","Pr",59,140.91, XENON.Distribution+" 6s2 4f3"),
    NEODYMIUM("Neodímio","Nd",60,144.24, XENON.Distribution+" 6s2 4f4"),
    PROMETHIUM("Promécio","Pm",61,145.000, XENON.Distribution+" 6s2 4f5"),
    SAMARIUM("Samário","Sm",62,150.36, XENON.Distribution+" 6s2 4f6"),
    EUROPIUM("Európio","Eu",63,151.96, XENON.Distribution+" 6s2 4f7"),
    GADOLINIUM("Gadolínio","Gd",64,157.25, XENON.Distribution+" 6s2 4f7 5d1"),
    TERBIUM("Terbio","Tb",65,158.93, XENON.Distribution+" 6s2 4f9"),
    DYSPROSIUM("Disprósio","Dy",66,162.50, XENON.Distribution+" 6s2 4f10"),
    HOLMIUM("Hólmio","Ho",67,164.93, XENON.Distribution+" 6s2 4f11"),
    ERBIUM("Érbio","Er",68,167.26, XENON.Distribution+" 6s2 4f12"),
    THULIUM("Túlio","Tm",69,168.93, XENON.Distribution+" 6s2 4f13"),
    YTTERBIUM("Itérbio","Yb",70,173.05, XENON.Distribution+" 6s2 4f14"),
    LUTETIUM("Lutécio","Lu",71,174.97, XENON.Distribution+" 6s2 4f14 5d1"),
    HAFNIUM("Háfnio","Hf",72,178.49, XENON.Distribution+" 6s2 4f14 5d2"),
    TANTALUM("Tântalo","Ta",73,180.95, XENON.Distribution+" 6s2 4f14 5d3"),
    TUNGSTEN("Tungstênio","W",74,183.84, XENON.Distribution+" 6s2 4f14 5d4"),
    RHENIUM("Rênio","Re",75,186.21, XENON.Distribution+" 6s2 4f14 5d5"),
    OSMIUM("Ósmio","Os",76,190.23, XENON.Distribution+" 6s2 4f14 5d6"),
    IRIDIUM("Irídio","Ir",77,192.22, XENON.Distribution+" 6s2 4f14 5d7"),
    PLATINUM("Platina","Pt",78,195.08, XENON.Distribution+" 6s1 4f14 5d9"),
    GOLD("Ouro","Au",79,196.97, XENON.Distribution+" 6s1 4f14 5d10"),
    MERCURY("Mercúrio","Hg",80,200.59, XENON.Distribution+" 6s2 4f14 5d10"),
    THALLIUM("Tálio","Tl",81,204.38, XENON.Distribution+" 6s2 4f14 5d10 6p1"),
    LEAD("Chumbo","Pb",82,207.200, XENON.Distribution+" 6s2 4f14 5d10 6p2"),
    BISMUTH("Bismuto","Bi",83,208.980, XENON.Distribution+" 6s2 4f14 5d10 6p3"),
    POLONIUM("Polônio","Po",84,209.000, XENON.Distribution+" 6s2 4f14 5d10 6p4"),
    ASTATINE("Astato","At",85,210.000, XENON.Distribution+" 6s2 4f14 5d10 6p5"),
    RADON("Radônio","Rn",86,222.000, XENON.Distribution+" 6s2 4f14 5d10 6p6"),
    FRANCIUM("Frâncio","Fr",87,223.000, RADON.Distribution+" 7s1"),
    RADIUM("Rádio","Ra",88,226.000, RADON.Distribution+" 7s2"),
    ACTINIUM("Actínio","Ac",89,227.000, RADON.Distribution+" 7s2 6d1"),
    THORIUM("Tório","Th",90,232.040, RADON.Distribution+" 7s2 6d2"),
    PROTACTINIUM("Protactínio","Pa",91,231.040, RADON.Distribution+" 7s2 5f2 6d1"),
    URANIUM("Urânio","U",92,238.030, RADON.Distribution+" 7s2 5f3 6d1"),
    NEPTUNIUM("Neptúnio","Np",93,237.000, RADON.Distribution+" 7s2 5f4 6d1"),
    PLUTONIUM("Plutônio","Pu",94,244.000, RADON.Distribution+" 7s2 5f6"),
    AMERICIUM("Amerício","Am",95,243.000, RADON.Distribution+" 7s2 5f7"),
    CURIUM("Cúrio","Cm",96,247.000, RADON.Distribution+" 7s2 5f7 6d1"),
    BERKELIUM("Berquélio","Bk",97,247.000, RADON.Distribution+" 7s2 5f9"),
    CALIFORNIUM("Califórnio","Cf",98,251.000, RADON.Distribution+" 7s2 5f10"),
    EINSTEINIUM("Einstênio","Es",99,252.000, RADON.Distribution+" 7s2 5f11"),
    FERMIUM("Férmio","Fm",100,257.000, RADON.Distribution+" 7s2 5f12"),
    MENDELEVIUM("Mendelévio","Md",101,258.000, RADON.Distribution+" 7s2 5f13"),
    NOBELIUM("Nobélio","No",102,259.000, RADON.Distribution+" 7s2 5f14"),
    LAWRENCIUM("Laurêncio","Lr",103,266.000, RADON.Distribution+" 7s2 5f14 7p1"),//it's 7p1 really, not 6d1
    RUTHERFORDIUM("Rutherfórdio","Rf",104,267.000, RADON.Distribution+" 7s2 5f14 6d2"),
    DUBNIUM("Dúbnio","Db",105,268.000, RADON.Distribution+" 7s2 5f14 6d3"),
    SEABORGIUM("Seabórgio","Sg",106,269.000, RADON.Distribution+" 7s2 5f14 6d4"),
    BOHRIUM("Bóhrio","Bh",107,270.000, RADON.Distribution+" 7s2 5f14 6d5"),
    HASSIUM("Hássio","Hs",108,277.000, RADON.Distribution+" 7s2 5f14 6d6"),
    MEITNERIUM("Meitnério","Mt",109,278.000, RADON.Distribution+" 7s2 5f14 6d7"),
    DARMSTADTIUM("Darmstádio","Ds",110,281.000, RADON.Distribution+" 7s1 5d14 6d9"),
    ROENTGENIUM("Roentgênio","Rg",111,282.000, RADON.Distribution+" 7s2 5f14 6d9"),
    COPERNICIUM("Copernício","Cn",112,285.000,RADON.Distribution+" 7s2 5f14 6d10"),
    NIHONIUM("Nihônio","Nh",113,286.000, RADON.Distribution+" 7s2 5f14 6d10 7p1"),
    FLEROVIUM("Floróvio","Fl",114,289.000, RADON.Distribution+" 7s2 5f14 6d10 7p2"),
    MOSCOVIUM("Moscóvio","Mc",115,290.000, RADON.Distribution+" 7s2 5f14 6d10 7p3"),
    LIVERMORIUM("Livermório","Lv",116,293.000, RADON.Distribution+" 7s2 5f14 6d10 7p4"),
    TENNESSINE("Tenessino","Ts",117,294.000, RADON.Distribution+" 7s2 5f14 6d10 7o5"),
    OGANESSON("Organessônio","Og",118,294.000, RADON.Distribution+" 7s2 5f14 6d10 7p6")
    ;
    private static final Map<Integer,Elements> protonsMap;
    private static final Map<Double,Elements> massMap;

    static {
        protonsMap = new HashMap<>();
        for (Elements v : Elements.values()) {
            protonsMap.put(v.Protons, v);
        }
        massMap = new HashMap<>();
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
    public double Mass;
    public int Electrons;
    public String Distribution;
    public String Symbol;
    Elements(String name,String symbol, int protons, double mass, String distribution){
        this.Name=name;
        this.Protons=protons;
        this.Neutrons=(int)Math.round(mass)-protons;
        this.Mass=mass;
        this.Electrons = protons;
        this.Symbol=symbol;
        this.Distribution=distribution;
    }
}
