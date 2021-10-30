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
    GALLIUM("Gálio","Ga",31,70,ARGON.Distribution+" 4s2 3d10 4p1"),
    GERMANIUM("Germânio","Ge",32,72,ARGON.Distribution+" 4s2 3d10 4p2"),
    ARSENIC("Arsênio","As",33,75,ARGON.Distribution+" 4s2 3d10 4p3"),
    SELENIUM("Selênio","Se",34,79,ARGON.Distribution+" 4s2 3d10 4p4"),
    BROMINE("Bromo","Br",35,80,ARGON.Distribution+" 4s2 3d10 4p5"),
    KRYPTON("Criptônio","Kr",36,84,ARGON.Distribution+" 4s2 3d10 4p6"),
    RUBIDIUM("Rubídio","Rb",37,85,KRYPTON.Distribution+" 5s1"),
    STRONTIUM("Estrôncio","Sr",38,88,KRYPTON.Distribution+" 5s2"),
    YTTRIUM("Ítrio","Y",39,89,KRYPTON.Distribution+" 5s2 4d1"),
    ZIRCONIUM("Zircônio","Zr",40,91,KRYPTON.Distribution+" 5s2 4d2"),
    NIOBIUM("Nióbio","Nb",41,93,KRYPTON.Distribution+" 5s1 4d4"),
    MOLYBDENUM("Molibdênio","Mo",42,96,KRYPTON.Distribution+" 5s1 4d5"),
    TECHNETIUM("Tecnésio","Tc",43,98,KRYPTON.Distribution+" 5s2 4d5"),
    RUTHENIUM("Ruthênio","Ru",44,101,KRYPTON.Distribution+" 5s1 4d7"),
    RHODIUM("Ródio","Rh",45,103,KRYPTON.Distribution+" 5s1 4d8"),
    PALLADIUM("Paládio","Pd",46,106,KRYPTON.Distribution+" 4d10"),
    SILVER("Prata","Ag",47,109, KRYPTON.Distribution+" 5s1 4d10"),
    CADMIUM("Cádmio","Cd",48,112, KRYPTON.Distribution+" 5s2 4d10"),
    INDIUM("Indío","In",49,115, KRYPTON.Distribution+" 5s2 4d10 5p1"),
    TIN("Estanho","Sn",50,119, KRYPTON.Distribution+" 5s2 4d10 5p2"),
    ANTIMONY("Antimônio","Sb",51,122, KRYPTON.Distribution+" 5s2 4d10 5p3"),
    TELLURIUM("Telúrio","Te",52,128, KRYPTON.Distribution+" 5s2 4d10 5p4"),
    IODINE("Iodo","I",53,127, KRYPTON.Distribution+" 5s2 4d10 5p5"),
    XENON("Xenônio","Xe",54,131, KRYPTON.Distribution+" 5s2 4d10 5p6"),
    CAESIUM("Césio","Cs",55,133, XENON.Distribution+" 6s1"),
    BARIUM("Bário","Ba",56,137, XENON.Distribution+" 6s2"),
    LANTHANUM("Lantânio","La",57,139, XENON.Distribution+" 6s2 5d1"),
    CERIUM("Cério","Ce",58,140, XENON.Distribution+" 6s2 4f1 5d1"),
    PRASEODYMIUM("Praseodímio","Pr",59,141, XENON.Distribution+" 6s2 4f3"),
    NEODYMIUM("Neodímio","Nd",60,144, XENON.Distribution+" 6s2 4f4"),
    PROMETHIUM("Promécio","Pm",61,145, XENON.Distribution+" 6s2 4f5"),
    SAMARIUM("Samário","Sm",62,150, XENON.Distribution+" 6s2 4f6"),
    EUROPIUM("Európio","Eu",63,152, XENON.Distribution+" 6s2 4f7"),
    GADOLINIUM("Gadolínio","Gd",64,157, XENON.Distribution+" 6s2 4f7 5d1"),
    TERBIUM("Terbio","Tb",65,159, XENON.Distribution+" 6s2 4f9"),
    DYSPROSIUM("Disprósio","Dy",66,162, XENON.Distribution+" 6s2 4f10"),
    HOLMIUM("Hólmio","Ho",67,165, XENON.Distribution+" 6s2 4f11"),
    ERBIUM("Érbio","Er",68,167, XENON.Distribution+" 6s2 4f12"),
    THULIUM("Túlio","Tm",69,169, XENON.Distribution+" 6s2 4f13"),
    YTTERBIUM("Itérbio","Yb",70,173, XENON.Distribution+" 6s2 4f14"),
    LUTETIUM("Lutécio","Lu",71,175, XENON.Distribution+" 6s2 4f14 5d1"),
    HAFNIUM("Háfnio","Hf",72,178, XENON.Distribution+" 6s2 4f14 5d2"),
    TANTALUM("Tântalo","Ta",73,181, XENON.Distribution+" 6s2 4f14 5d3"),
    TUNGSTEN("Tungstênio","W",74,184, XENON.Distribution+" 6s2 4f14 5d4"),
    RHENIUM("Rênio","Re",75,186, XENON.Distribution+" 6s2 4f14 5d5"),
    OSMIUM("Ósmio","Os",76,190, XENON.Distribution+" 6s2 4f14 5d6"),
    IRIDIUM("Irídio","Ir",77,192, XENON.Distribution+" 6s2 4f14 5d7"),
    PLATINUM("Platina","Pt",78,195, XENON.Distribution+" 6s1 4f14 5d9"),
    GOLD("Ouro","Au",79,197, XENON.Distribution+" 6s1 4f14 5d10"),
    MERCURY("Mercúrio","Hg",80,201, XENON.Distribution+" 6s2 4f14 5d10"),
    THALLIUM("Tálio","Tl",81,204, XENON.Distribution+" 6s2 4f14 5d10 6p1"),
    LEAD("Chumbo","Pb",82,207, XENON.Distribution+" 6s2 4f14 5d10 6p2"),
    BISMUTH("Bismuto","Bi",83,209, XENON.Distribution+" 6s2 4f14 5d10 6p3"),
    POLONIUM("Polônio","Po",84,209, XENON.Distribution+" 6s2 4f14 5d10 6p4"),
    ASTATINE("Astato","At",85,210, XENON.Distribution+" 6s2 4f14 5d10 6p5"),
    RADON("Radônio","Rn",86,222, XENON.Distribution+" 6s2 4f14 5d10 6p6"),
    FRANCIUM("Frâncio","Fr",87,223, RADON.Distribution+" 7s1"),
    RADIUM("Rádio","Ra",88,226, RADON.Distribution+" 7s2"),
    ACTINIUM("Actínio","Ac",89,227, RADON.Distribution+" 7s2 6d1"),
    THORIUM("Tório","Th",90,232, RADON.Distribution+" 7s2 6d2"),
    PROTACTINIUM("Protactínio","Pa",91,231, RADON.Distribution+" 7s2 5f2 6d1"),
    URANIUM("Urânio","U",92,238, RADON.Distribution+" 7s2 5f3 6d1"),
    NEPTUNIUM("Neptúnio","Np",93,237, RADON.Distribution+" 7s2 5f4 6d1"),
    PLUTONIUM("Plutônio","Pu",94,24, RADON.Distribution+" 7s2 5f6"),
    AMERICIUM("Amerício","Am",95,243, RADON.Distribution+" 7s2 5f7"),
    CURIUM("Cúrio","Cm",96,247, RADON.Distribution+" 7s2 5f7 6d1"),
    BERKELIUM("Berquélio","Bk",97,247, RADON.Distribution+" 7s2 5f9"),
    CALIFORNIUM("Califórnio","Cf",98,251, RADON.Distribution+" 7s2 5f10"),
    EINSTEINIUM("Einstênio","Es",99,252, RADON.Distribution+" 7s2 5f11"),
    FERMIUM("Férmio","Fm",100,257, RADON.Distribution+" 7s2 5f12"),
    MENDELEVIUM("Mendelévio","Md",101,258, RADON.Distribution+" 7s2 5f13"),
    NOBELIUM("Nobélio","No",102,259, RADON.Distribution+" 7s2 5f14"),
    LAWRENCIUM("Laurêncio","Lr",103,266, RADON.Distribution+" 7s2 5f14 7p1"),//it's 7p1 really, not 6d1
    RUTHERFORDIUM("Rutherfórdio","Rf",104,267, RADON.Distribution+" 7s2 5f14 6d2"),
    DUBNIUM("Dúbnio","Db",105,268, RADON.Distribution+" 7s2 5f14 6d3"),
    SEABORGIUM("Seabórgio","Sg",106,269, RADON.Distribution+" 7s2 5f14 6d4"),
    BOHRIUM("Bóhrio","Bh",107,270, RADON.Distribution+" 7s2 5f14 6d5"),
    HASSIUM("Hássio","Hs",108,277, RADON.Distribution+" 7s2 5f14 6d6"),
    MEITNERIUM("Meitnério","Mt",109,278, RADON.Distribution+" 7s2 5f14 6d7"),
    DARMSTADTIUM("Darmstádio","Ds",110,281, RADON.Distribution+" 7s1 5d14 6d9"),
    ROENTGENIUM("Roentgênio","Rg",111,282, RADON.Distribution+" 7s2 5f14 6d9"),
    COPERNICIUM("Copernício","Cn",112,285,RADON.Distribution+" 7s2 5f14 6d10"),
    NIHONIUM("Nihônio","Nh",113,286, RADON.Distribution+" 7s2 5f14 6d10 7p1"),
    FLEROVIUM("Floróvio","Fl",114,289, RADON.Distribution+" 7s2 5f14 6d10 7p2"),
    MOSCOVIUM("Moscóvio","Mc",115,290, RADON.Distribution+" 7s2 5f14 6d10 7p3"),
    LIVERMORIUM("Livermório","Lv",116,293, RADON.Distribution+" 7s2 5f14 6d10 7p4"),
    TENNESSINE("Tenessino","Ts",117,294, RADON.Distribution+" 7s2 5f14 6d10 7o5"),
    OGANESSON("Organessônio","Og",118,294, RADON.Distribution+" 7s2 5f14 6d10 7p6")
    ;
    private static final Map<Integer,Elements> protonsMap;
    private static final Map<Integer,Elements> massMap;

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
