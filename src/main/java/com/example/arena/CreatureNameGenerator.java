package com.example.arena;

public class CreatureNameGenerator {

  private RandomGenerator randomGenerator = new RandomGenerator();

  public void setRandomGenerator(RandomGenerator randomGenerator) {
    this.randomGenerator = randomGenerator;
  }

  private String[] getAdverbs() {
    String[]
        adverbs =
        {"abstrakcyjnie","anarchicznie","apodyktycznie","autoironicznie","agresywnie","anarchistycznie",
         "apoplektycznie","autokratycznie","alergicznie","anegdotycznie","arbitralnie","automatycznie",
         "aluzyjnie","anielsko","arogancko","autorytarnie","ambitnie","antypatycznie","artystycznie","autorytatywnie",
         "ambiwalentnie","apatycznie","arystokratycznie","autystycznie","amoralnie","apetycznie","ascetycznie","badawczo",
         "bezmyslnie","blyskawicznie","balamutnie","beznadziejnie","blyskotliwie","banalnie","beznamietnie","bogobojnie",
         "bandycko","bezpiecznie","bohatersko","bez przekonania","bezplciowo","bojazliwie","bez zainteresowania",
         "bezradnie","bojowo","bezbronnie","bezsilnie","bolesnie","bezceremonialnie","bezszelestnie","bosko","bezczelnie",
         "beztrosko","bratersko","bezczynnie","bezwiednie","brawurowo","bezdusznie","bezwzglednie","brutalnie","bezglosnie",
         "biegle","brzydko","bezinteresownie","blado","buntowniczo","bezladnie","blagalnie","butnie","bezlitosnie","blogo",
         "bystro","ceremonialnie","chojracko","ciekawsko","cudnie","chamsko","chorobliwie","cieplo","cwaniacko","chaotycznie",
         "chrapliwie","cieplutko","cynicznie","chciwie","chutliwie","cierpiaco","czarownie","chelpliwie","chwacko",
         "cierpko","czarujaco","chetnie","chytrze","cierpliwie","czujnie","chlodno","cicho","ciezko","czule","chlopieco",
         "cichutko","ckliwie","chmurnie","ciekawie","cudacznie","delikatnie","dobitnie","doskonale","dyskretnie","delikatniutko",
         "dobrodusznie","dostojnie","dystyngowanie","demobilizujaco","dobrotliwie","dotkliwie","dziarsko","demonicznie",
         "doceniajaco","dowcipnie","dziecinnie","demonstracyjnie","dociekliwie","dramatycznie","dziekczynnie","denerwujaco",
         "dojmujaco","drapieznie","dzielnie","deprecjonujaco","dojrzale","drazliwie","dziewczeco","deprymujaco","dokladnie",
         "druzgocaco","dziewiczo","desperacko","dokuczliwie","drwiaco","dziko","destruktywnie","dominujaco","dumnie",
         "dziwacznie","dezorientujaco","domyslnie","durnie","dziwnie","diabelsko","donosnie","dwornie","dzwiecznie","diabolicznie",
         "dosadnie","dwuznacznie","efektownie","ekscentrycznie","ekstrawertycznie","entuzjastycznie","egocentrycznie",
         "ekspansywnie","elegancko","erotycznie","egoistycznie","ekspresywnie","emocjonalnie","euforycznie","egzaltowanie",
         "ekstatycznie","energicznie","ezoterycznie","eklektycznie","ekstrawagancko","enigmatycznie","fachowo","fatalistycznie",
         "filuternie","frapujaco","falszywie","fatalnie","finezyjnie","frasobliwie","fanatycznie","figlarnie","flegmatycznie",
         "frenetycznie","fantazyjnie","filozoficznie","formalnie","frywolnie","gapowato","glupawo","goraco","gromko",
         "gburowato","glupio","goraczkowo","groznie","genialnie","glupiutko","gorliwie","grubiansko","gleboko","glupkowato",
         "gorzko","grzecznie","glosno","gniewnie","goscinnie","grzmiaco","glucho","godnie","grobowo","gwaltownie",
         "halasliwie","harmonijnie","hojnie","humorystycznie","hardo","histerycznie","honorowo","idiotycznie",
         "insynuacyjnie","introwertycznie", "irracjonalnie","imponujaco","intelektualnie","intrygujaco","irytujaco",
         "impulsywnie","inteligentnie","intuicyjnie","instynktownie","intensywnie","ironicznie","jadowicie","jowialnie",
         "kaprysnie","kokieteryjnie","konwencjonalnie" ,"krwiozerczo","karcaco","komicznie","kordialnie","krytycznie",
         "karnie","kompetentnie","koslawo","krzepiaco","kasliwie","konkretnie","koszmarnie","krzykliwie",
         "kataleptycznie","konserwatywnie","kpiaco","krzywo","kategorycznie","konspiracyjnie","kpiarsko",
         "kumotersko","klamliwie","konstruktywnie","kretynsko","kunktatorsko","klotliwie","konsumpcyjnie",
         "krotko","kuszaco","kobieco","kontemplatywniekrotochwilnie","kwasno","kochajaco","kontrolnie",
         "krwawo","ladnie","laskawie","lekliwie","lubieznie","lagodnie","latwowiernie","leniwie","lunatycznie",
         "lajdacko","leciutko","lizusowsko","lzawo","lakomie","lekcewazaco","lobuzersko","lakonicznie","lekko",
         "lodowato","lapczywie","lekkomyslnie","logicznie","machinalnie","marudnie","metnie","mimowolnie",
         "macierzynsko","marzycielsko","metodycznie","mistrzowsko","madrze","masochistyczniemeznie","mistycznie",
         "majestatycznie","mdlaco","mgliscie","mobilizujaco","makabrycznie","mdlo","miazdzaco","mocno","makiawelicznie",
         "medrkowato","miekko","morderczo","malkontentnie","megalomansko","milczaco","mrocznie","malostkowo","melancholijnie",
         "milo","mrozaco","maniakalnie","melodyjnie","milosnie","mrukliwie","markotnie","mesko","milutko","msciwie","marnie",
         "metafizycznie","mimochodem","na powitanie","niedyskretnie","nieprawomyslnienieumyslnie","na pozegnanie","niefortunnie",
         "nieprofesjonalnie","nieuprzejmie","naboznie","niefrasobliwie","nieprzekonujaconieuwaznie","nachalnie",
         "niegodziwie","nieprzychylnie","niewinnie","nadopiekunczo","niegrzecznie","nieprzyjaznie","niewolniczo",
         "naglaco","niejasno","nieprzyjemnie","niewprawnie","nagle","niejednoznacznienieprzystojnie","niewygodnie","naiwnie",
         "niekompetentnie", "nieprzytomnie","niewyraznie","nalogowo","niekonkretnie","nieprzyzwoicie",
         "niezauwazalnie","namietnie","niekontrolowanie","nierozsadnie","niezawodnie","nastrojowo",
         "niekonwencjonalnie","nierozwaznie","niezdarnie","natarczywie","niemadrze","niesamowicie","niezdecydowanie",
         "naturalnie","niemilo","nieskromnie","niezdrowo","necaco","niemilosiernie","niesmialo","niezgrabnie",
         "nedznie","niemoralnie","niespiesznie","nieznacznie","nerwowo","niemrawo","niespodziewanienieznosnie","neurastenicznie",
         "nienaturalnie","niespokojnie","niezobowiazujaco","neurotycznie","nienawistnie","niestosownie","niezrecznie",
         "niebezpiecznie","nieobliczalnie","nieswiadomie","niezrozumiale","niecenzuralnie","nieodpowiednio","nieswojo",
         "niezyczliwie","niechcacy","nieodpowiedzialnie", "niesympatycznie", "nikczemnie","niechetnie","nieoficjalnie",
         "nieszczerze","nimfomansko","niechlujnie","niepewnie","nieszczesliwie","nobliwie","niecierpliwie","niepochlebnie",
         "nieszkodliwie","nonszalancko","niedbale","niepohamowanie","nietaktownie","nostalgicznie","niedojrzale","niepokornie",
         "nietypowo","nowobogacko","niedoleznie","niepoprawnie","nieufnie","niedowierzajaconieporadnie","nieugiecie","niedwuznacznie",
         "niepowaznie","nieumiarkowanie","obcesowo","obszernie","odwaznie","optymistycznie","obelzywie","oceniajaco","oficjalnie",
         "oryginalnie","obiecujaco","ochoczo","oglednie","orzezwiajaco","oblakanczo","ochryple","ogniscie","oschle","oblednie",
         "ociezale","ohydnie","oskarzycielsko","oblesnie","oczekujaco","ojcowsko","osmielajaco","obludnie","od niechcenia",
         "okropnie","osobliwie","obmierzle","odkrywczo","okrutnie","ostentacyjnie","obojetnie","odpowiednio","olewczo","ostro",
         "obrazalsko","odpowiedzialnie", "omdlewajaco","ostroznie","obrazliwie","odpychajaco","oniesmielajaco","ostrzegawczo",
         "obrzydliwie","odrazajaco","onirycznie","oszczednie","obscenicznie","odruchowo","opiekunczo","otwarcie","obsesyjnie",
         "odstreczajaco","opornie","ozieble","paranoicznie","podniecajaco","powsciagliwie","przeosobliwie","paranoidalnie",
         "podniosle","pozadliwie","przepieknie","paskudnie","podstepnie","pozegnalnie","przepociesznie","patetycznie",
         "poetycko","pozersko","przepokornie","pazernie","pogardliwie","pracoholicznie","przepraszajaco","pedantycznie",
         "pogladowo","pracowicie","przerazajaco","perfidnie","pogodnie","praktycznie","przerazliwie","perwersyjnie",
         "pojednawczo","prawomyslnie","przesadnie","pesymistycznie","pokornie","pretensjonalnieprzeslicznie","pewnie",
         "pokracznie","problematycznieprzesmiesznie","pieczolowicie","pokretnie","profesjonalnie","przesmiewczo",
         "pieknie","pokrzepiajaco","promiennie","przespiesznie","pieprznie","polprzytomnie","proroczo","przeszywajaco",
         "pieszczotliwie","pompatycznie","prostacko","przeuroczo","pijacko","pomyslowo","prostodusznie","przewidujaco",
         "pikantnie","ponaglajaco","proszaco","przewrotnie","pilnie","ponetnie","protekcjonalnie","przez lzy","placzliwie",
         "poniewczasie","prowokacyjnie","przez zeby","platonicznie","ponizajaco","prowokujaco","przezabawnie","plebejsko",
         "ponuro","proznie","przezornie","plochliwie","poprawnie","prywatnie","przyciagajaco","plocho",
         "porozumiewawczoprzeapetycznie","przygnebiajaco","plomiennie","poruszajaco","przeatrakcyjnie","przyjacielsko",
         "plugawie","porywajaco","przebiegle","przyjaznie","plugawo","porywczo","przeblagalnie","przyjemnie","plynnie",
         "posepnie","przebojowo","przykro","po wojskowemu","poslusznie","przebrzydle","przymilnie","pobieznie",
         "pospiesznie","przeciagle","przynaglajaco","poblazliwie","posuwiscie","przecudacznie","przypadkowo","poboznie",
         "poszukiwawczo","przecudnie","przypochlebnie","pobudzajaco","potakujaco","przecudownie","przytakujaco","pochlebczo",
         "potepienczo","przeczaco","przytlaczajaco","pochlebnie","poteznie","przedrzezniajacoprzytomnie","pochmurnie","potulnie",
         "przejmujaco","przyzwalajaco","pochopnie","potulniutko","przekonujaco","przyzwoicie","pochwalnie","potwierdzajaco",
         "przekornie","psotnie","pociagajaco","potwornie","przelotnie","psychodelicznie","pocieszajaco","pouczajaco","przemadrzale",
         "psychopatycznie","pociesznie","powatpiewajaco","przemyslnie","psychotycznie","podchwytliwie","powaznie","przenikliwie",
         "purytansko","poddanczo","powitalnie","przeoblednie","pusto","podejrzanie","powoli","przeobludnie","pyszalkowato","podejrzliwie",
         "powolnie","przeobmierzle","pysznie","podle","powolutku","przeokropnie","pytajaco","radosnie","rozbrajajaco","rozrzutnie",
         "ruchliwie","raptownie","rozdzierajaco","rozsmieszajaco","rykliwie","rasistowsko","rozkazujaco","roztropnie","rytmicznie",
         "razno","rozkosznie","rozumnie","rzeczowo","refleksyjnie","rozkoszniutko","rozwaznie","rzesko","rezolutnie","rozpaczliwie",
         "rozweselajaco","rzetelnie","romantycznie","rozpraszajaco","rubasznie","sadystycznie","skwapliwie","sprezyscie","swobodnie",
         "samokrytycznie","slabo","sprosnie","sykliwie","samolubnie","slabowicie","sprytnie","sympatycznie","samotnie","slicznie",
         "srodze","systematycznie","sardonicznie","slodko","srogo","syto","sarkastycznie","slodziutko","sromotnie","szalenczo",
         "sceptycznie","slonecznie","stanowczo","szalenie","schizofrenicznieslono","starannie","szarmancko","scisle","sluzalczo",
         "starczo","szatansko","sennie","sluzbiscie","staro","szczerze","sentymentalnie","sluzebnie","stosownie","szczesliwie",
         "serdecznie","smetnie","strachliwie","szczodrobliwie","serio","smialo","straszliwie","szczodrze","siarczyscie"
            ,"smiercionosnie","strasznie","szelmowsko","silnie","smiesznie","strofujaco","szeroko","skandalicznie",
         "smutno","subtelnie","szlachetnie","skapo","soczyscie","sucho","szorstko","sklerotycznie","sowizdrzalsko",
         "sugestywnie","szpetnie","skromnie","spazmatycznie","sumiennie","sztucznie","skromniutko","spiesznie","surowo",
         "sztywno","skrupulatnie","spode lba","swarliwie","szybciutko","skrycie","spokojnie","swiadomie","szybko","skrzekliwie",
         "spolegliwie","swidrujaco","szyderczo","skrzetnie","spontanicznie","swietoszkowato","tajemniczo","tepo","transcendentalnie",
         "twardo","taksujaco","tesknie","triumfalnie","twierdzaco","taktownie","tolerancyjnie","troskliwie","tchorzliwie","tragicznie",
         "trwoznie","teatralnie","tragikomicznie","tubalnie","uciazliwie","ukradkiem","uprzejmie","uspokajajaco","uciesznie","ukradkowo",
         "uragliwie","ustepliwie","uczciwie","umyslnie","uroczo","uszczypliwie","uczenie","unizenie","uroczyscie","uwaznie","uczynnie",
         "upiornie","urzedowo","uwodzicielsko","ufnie","upokarzajaco","usilnie","ugodowo","uporczywie","usluznie","w skupieniu",
         "wieloznacznie","wrogo","wylewnie","w zadumie","wiernie","wrzaskliwie","wymijajaco","w zamysleniu","wiernopoddanczowscibsko",
         "wymownie","walecznie","wilkiem","wsciekle","wyniosle","wariacko","wladczo","wspanialomyslniewyraznie","watpiaco","wnikliwie",
         "wstretnie","wyrozumiale","wdziecznie","wnioskujaco","wstrzasajaco","wytwornie","wesolo","wojowniczo","wstrzemiezliwie",
         "wyzywajaco","wesolutko","wolniutko","wstydliwie","wzgardliwie","wiarolomnie","wolno","wybrednie","wzniosle","wiarygodnie",
         "wprawnie","wyczekujaco","wielkodusznie","wrednie","wygodnie","z apetytem","z podziwem","z wyrzutem","zdawkowo","z aprobata",
         "z pogarda","z wysilkiem","zdecydowanie","z bolem","z politowaniem","z wyzszoscia","ze skrucha","z ciekawoscia","z poplochem",
         "z zaangazowaniem","ze smakiem","z cierpieniem","z pospiechem","z zachwytem","ze smutkiem","z czcia","z potepieniem",
         "z zaciekawieniem","ze spokojem","z czuloscia","z powaga","z zadowoleniem","ze strachem","z determinacja","z powatpiewaniem",
         "z zaduma","ze swada","z dezaprobata","z przejeciem","z zafrapowaniemze wspolczuciem","z dezorientacja","z przekasem"
            ,"z zafrasowaniem","ze wstretem","z duma","z przekonaniem","z zainteresowaniem ze wstydem","z dystansem",
         "z przekora","z zaklopotaniemze wzgarda","z ekscytacja","z przerazeniem","z zaniepokojeniem","ze zdumieniem",
         "z emfaza","z przesada","z zaskoczeniem","ze zdziwieniem","z fantazja","z przestrachem","z zawiscia","ze zgroza",
         "z fatalizmem","z przygnebieniemz zazenowaniem","ze zloscia","z frasunkiem","z przyjemnosciazabawnie","ze zmieszaniem",
         "z godnoscia","z przymusem","zabojczo","ze znudzeniem","z gotowoscia","z pycha","zaborczo","ze znuzeniem","z gracja",
         "z radoscia","zachecajaco","ze zrozumieniem","z grymasem","z rezerwa","zachlannie","ze zwatpieniem","z humorem",
         "z rezygnacja","zachwycajaco","zebrzaco","z ironia","z rozbawieniem","zaciekle","zgodnie","z irytacja","z rozczarowaniem","zacnie",
         "zgorzkniale","z kpina","z rozdraznieniemzaczepnie","zgrabnie","z luboscia","z rozkosza","zadziornie","zgryzliwie","z miloscia",
         "z rozpacza","zagadkowo","zimno","z naciskiem","z roztargnieniemzagorzale","zjadliwie","z nadzieja","z rozwaga","zalosnie","zlosliwie",
         "z namaszczeniem", "z sarkazmem","zalotnie","zlowieszczo","z namyslem","z satysfakcja","zamaszyscie","zlowrogo","z napieciem",
         "z szacunkiem","zapalczywie","zlowrozbnie","z niechecia","z troska","zapamietale","zmyslowo","z niedowierzaniem","z trudem",
         "zapiekle","znaczaco","z nienawiscia","z trwoga","zapraszajaco","zniechecajaco","z niepokojem","z uczuciem","zaprzeczajaco",
         "znienacka","z niesmakiem","z ukontentowaniem","zarliwie","zniewalajaco","z niezadowoleniem","z ulga","zarlocznie","zniewiesciale",
         "z niezdecydowaniem z uporem","zarozumiale","zrecznie","z nostalgia","z uraza","zartobliwie","zrozumiale","z obawa","z usmiechem","zasadniczo",
         "zrzedliwie","z obrzydzeniem","z usmieszkiem","zasadnie","zuchwale","z oburzeniem","z uwaga","zastanawiajaco","zwawo","z oddaniem","z uwielbieniem",
         "zatrwazajaco","zwierzeco","z odraza","z uznaniem","zawadiacko","zwiezle","z odwaga","z wahaniem","zawistnie","zwinnie",
         "z okrucienstwem","z wdziecznoscia","zawodowo",
         "zwodniczo",
         "z oporem",
         "z werwa","zawziecie","zwyciesko","z ostentacja","z wesoloscia","zazarcie","zwyczajnie","z pasja","z wiara","zazdrosnie","zyczliwie",
         "z podirytowaniem","z wsciekloscia","zbereznie","zywo","z podnieceniem","z wyrachowaniem","zbywajaco" };

    return adverbs;
  }

  private String[] getAdjectives() {
    String[]
        adjectives =
        {"leniwy", "wredny", "mily","tepy","przemadrzaly","nieodpowiedzialny","nudny","zlosliwy","przystojny", "rozgarniety", "pojebany", "agresywny", "pozytywny",
         "negatywny", "pomarszczony", "opalony", "madry", "fikcyjny", "zabojczy", "zabawny",
         "smutny", "garbaty", "wysoki", "niski", "zezowaty","silny","ciekawski","wesoly","dzielny","waleczny","meski","bohaterski","odwazny","heroiczny","nieustraszony","lekliwy",
         "ulegly","niepokonany","nieugiety","nizalomny","nieustepliwy","mezny","smialy","mocny","energiczny","tęgi","krzepki","byczy","atletyczny","potężny","zdrowy",
         "głupawy","przygłupi","przygłupiasty","głupkowaty","głupiutki","bezmyślny","próżny","durny","durnowaty","idiotowaty","debilowaty","imbecylowaty","kretynowaty","gamoniowaty","matołowaty","matołkowaty","tumanowaty","cepowaty","młotowaty","głąbowaty","ograniczony","bezrozumny","bezmózgi","nieinteligentny","nierozumny","nierozgarnięty","nielotny","niemądry","nierozsądny",
         "naiwny","infantylny","dziecinny","niedojrzały","niedorosły","frajerski",
         "zmizerniały","cherlawy"};

    return adjectives;
  }

  private String[] getNames() {
    String[]
        names =
        {"Adam", "Adolf", "Adrian", "Albert", "Aleksander", "Aleksy", "Alfred", "Amadeusz",
         "Andrzej", "Antoni", "Arkadiusz", "Arnold", "Artur", "Bartłomiej", "Bartosz", "Benedykt",
         "Beniamin", "Bernard", "Błażej", "Bogdan", "Bogumił", "Bogusław", "Bolesław", "Borys",
         "Bronisław", "Cezary", "Cyprian", "Cyryl", "Czesław", "Damian", "Daniel", "Dariusz",
         "Dawid", "Dionizy", "Dominik", "Donald", "Edward", "Emanuel", "Emil", "Eryk", "Eugeniusz",
         "Fabian", "Feliks", "Ferdynand", "Filip", "Franciszek", "Fryderyk", "Gabriel", "Gerard",
         "Grzegorz", "Gustaw", "Henryk", "Herbert", "Hilary", "Hubert", "Ignacy", "Igor",
         "Ireneusz", "Jacek", "Jakub", "Jan", "Janusz", "Jarosław", "Jerzy", "Joachim", "Józef",
         "Julian", "Juliusz", "Kacper", "Kajetan", "Kamil", "Karol", "Kazimierz", "Klaudiusz",
         "Konrad", "Krystian", "Krzysztof", "Lech", "Leon", "Leszek", "Lucjan", "Ludwik", "Łukasz",
         "Maciej", "Maksymilian", "Marceli", "Marcin", "Marek", "Marian", "Mariusz", "Mateusz",
         "Michał", "Mieczysław", "Mikołaj", "Miłosz", "Mirosław", "Nikodem", "Norbert", "Olaf",
         "Olgierd", "Oskar", "Patryk", "Paweł", "Piotr", "Przemysław", "Radosław", "Rafał",
         "Remigiusz", "Robert", "Roman", "Rudolf", "Ryszard", "Sebastian", "Seweryn", "Sławomir",
         "Stanisław", "Stefan", "Sylwester", "Szymon", "Tadeusz", "Teodor", "Tomasz", "Wacław",
         "Waldemar", "Wiesław", "Wiktor", "Witold", "Władysław", "Włodzimierz", "Wojciech",
         "Zbigniew", "Zdzisław", "Zenon", "Zygmunt"};

    return names;
  }

  private String getRandom(String[] s) {
    String ss = s[randomGenerator.random(0, s.length - 1)];
    return ss.substring(0, 1).toUpperCase() + ss.substring(1).toLowerCase();
  }

  public String getRandomName() {
    return getRandom(getAdverbs()) + " " + getRandom(getAdjectives()) + " " + getRandom(getNames());
  }

  public static void main(String[] args) {

    CreatureNameGenerator cng = new CreatureNameGenerator();

    for (int i = 0; i < 20; i++) {
      System.out.println((i + 1) +  " - " + cng.getRandomName());
    }
  }
}
