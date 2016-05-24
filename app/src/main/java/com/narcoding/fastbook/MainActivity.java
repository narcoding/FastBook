package com.narcoding.fastbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btndur,btngbd,btnbsm,btnbulmak,btnoku,btnhizli,btnyavas,btncokh,btnzen;
    int j=0,k=0;
    int cokh=150;
    int hizli=200;
    int yavas=400;
    int surat=300;
    String s,s1,s2,s3,s4;

    //String[] split;



    String[] words;

    private void init(){
        textView= (TextView) findViewById(R.id.txt);
        btndur= (Button) findViewById(R.id.btndur);
        btnbsm= (Button) findViewById(R.id.btnbsm);
        btngbd= (Button) findViewById(R.id.btngbd);
        btnbulmak= (Button) findViewById(R.id.btnbulmak);
        btnoku= (Button) findViewById(R.id.btnoku);
        btnhizli= (Button) findViewById(R.id.btnhizli);
        btnyavas= (Button) findViewById(R.id.btnyavas);
        btncokh= (Button) findViewById(R.id.btncokh);
        btnzen= (Button) findViewById(R.id.btnzen);



        s4="Özet olarak Zen, insanın kendi iç varlığını, iç yapı¬sının derinliğini görebilme sanatıdır; bağımlılıktan öz¬gürlüğe götüren yoldur. Bize doğrudan yaşam çeşmesin¬den içme olanağı verir, böylece de biz insanların ölümlü yaratıklar olarak hemen hemen kesintisiz, sürekli acı çekmemize neden olan boyunduruklardan bizi kurtarır. Hepimizin içinde yeterli oranda ve doğal olarak var olup da normal koşullar altında etkin olabilmek için uygun bir yol bulamadığından sıkışıp kalmış, yamulmuş olan enerjinin açığa çıkmasını sağladığı söylenebilir.\n" +
                "İçinde gizemli bir gücü saklayan şu gövdemiz, bir akümülatöre benzer. Bu güçten gereği gibi yararlanıl¬mazsa bayatlar, giderek etkinliğini yitirir; ya da bozu¬lur, düzenden çıkar, bozuk düzen çalışır. Bunun için Zen’in amacı aklımızı kaçırmaktan, zihinsel olanakla¬rını yeterince kullanamayan bir yarım adam, bir kötü¬rüm olmaktan bizi kurtarmasıdır. Özgürlük dediğim za¬man anlatmak istediğim şey, içimizde doğal olarak var olan bütün yaratıcılığa, iyiliğe dönük tepilere kendile¬rini açığa vurmak olanağı tanımak anlamındadır. Mut¬lu olabilmek, birbirimize sevgi duyabilmek için bütün yeteneklerimiz var da, genellikle bu gerçeğe gözlerimizi kapıyoruz. Çevremizde gördüğümüz bütün bu çekişme¬ler, bu itiş-kakışın kökeninde cahillik yatıyor. İşte bu¬nun için Zen bizden, şimdiye kadar bize kapalı kalmış ve cahilliğimiz yüzünden düşlemeye bile olanak bulama¬dığımız alanları görmemizi sağlayacak, Budistlerin de¬yimiyle, «üçüncü gözümüzü» açmamızı istiyor. Cahillik yüzünden oluşmuş bulutlar, sisler bir kere dağılırsa gök¬lerin uçsuz bucaksızlığı gözlerimizin önüne seriliverir. Böylelikle ilk kez kendi varlığımızın iç yapısını görüp tanıyabiliriz. O zaman yaşamın ne olduğunu kavraya¬bilir, bir kör dövüşü ya da kaba güçlerin rastlantısal bir gösterisi olmadığını anlayabiliriz. Bunun yanında ya¬şamın asıl gerçek amacını kesin olarak bilemesek de yaşamın içinde bizi son derece mutlandıran, yaşadığı¬mız sürece soru sormadan, kötümser kuşkulara kapıl¬madan yetinebileceğimiz bir şey olduğunu da farkedebiliriz.\n" +
                "İçimiz yaşamla dopdoluyken de yaşamın bilişine tam olarak uyanmadıkça şu anda ortaya çıkmamış da olsa, şimdilik uykuda da olsa, yaşamın içinde var olan çelişkilerin, çekişmelerin ne denli önemsenmesi gerek¬tiğini anlayamayız. Ama er geç yaşamı göğüslememizin, en zorlu, en karışık bilmecelerini çözmemizin zamanı ge¬lecektir. Konfiçyus «On beş yaşında zihnimiz araştır-maya, incelemeye yönelir, otuz yaşında nerede duracağı¬mızı biliriz» demiş. Bu söz Çinli bilgenin en bilgece söz¬lerinden biridir. Bütün ruhbilimcilerin onun bu sözle¬rini onaylayacaklarından hiç kuşkum yok. Gerçekten aşağı yukarı onbeş yaş, gençlerin çevrelerine araştırıcı gözlerle bakmaya başladıkları, yaşamın anlamını anla¬maya çalıştıkları yaştır. O zamana kadar zihnin bilinç¬altı bölümünde sıkı sıkı korunmakta olan bütün ruhsal güçler hemen hemen bir anda birdenbire boşanıverirler. Bu boşanma ne kadar hızlı, ne kadar bayır aşağı olursa o derece uzun süreli ya da süresiz olarak zihnin denge¬sini bozabilir. Gerçekten ergenlik çağında ortaya çıkan ruhsal yıkıntı durumlarının o kadar çok oluşu bu ne¬denlerle zihinsel dengenin yitirilmesine bağlanabilir. Olayların çoğunda bozukluk pek ağır olmayabilir ve bu¬nalım derin izler bırakmadan yok olabilir. Ama bazı kim¬selerde ya yaradılıştan gelen eğilimler ya da çevresel et¬kilerin zihinlerini biçimlemiş olması yüzünden ruhsal uyanım sırasında kişiliklerinin en derin yerlerini bile etkileyecek çalkantılar olur. Bu yaşta sizden her zaman için geçerliliğini sürdürecek bir «evet» ya da «hayır» yanıtından birini seçmeniz bekleniyor. Konfiçyus’un araştırma, inceleme diyerek anlatmak istediği şey işte bu seçimdir. Konfiçyus kitaplarda yazılı olanların araş¬tırılıp incelenmesinden değil, derinlemesine yaşamın giz¬lerinin araştırılıp incelenmesinden söz etmek istiyor.\n" +
                "Genellikle iç çatışma sonunda varılacak sonuç her zaman için geçerliliğini sürdürecek bir «evet» yanıtıdır ya da «olacağın olmasına boyun eğmek, karşı koymamak¬tır»; yaşam kötümserler için bile olumsuz yanından tu¬tulmuş, değerlendirilmiş bile olsa, ne de olsa bir onama, bir olumlamadır. Ama gene de şu dünyada duygulu kimseleri öbür yöne çevirecek ve Andreyev’in «İnsanın Yaşamı» adlı kitabında yaptığı gibi şöylece bağırtacak bir şeyin de var olduğunu yadsıyamayız. «Bize verdiğin her şeye lânet olsun; doğduğum güne de, öleceğim gü¬ne de lânet olsun; ey deli bozuk Yazgı! Her şeyi suratı¬na gerisin geri fırlatıp atıyorum; lânet sana, lânet sa¬na, lânet! Bu lânetlerimle sana üstün geliyorum. Bana daha başka ne yapabilirsin?.. Son anımda da senin o eşek kulaklarına, lânet sana! Lânet, diye haykıraca¬ğım.» Bu sözlerle yaşam korkunç bir biçimde suçlanı¬yor, yaşama tam anlamıyla karşı çıkılıyor. İnsanın bu dünyadaki yazgısının en karamsar biçimde çizilen bir resmi bu... «Hiç bir iz bırakmamak», gerçekten doğru bir söz, geleceğimiz konusunda tek bildiğimiz üzerinde yaşadığımız bu dünya da içinde olmak üzere hepimizin geçip gidip yok olacağımız. Kuşkusuz bunlar karamsar¬lığı haklı gösterecek nedenler.\n" +
                "Yaşam çoğumuzun yaşadığı biçimiyle acı çekmek, tasalara katlanmaktır. Bu gerçeği yadsıyamayız. Yaşam bir itiş kakış, bir çatışma, bir çekişme olduğu sürece acıdan, tasadan başka bir şey getirmiyor. Çatışma de¬mek iki karşıt gücün ötekine üstün çıkmak için savaş¬maları demek değil mi? Savaşta yenik düşmenin sonu¬cu ölüm olabilir; dünyada en korkulacak şeyse ölüm¬dür. Ölüm yenilgiye uğratılsa bile insan yalnız kalır. Yalnızlığa katlanmaksa çatışmayı sürdürmekten bile daha katlanılmaz bir şey... İnsan bunlann bilincinde olmayabilir, duyuların sağladığı anlık zevklerin, keyifle¬rin tadını çıkarmanın peşinde olabilir. Ama bunlann bilincinde olup olmamak yaşam gerçeğini değiştirmez. Körler dirençle güneşin varlığını yadsıyabilirler, ama böyle yaparak güneşi yok edemezler. Güneyin kızgın güneşi acımasızca onları kavurabilir, gereken önlemleri almazlarsa bu dünyadan silinip giderler.\n" +
                "Buda, birincisi yaşamın acı çekip tasalara katlan¬mak olduğunu vurgulayan «Dört soylu gerçeği» ortaya koyduğu zaman çok haklıydı. Hepimiz bu dünyaya ba¬ğıra çağıra, bir anlamda karşı koyarak, karşı çıkarak gelmiyor muyuz? Ana karnının sıcak yumuşak ortamın¬dan sonra bu soğuk, engellerle dolu çevreye çıkıvermek en azından acılı bir rastlantı. Büyüme, acıyı da yanın¬da getiriyor. Diş çıkarma az ya da çok acılı bir süreç...\n" +
                "Erginlik (büluğ) zihinde de, gövde de birtakım çalkan¬tılara neden oluyor. Toplum adı verilen organizmanın da gelişmesi acılı büyük değişimlerle olabiliyor. Çağı¬mızda da böyle acılı doğum sancılarına tanık oluyoruz. Sakin sakin oturup bunların kaçınılmaz şeyler olduğu¬nu, her yeni yapının eski düzenin yıkılmasını gerektir¬diğini, bu acılı işlemlerden kurtulmanın bir yolu olma¬dığını düşünebiliriz. Ama böyle soğukkanlı, akılcı çö¬zümlemeler bu işlemlerin bizi sürükleyeceği acılı duy-guların gücünü azaltmaya yetmez. Sinir dokumuza öy¬lesine acımasızca işlemiş olan acı giderilemez. Bu konu¬da ne dersek diyelim, yaşam acılı bir itiş-kakış, bir bo¬ğuşma, çekişmeden başka nedir ki?\n" +
                "Bunun böyle olması, yazgının değiştirilmez çizgisi. Ne kadar çok acı çekilirse karakter de o kadar derin¬lemesine gelişiyor. Karakteriniz ne kadar derinlemesine gelişirse yaşamın gizemlerine o kadar derinlemesine gi¬rebiliyorsunuz. Bütün büyük sanatçılar, bütün büyük din önderleri bütün büyük toplum düzeltimcileri (re¬formcu) çok defa gözyaşlarıyla, kanayan yürekleriyle, gözüpeklikle sürdürdükleri bu savaşımların en zorlula¬rından başarıyla çıkmışlardır. Ekmeğinizi acıyla, gönül üzüntüsüyle, kaygıyla kazanmadıkça gerçek yaşamın tadına varamazsınız. Mencius, Tanrı bir kimseyi eksik¬siz, yetkin bir insan yapmayı aklına koydu mu, sonunda bütün acılı sınavlardan başarıyla çıkabilmesi için onu akla gelebilecek her türlü deneyden geçirir dediği za¬man çok haklıydı.\n" +
                "Bana her zaman Oscar Wilde, karşısındakileri etki¬lemeye çalışan yapmacıklı bir kimseymiş gibi gelir. Bü¬yük bir sanatçı olabilir ama onda benim zevkime uyma¬yan bir şey var. Gene de De Profundis'te «Bu son aylar içinde korkunç güçlüklerle, sıkıntılarla boğuştuktan son¬ra acının derinliklerinde saklı öğretilerden bazılarını an¬lamaya başladım. Din adamları ya da sözleri derin an-lamına bakmadan kullanan bazı kimseler acı çekmek¬ten sanki bir gizemmiş gibi söz ederler. Gerçekten Tanrı¬sal bir açıklama var acının içinde, insan daha önceleri anlayıp, ayırt edemediği şeyleri ayırıp anlamaya başlı¬yor, tarihin tümüne başka bir bakış açısından yaklaşı¬yor.» diye haykırıyordu. Bu sözlerden mahpusluk ya¬şamının karakteri üzerinde nasıl yüceltici bir etki yap¬mış olduğunu gözleyebiliyoruz. Eğer yazarlık mesleğinin başında benzer bir deneyden geçmiş olsaydı şimdiki du¬rumda vermiş olduklarından çok daha üstün yapıtlar verebilirdi.\n" +
                "Varlığımız benlik çekirdeğinin çevresinde oluşuyor. İçinde mahpus olduğumuz benlik kabuğunu çatlatıp dışına çıkmak hemen hemen olanaksız. Bizim bu ka¬buğu çocukluktan, ta bu dünyayı bırakıp gittiğimiz ana kadar sürekli olarak taşıyıp durdurduğumuzda kuşku yok. Gene de bu kabuğu çatlatabilmemiz için birçok fır¬satlar var elimizde ve bunların ilki ve en büyüğü de ergenlik çağında... Bu çağda ilk defa ben, kendi dışın¬da bir kimseyle gerçekten ilgilenmeye başlıyor. Bu söz¬lerimle cinsel sevgiyi söz konusu etmek istiyorum. Ben¬lik bütünlüğünü, birliğini sürdürürken bir yandan da içinde bir bölünme duygusu beliriyor. Şimdiye dek yü¬reğinde uyur durumda olan sevgi gözlerini açıp doğrulu¬yor, böylece de büyük çalkantılara neden oluyor. Çün¬kü sevgi hem bencil istekleri hem de benliği silip yok etmek isteğini kışkırtıyor. Sevgi, sevdiği kimsede benli¬ğin yok olup erimesini zorlarken, bir yandan da sevdiği kimsenin yalnız kendisinin olmasında diretiyor. İşte bu¬rada büyük bir çelişki var ve bu çelişki yaşamın büyük bir ağlatısı (trajedi). Bu temel duygu insanın yücel-mesinde Tanrısal bir araç olmalıydı. Tanrı ağlatıları in¬sanı yetkinleştirip eksiksiz yapmak için düzenler. Bu dünyada edebiyatı oluşturan yapıtların büyük çoğunlu¬ğu hep bu sevgi telinden ses çıkarmaya çalışıyor, gene de bu tür yazından usanmıyoruz ama şimdi konumuz bu değil. Burada sırası gelmişken anlatmak istediğim şey içimizde sevgi uyanırken bir göz kırpma süresince göz ucuyla eşyanın ötesindeki sonsuzluğu görüp kaybet¬miş olduğumuzdur. Bu bir anlık bakış gençleri yaradı¬lış özelliklerine, çevre ve eğitimin etkisine göre ya co- şumculuğa (romantizm) ya da akılcılığa (rasyonalizm) itiyor.\n" +
                "Benlik kabuğu çatlatılıp «başka bir kimse» içeri alındığı zaman benlik kendini yadsımış ya da benlik sonsuza doğru ilk adımlarını atmış oluyor. Dinsel açı¬dan burada sonluyla sonsuz arasında, akılla daha yük¬sek yetenekler arasında, ya da daha açıkça gövdeyle ruh arasında zorlu bir kavganın oluştuğu söylenebilir. İşte içtenlikle sürdürülen bu çekişme, bu boğuşma, ça¬balama, bu zorlanma Konfiçyus’un insanın o yaşta ne¬rede duracağını bilebileceğini söylediği otuz yaşlarına kadar sürüp gidiyor. Artık bu yaşta dinsel bilinç tam olarak uyanmış oluyor, bu çekişme, bu boğuşma, bu ça¬balamadan kendini kurtarmak, bu zorlamalara bir son verebilmek için insan her yönde her türlü yolu araştır¬maya başlıyor. Kitaplar okuyor, bu konulardaki konuş¬malara, tartışmalara katılıyor, vaazları büyük bir aç¬lıkla benimsiyor, birçok dinsel uygulamalar ya da sis-temler deniyor. Bu arada kuşkusuz başvurulabilecek bir yol olarak Zen de var.\n" +
                "Zen sorunların sorununu nasıl çözüyor? Her şey¬den önce Zen, kitaplardan edinilecek bilgilerle değil de kişisel yaşantılardan çıkan gerçeklere dayanarak, doğrudan, dolaysız olarak sorunları çözümlemeyi öne¬riyor. Sonluyla sonsuz arasındaki çekişmenin sürüp gittiği insan varlığının iç yapısının kavranabilmesi akıldan daha üstün bir yeteneği gerektiriyor. Zen diyor ki, akıl kendisinin yanıt bulamayacağı sorular or¬taya atıyor, bu nedenle bu sorulara yanıt bulabilecek akıldan daha üstün daha aydınlatıcı bir yeteneğin or¬taya çıkabilmesi için aklı  bir yana itmekten başka seçenek yok. Çünkü aklın gönül esenliğini bozan, huzur kaçıran bir özelliği var. Zihnin dirliğini, esenliğini bo-zacak sorular ortaya koyuyor da çok kez bunlara doyu¬rucu, kandırıcı yanıtlar bulmakta başarılı olamıyor; ca¬hilliğin verdiği o mutlu iç barışı altüst ediyor da onun yerine başka bir şey getirip bozduğu düzeni yeniden sağ¬layamıyor. Cahillikten gelen yanılgıları meydana çıkar¬dığı için çok kez aydınlatıcı, ışık tutucu olarak nitele¬niyor. Ama gerçek şu : Zihni içine düşürdüğü çıkmazlar¬dan kurtarabileceği yolu aydınlatması her zaman akıl¬dan beklenemiyor. Kuşkusuz akıl en son, en doğru çö¬zümü gösterecek bir araç değil. Sonuçlarının ne olaca¬ğına, bir çözümü olup olmadığına aldırmadan ortaya attığı soruları kendinden daha üstün bir şey çıksın da çözsün diye bekliyor. Eğer ortaya koyduğu açmazları, çıkmazları bir kerede, kesin ve şaşmaz bir çözüme ulaş¬tırabilecek yeni bir düzen getirebilme gücünde olsaydı onları Aristo ya da Hegel gibi bir düşün adamı bir kez bir sisteme bağladıktan sonra bir daha felsefeye gerek kalmayacaktı. Oysaki düşünce tarihi olağan üstü akıl gücü olan kimselerce kurulmuş her düşünce anıtını ar¬kadan gelenlerin yıkmayı başardıklarını kanıtlıyor. Böy¬le düşünce anıtları kurup sonra onları yıkmaya, konu¬ya salt felsefe açısından bakınca karşı çıkmak için bir nedenimiz olmayabilir; çünkü anladığım kadarıyla ak¬lın yapısı bunu zorluyor. Nasıl nefes alıp vermeyi durdurtamazsak ortaya yeni sorular çıkarmak onlara ya¬nıtlar aramak yollu felsefedeki gelişmeyi de durduranla¬yız. Ama yaşam konusuna gelince aklın böyle bir şeye gücü yetmiş bile olsa en son ve kesin yanıtı bulsun diye bekleyemeyiz. Yaşamsal eylemleri felsefenin yaşamın gizlerini açığa çıkartmasını bekleyerek bir an bile gecik¬tiremeyiz. Gizler olduğu gibi kalsa da biz yaşamak zo¬rundayız. Aç adam yiyeceklerin tam bir çözümlemesi (analiz) yapılsın, yiyeceğin içindeki her elemanın ayrı ayrı besin değeri anlaşılsın diye bekleyemez. Açlıktan ölmüş bir kimseye besinler konusundaki bilimsel bilgile¬rin bir yararı dokunmaz. Bunun için de Zen en derin sorunlara çözüm bulmak için akıldan destek aramıyor.\n" +
                "Ortaya çıkabilecek gerçeğin türüne aldırmadan, ilk elden, aracısız, kişisel yaşantıyla gerçeklerin üstüne üs¬tüne yürümeyi amaçlıyor. Pek sevdiği bir örnekseme şöyle; ay’ı göstermek için bir parmağa gerek var, ama parmağı ay sananlara yazıklar olsun! Balığı eve getir¬mek için bir sepet gerekli; ama bir kere balık sofraya geldi mi niçin sepeti kendimize dert etmeli? İşte gerçek önümüzde durup duruyor onu öylesine doğrudan çıplak ellerimizle yakalamalıyız ki ellerimizin arasından kayıp kaçmasın. Zen’in önerisi bu. Nasıl doğa hava boşluğu¬nu sevmezse Zen de gerçekle aramıza giren hiç bir şey¬den hoşlanmaz. Zen’in görüşüne göre gerçek, gerçek ola¬rak ele alınınca sonluyla sonsuz arasında, gövdeyle ruh arasında bir çekişme konusu kalmıyor. Bunlar aklın ken¬di işini yürütmek için ortaya attığı yararsız, kurgusal ay¬rımlardan başka şeyler değil. Bunları çok önemseyenler ya da bunları yaşamın asıl gerçekleri sananlar parmağı ayın yerine koyanlardır. Acıkınca yeriz, uykumuz gelin¬ce de uyumak için yatağa gireriz. Sonluyla sonsuz bu-rada nereden işin içine giriyor? Biz kendi kendimizle ve hepimiz ayrı ayrı bir bütün değil miyiz? Yaşam yaşan¬dığı biçimiyle de yeterli. Ancak kuşkular yaratan, keyif kaçıran akıl işin içine burnunu sokupta yaşamı öldürme girişiminde bulununca yaşamayı bırakıyoruz hep yaşa¬maya başlamak için ya kendimizde, ya çevre koşulla¬rımızda bir eksiğimiz varmış gibi kurgulara kaptırıyo¬ruz kendimizi. Aklı bir yana bırakmalıyız. Elbet aklın da yararlı olduğu, işe yaradığı bir alan vardır. Ama bıraka¬lım da akıl yaşam adını verdiğimiz akarsuyun akımını engellemesin. Eğer bu akımı izlemek istiyorsanız onun akışına karşı koymadan izleyin. Yaşamın akım içinde olması olgusu koşullar ne olursa olsun önlenmemeli, bu akışa karşı konulmamalıdır; elinizi içine daldırdığınız anda saydamlığı yok olur, bulanıverir, onun yüzeyinde ta en baştan beri görmekte olduğunuz ve ta zamanın sonu gelene dek göreceğiniz imgenizi görmez olursunuz.\n" +
                "Zen’de de hemen hemen Nichiren Budist Okulun¬daki dört ana özdeyişe karşılık tutabileceğimiz dört ana bildiri var.\n" +
                "«Yazılara, sözlere bağlanmadan \n" +
                "Kutsal yazıların dışında özel bir iletişim \n" +
                "İnsan ruhuna doğrudan bir yaklaşım    \n" +
                "Gerçek yaradılışını tanıyıp Budalığa ulaşmak»\n" +
                "\n" +
                "Bu sözler bir dinsel sistem olarak Zen’in bütün öğ¬retisini özetliyor. Kuşkusuz bu yürekli sözlerin tarih¬sel bir tabana oturduklarını gözden kaçırmamak gerek¬li. Zen’in Çin’e tanıştırıldığı dönemde Budistlerin büyük çoğunluğu fizikötesi sorunları tartışmayı hemen hemen bir tiryakilik durumuna getirmişlerdi; ya da yalnızca Buda'nın ortaya koyduğu ahlaksal kurallara uymakla veya dünyalık şeylerin gelip geçiciliğini gözlemekle ge¬çirilen tembelce bir yaşamla yetinmişlerdi. Ama hiç bi¬risi, aklın ya da zihnin imgeleme gücünün bu boş ça¬balarının ötesinde akmakta olan asıl büyük yaşam ger¬çeğini kavramayı başaramamışlardı. Bodhi-Dharma ve ardılları durumun böylesine acıklı olduğunun farkına vardılar. Bu nedenle de yukarda belirttiğimiz Zen’in dört ana bildirisini düzenlediler. Bu sözlerle en kısa yol¬dan Zen’in insana iç varlığının yapısını tanıtmak için kendine özgü bir yolu yordamı olduğunu göstermeyi amaçlıyorlardı. Ta ki insan iç varlığının yapısını tanı¬yıp Buda'lığa ulaşabilsin; böylece de aklın neden oldu¬ğu çelişkiler ve karmaşa daha üst düzeydeki bir bütün¬leşme içinde uyum içine girebilsin.\n" +
                "Bu nedenledir ki Zen hiç bir zaman açıklamaz, işaret etmekle yetinir, ne lâf ebeliğine başvurur, ne de genellemelere girişir, yalnız ele göze gelir somut ger¬çeklerle ilgilenir. Mantık açısından bakınca Zen çelişki¬lerle, gereksiz yinelemelerle dolu gibi görünebilir. Ama Zen her şeyin üstünde kalmayı, kendi yolunda kaygusuzca ilerlemeyi başarır, bir Zen ustasının şu sözlerle çok iyi dile getirdiği gibi «Bohçasını ucuna astığı, ken¬di yonttuğu sopası omuzunda, ardarda yükselen dağ¬ları bir bir aşar gider.» Mantığa karşı çıkmaz, yaptığı tek şey, gerisinde kalan her şeyi kendi yazgısıyla baş¬başa bırakıp gerçeklerin yolundan yürümektir. Mantık kendi işlerini bırakıp da Zen’in yürüdüğü yola girmeye kalkacak olursa o zaman kendi ilkelerini açıkça ve se¬sini yükselterek ortaya koyar ve içeri zorla girmeye kal¬kan zorbayı da tuttuğu gibi dışarı atar. Zen hiç bir şeye düşman değildir, Zen’in amacına ulaşmasında bazan yardımı dokunabilecek olan akla karşı çıkması için de hiç bir neden yoktur. Zen’in yaşamın temel gerçekle¬rine doğrudan, dolaysız yaklaşımını, örneklemek için aşağıdaki öyküleri seçtim :\n" +
                "Rinzai  (Lin-chi) bir gün şöyle bir vaaz vermiş: «Duyu organlarınızın kapısından girip çıkan, çıplak eti¬nizin ardında saklanan ünü sanı olmayan gerçek bir adam yaşıyor. Bu olguyu görmemiş olanlar bakın! Ba¬kın!» demiş. Bir keşiş gelip sormuş. «Peki kimmiş o ünü sanı olmayan adam?» Rinzai hasır sandalyesinden fır¬lamış, keşişin yakasına yapışıp başlamış bağırmaya, «Sen söyle! Sen söyle!» keşiş duraksayıp ne söyleyeceğini bi¬lemeyince usta yakasını bırakmış «Meğer o ünü sanı ol¬mayan adam ne değersiz bir kıtıkmış?» demiş ve doğru odasına gitmiş.\n" +
                "Rinzai öğrencilerine karşı kaba ve açık sözlü tutu¬muyla ün yapmış bir ustaymış genellikle öyle yumuşak huylu, gevşek ustaların özelliği olan dolaylı, dolambaçlı yöntemleri hiç sevmezmiş. Bu açık sözlülüğünü herhalde Budizm’in temel ilkesi nedir diye soru sorduğu için üç kez dayak yediği ustası Obaku’ya (Huang-Nieh) borçlu olmalı. Zen’in soru soranlara tokatı basıp tartaklamak¬tan başka bir şey olmadığını sanmak kuşkusuz büyük bir yanlış olur. Eğer bunları Zen’in temel öğeleri olarak alırsanız ay’ı parmak sanan adamın düştüğü kadar bü¬yük bir yanılgıya düşmüş olursunuz. Her şey için bu böyledir ama özellikle Zen’de dış görünümler, dış gös¬teriler en son ve kesin gerçek olarak alınmamalıdır. Bütün bunlar gerçekleri arayacağımız yolu parmakla gös¬termeye yarayan şeylerdir. Onun için bu işaretler önem¬lidir, onlar olmadan pek ileri gidemeyiz. Gene de bir tu¬zak ağına benzeyen bu şeylere bir kez takıldınız mı so¬nunuz geldi demektir; bir daha Zen’i anlamanız olana¬ğı kalmaz. Bazıları Zen’in sizi bir mantık tuzağıyla ya da sözcüklerden kurulmuş bir kapanla yakalamaya ça¬lıştığını sanabilirler. Bir kere ayağınız kaymayacak ol¬sun, sonsuza dek kendinizi kurtaramazsınız, yüreğinizin elde etmek için öylesine çırpındığı özgürlüğünüzü bir daha kazanamazsınız. Rinzai hepimizin önünde durup duran şeyi maşa kullanmadan doğrudan elleriyle yaka¬lamayı başarmış. Eğer sürekli olarak saydamlığını sür¬düren bir üçüncü gözümüz açılıvermiş olsa Rinzai’nin bizi nereye götürmek istediğini kesinlikle görüp anla¬yabileceğiz. Bunun için de her şeyden önce Ustanın benliğine girmeli oradaki adamla tanışıp anlaşmalıyız. Ne kadar söz edilirse edilsin sözlerle yapılacak açıkla¬malar bize kendi iç varlığımızı tanıtmaya yetmez. Ne kadar açıklamaya çalışırsanız o kadar anlamayı zorlaş¬tırır. Kendi gölgenizi yakalamaya çalışmak gibi bir şey bu. Siz yakalamak için arkasından koştukça o da aynı hızla sizden kaçacaktır. Bir kere bu gerçeği kavrayabil¬diniz mi o zaman Rinzai’nin, Obaku’nun benliğine gi¬rebilir onların. O sert görünümlerinin ardında ne ka¬dar iyi yürekli olduklarını değerlendirebilirsiniz.\n" +
                "T’ang soyu döneminin sonlarına doğru yaşamış bir Zen ustası olan Ummon  (Yun-men) kendi önemsiz varlığı da içinde olmak üzere tüm evreni oluşturan ya¬şamın temel öğelerini öğrenebilmek için bir bacağından olmuştu. Ummon, Rinzai’nin ilk öğrencilerinden biri olan Öğretmeni Bokuju'nun (Mu-chou) yanına girebilmek için üç kez gitmek zorunda kalmış. Usta «Adın ne?» di¬ye sorunca «Adım Bun-yen (Wen-yen)» diye yanıt ver¬miş. (Ummon’un asıl adı Bun-yen’miş, Ummon sonra¬ları yaşadığı manastırın adıymış.) Gerçeğin peşinde bir arayış içinde olan keşiş tam içeri girerken usta şöyle bir göğüsleyip yakasına yapışmış. «Konuş! Konuş!» di¬ye diretmiş. Ummon duraksayınca «Seni gidi on para etmez herif!» diyerek kapıdan dışarı itmiş, kapıyı da olanca hızıyla kapayınca Ummon’un bacağı kapının arasında kalıp kırılmış. Bacağının kırılmasından duy¬duğu şiddetli acı adamcağızın hayatın en büyük ger¬çeklerine uyanmasını sağlamış. Ondan sonra bir şeyler öğreneceğim diye şunun bunun peşinde dolaşan, ken¬dini acındırmaya çalışan zavallı bir keşiş olmaktan vaz¬geçmiş; bacağını yitirmek pahasına da olsa gerçeği böy¬lece kavramış olmak kaybını fazlasıyla karşılamış. Um¬mon bu konudaki tek örnek değildir. Zen’in tarihinde gerçeği bulabilmek için gövdesinin bir parçasını feda etmeye istekli olan pek çok kimseye rastlanıyor. Kon- fiçyus «Eğer bir adam sabahleyin Tao’yu anlamayı ba¬şarırsa aynı günün akşamı ölmüş de olsa bunu kutla¬nacak bir yaşam diye niteleyebiliriz,» demiş. Bazı kim¬seler öyle rastgele yaşamakla, bitkisel ya da hayvansal yaşamla karşılaştırınca asıl gerçeği kavrayabilmiş ol¬manın daha değerli olacağının duyarlılığındadırlar. Ama bu dünyada yazık ki ne kadar çok cahillik ve nefis düş¬künlüğü çamurunda yuvarlanan yaşayan cesetler var.\n" +
                "Bu alaylı aşağılatıcı sözler neden? Bu acımasızlık görünümü neden? Zen’in anlaşılması en güç olan yanı burası. Ummon bir bacağından olmayı haketmek için ne gibi bir yanlış yapmıştı? Ummon aydınlanmak için ustasından yardım isteyen, büyük bir içtenlikle gerçe¬ğin peşinde koşan bir keşişti. Öğretmeninin ona Zen’in ne olduğunu öğretebilmesi için üç kez geri çevirmesi, kapıyı araladıktan sonra da insanlığa sığmayacak bi¬çimde, öylesine hızla kapatması mı gerekliydi? Ummon¬un o kadar istekle öğrenmek istediği Budizm’in asıl ger¬çeği bu muydu? Ama işin asıl şaşırtıcı yanı, sonucun ikisinin de isteklerine uygun düşmesi. Öğretmen öğren¬cisinin kendi varlığının gizlerine bir içgörü kazanmış ol¬duğunu görüp kıvanç duyuyor; öğrenciye gelince o da kendisine yapılmış olan her şeyden hoşnutluk duyuyor. Açıkçası Zen dünyanın en akıl almaz, en anlaşılmaz şe¬yi. Bunun için daha başta Zen’in mantıksal çözümlere, akılcı işlemlere konu yapılamayacağını söylemiştim. Zen’in varlığımızın en iç, en derin yerinde doğrudan, aracısız, kişisel yaşantıya dönüştürülmesi gerekli. Tıp¬kı karşılıklı konmuş iki lekesiz ayna nasıl birbirlerini yansıtıyorsa bizim iç varlığımızla gerçek de karşı karşı¬ya gelebilmeli. Ancak bu böyle olunca yaşamı yakala¬yabilmemiz, gerçeğin nabız atışlarını duyabilmemiz ola¬nak içine girer.\n" +
                "Bu sağlanana dek özgürlük boş bir sözcükten ileri bir şey olamaz. İlk hedef bütün sonlu varlıkların ken¬dilerini bağladığını farkettikleri bağlardan, boyunduruk¬lardan kendimizi kurtarmaya çalışmaktır. Eğer elimizi kolumuzu bağlayan cahilliğin zincirlerini koparamazsak kurtuluşu nerede arayabiliriz? Cahilliğin zincirleri akıl¬dan ve nefse düşkünlükten gelen zorunluluklardan olu¬şuyor. Onun için bu zincirler zihnimizden geçen her dü¬şünceye, içimizde barındırdığımız her duyguya takılıp kalıyor, zincirleniyor. Zen ustalarının pek yerinde yap¬tıkları bir benzetiyi kullanırsak bunlar ıslak çamaşırlar gibidir, gövdemize yapışıp kaldıklarından kolay kolay çıkarıp atamayız. «Eşit ve özgür doğuyoruz», toplum¬sal ya da siyasal açıdan bunun anlamı ne olursa olsun, Zen bu sözün insanın ruhsal yapısı konu edildiğinde yüzde yüz doğru olduğunu savunuyor. Elimize ayağımı¬za dolandığını farkettiğimiz bütün zincirler, kelepçeler yaşamın gerçek koşullarını cahilliğimiz yüzünden anla¬yamamamız, değerlendiremememiz nedeniyle sonradan elimize ayağımıza dolanmış, takılmış şeyler. Ustaların cömertçesine, iyi yüreklilikle bir çözüm, bir yanıt ara¬yanlara sundukları, ister sözlü olsun, ister uygulama yöntemleri göstermek yoluyla olsun, onları esenliğe çı¬karmayı hedef alan önerilerinin amacı başlangıçta var¬ken sonradan kaybetmiş olduğumuz özgürlüklere bizi yeni baştan kavuşturmaktır. Bunun böyle olduğu da özgürlük, ne türden olursa olsun, birtakım ülkü kalıplarına sokulmadan, kişisel yaşantıyla ve salt in¬sanın kendi çabasıyla gerçekleştirmedikçe tam olarak anlaşılamıyor. Zen’in en son ve kesin görüşünü şöyle özetleyebiliriz : Sonluyla sonsuz arasında daha en baş¬tan beri bir çelişkiye gerek yokken, o kadar istekle bul¬maya çalıştığımız iç barış hep ortada durup dururken, cahilliğimiz yüzünden ille kendi benliğimizde sonluyla sonsuz arasında bir kesinti bulacağız diye kendimizi çık¬mazlara sürüklemekteyiz. Sotoba (So tung p’o) bu dü¬şünceleri aşağıdaki dizelerde şöyle dile getirdi :\n" +
                "Lu dağında sisli bir yağmur yağıyor, \n" +
                "Che-Chiang’ıysa dalgalar dövüyor;\n" +
                "Orada olup da bunları görmediğinize, \n" +
                "Kuşkusuz acınıp duruyorsunuz özlemle.\n" +
                "Ama bir kez orda olup evin yolunu tuttunuz mu, \n" +
                "Lu dağında yağan sisli yağmur,\n" +
                "Chi-Chiang’ı döven dalgalar,\n" +
                "Her şey, her şey ne kadar olağan geliyor size.\n" +
                "\n" +
                "Seigen Ishin’in (Ch’in-Yuan Wei-hsin) şu sözleri de aynı görüşü yansıtıyor : «Bir kimse Zen öğrenmeye başlamadan ona dağlar dağ gibi, ırmaklar ırmak gibi görünür; iyi bir ustanın öğretisinden yararlanarak Zen gerçeğine bir içgörü kazanmaya başlayınca ona artık dağlar dağ gibi, ırmaklar ırmak gibi gözükmemeye baş¬lar. Ama en sonunda gerçekten tam aydınlanmaya ula¬şınca gene dağlar dağ gibi, ırmaklar ırmak gibi görü¬nür.»\n" +
                "Dokuzuncu yüzyılın ikinci yarısında yaşamış olan Bokuju’ya (Mu-chou) bir kez sormuşlar, «Her gün giy¬silerimizi giymek ve yemek yemek zorundayız. Bu zo¬runluluktan nasıl kendimizi kurtarabiliriz?» Usta «Gi¬yiniyoruz, yiyoruz» diye karşılık verince, soruyu soran, «sizi anlayamıyorum», demiş. Mu-chou’nun öğüdü şöy¬le : «Öyleyse giysini giy, yemeğini de ye.»\n" +
                "Zen her zaman somut gerçeklerle ilgilenir, genelleş¬tirmelerden zevk almaz. Çizdiğim yılan resmine gerek¬siz ayaklar takmak istemem ama Bokuju’nun bu söz¬leri üzerine felsefe yapmaya kalksam şöyle söyleyebili¬rim : Hepimiz sonlu yaratıklarız, zamanın ve uzayın dı¬şında yaşayamayız; topraktan yaratıldığımızdan son¬suzu kavrayabilmemiz olanağı yok. Kendimizi varolu¬şun sınırlamalarından nasıl kurtarabiliriz? Her halde soru soran keşişin aklında olan buydu. Usta da bu so¬ruya verdiği yanıtta : Kurtuluşun sonlu olan şeylerde aranması gereğini, sonlu şeylerin dışında bir sonsuz ola¬mayacağını ortaya koymuş oldu. Eğer algılar ötesi, aş¬kın (transcendental) bir şey arıyorsanız bu sizi göre¬celi (izafi) dünyadan koparacaktır. Böyle bir şeyse ken¬dinizi yoketmekle aynı şeydir. Her halde varlığınızı yok etmek pahasına kurtuluşu aramıyorsunuzdur. Öyleyse yiyip içiniz, sizi özgürlüğe götürecek yolu yiyip içerek bulunuz. Bu yanıt, soruyu soranın anlayışını aşıyordu. Onun için de ustanın ne demek istediğini anlamadığını gizlemedi. Bunun üzerine usta da sözü şöyle demeye getirdi. «İster anlamış ol, istersen olma, farketmez. Şu sonlu dünyada sonlu şeylerle yaşamını sürdürmeye bak. Eğer yemek içmekten vaz geçer ya da sonsuza erişmek gibi amaçlar güderek kendini soğuktan koruyamazsan ölüp gideceğinden kuşkun olmasın. Ne kadar zorlanır¬san zorlan, Nirvana’yı Samsara’nın (doğum ölüm dön¬güsü) dışında bulamazsın. İster aydınlanmış bir Zen ustası ol ister kara cahil ol hiç kimse doğal adı verilen yasaların zorunluluğundan kendini kurtaramaz. Mide¬si boş olunca aydınlanmış Zen ustasının da kara cahi¬lin de karnı acıkır. Kar yağınca ikisinin de üzerlerine fazladan bir yün fanila giymeleri gerekir. Onların her ikisinin de salt maddesel bir varlık sürdürdüklerini söy¬lemek istemiyorum. Ama ruhsal gelişimleri ne olursa olsun, olduklarından başka bir şey olamazlar. Budist kutsal yazılarında mağaranın karanlığı ruhsal içgörü-nün meşalesi yakılınca aydınlığa dönüşür diye yazılıdır. Böylece kuşkusuz karanlık denen bir şey dışarı atılıp da onun yerine aydınlık denen başka bir şey getirilmiş olmuyor. Aslında aydınlık ve karanlık daha en baştan beri özde bir ve aynı şeylerdir. Birinden ötekine değişim içten içe ve öznel olarak oluşur. Sonlu ve sonsuz ya da sonsuz ve sonluda da bu böyledir. Akılcı açıdan bakınca ayrı ayrı şeylermiş gibi onları kavramaya zorlanmış da olsak bu ikisi birbirlerinden ayrı şeyler değildir. Man¬tık açısından yorumlanınca Bokuju’nun soru soran ke¬şişe verdiği yanıtın arkasındaki düşünceler bunlar ol¬malı. Bizim yanlışımız gerçekte ve kesinlikle tek olan şeyi ikiye bölmeye çalışmamızda. Yaşam yaşadığımız biçimiyle tek değil mi? Niçin onu aklın acımasız ve öldürücü bıçağıyla parçalara doğruyoruz?\n" +
                "Keşişler Hıya Kujo Nehan’dan (Pai-chang Nich - p’an) bir vaaz vermesini istedikleri zaman şimdi tar¬lada çalışın sonra size Budizmin en önemli konusundan söz ederim demiş. Keşişler de ustanın dediğini yapmış¬lar. Sonra vaaz dinlemek için toplandıklarında usta bir şey demeden kollarını açıp ileri doğru uzatmış. Belki de her şey bir yana, Zen’de gizemli bir şey yok. Her şey gözlerinizin önünde. Eğer yemeğinizi yer, temiz te¬miz giyinir, tarlada çalışıp pirincinizi ya da sebzeleri¬nizi yetiştirirseniz sizden istenen her şeyi gerçekleştir¬diniz, sizin kişiliğinizde sonsuz gerçekleşti demektir. Na¬sıl mı? Bojuku’dan Zen’in ne olduğu sorulduğu zaman bir Sutra’dan Sankskritce bir söz söylemiş, «Mahapraj¬na paramita!» Soruyu soran bu yabancı sözü anlamak¬taki yetersizliğini saklamayınca usta şöyle bir yorum yapmış :\n" +
                " «Onca yıl giydikten sonra cübbem param parça oldu\n" +
                "Salkım saçak sarkan parçalarını da rüzgâr alıp bu¬lutlara götürdü»\n" +
                "\n" +
                "Sonsuz böylesine fakir bir dilenci mi?\n" +
                "Ne olursa olsun bu konuda gözden kaçırmamanız gereken bir şey var : Kişiliğinizin bütün gücüyle sür¬düreceğiniz bir savaşım sonucunda iç barışı ancak fa¬kirlik içinde gerçekleştirebileceğiniz gerçeği. (Çünkü iç barış ancak insan fakirken olabilir.) Aylaklıktan, adam sendeci boşvermişlikten bir hoşnutluk elde etmeye ça¬lışmak aşağılanacak bir davranış olarak bilinmelidir. Bunda Zen yoktur, tembellik vardır, bitkisellik vardır. Savaşım olanca güç harcanarak erkekçe yürütülmelidir.\n" +
                "Bu böyle olmadan elde edilecek iç barış yalancısıdır, tak¬lididir. Köklü, dayanıklı bir temele oturmaz. Çıkacak ilk fırtınada yerle bir olacaktır. Zen’in bu konudaki görüş¬leri adamakıllı kesindir. Zen’in gizemci tutumunun ya¬nında bir de ahlâk açısından da dimdik, eğilmez bir tutumu olmasını yaşam savaşını gözüpeklikle, yürek¬lilikle göğüslemiş olmasına bağlayabiliriz.\n" +
                "Onun için Zen’e ahlâk açısından karakterin yeni baştan yapılmasını amaçlayan bir yol gözüyle bakabi¬liriz. Bizim günlük yaşamımız ruhumuzun en derin yer¬lerinde bir kargaşa yaratmadan kişiliğimize ancak ke¬narından değip geçiyor. Dinsel bilinç uyanmış olduğu zamanda bile, çoğumuz, günlük yaşamımızı ruhumuzda zorlu, acılı bir çekişmenin iz bırakmasına neden olma¬yacak biçimde hafife alırız. Her şeyin yüzeyinde yaşa¬yabilmek için böyle yaratılmışız. Zeki, parlak ve daha bilmem ne olabiliriz ama yaptığımız, ortaya koyduğu¬muz şeyler derinlikten, içtenlikten yoksundur. En derin duygularımıza karşılık vermez. Bazı kimseler karakter¬lerinin derinlikten yoksun olması, derin iç yaşantılar¬dan geçmemiş olmaları yüzünden yarım yamalak, tak¬lit şeyler dışında bir şey yapmaya, yaratmaya bütünüy¬le yeteneksizdirler. Zen öncelikle dinsel bir yol olmakla beraber bir yandan da bizim ahlâksal karakterimizi yo¬ğurup biçimler. Belki şöyle demek daha uygun olur; derin bir iç yaşantı ister istemez kişiliğimizin ahlâk¬sal yapısında da bir değişimi zorlar.\n" +
                "Bunu nasıl yapar?\n" +
                "Zen’in gerçeği öyle bir gerçek ki onu derinlemesine anlamak istediğimiz zaman çok kez uzun ve sürekli bir uyanıklık isteyen bir çaba, bir çekişme, boğuşma¬dan geçmeyi göze almalıyız. Zen yolunda eğitim gör¬müş olmak kolay bir şey değildir. Bir Zen ustası, «Bir keşiş yaşamını ancak güçlü karakter yapısı olan bir kimse başarabilir, devlet yönetimini üstlenmiş bir baka¬nın bile her zaman başarılı bir keşiş olacağını sanma¬malı,» demiş. (Hemen şurasını belirtelim, Çin’de devlet yönetiminde görevli bir bakan olabilmek bir insanın dünyada bekleyebileceği en büyük başarıdır.) Bunun böyle olmasının nedeni keşiş yaşamının sıkı bir çilekeş¬liği gerektirmesinden değil, bunun için bu kimsenin ma¬nevî güçlerini en yüksek noktasına kadar geliştirmesini gerektirmesindendir. İşte Zen ustalarının bütün sözle¬ri, davranışları böyle bir noktadan geliyor. Onların ama¬cı kuşkusuz sözlerini, davranışlarını anlamamızı güç¬leştirmek, zihnimizi karıştırmak değil. Bütün bu sözler, davranışlar derin yaşantılarla dolup taşmış bir ruhun aşkınlıklarıdır. Onun için bizler de ustaların ulaştık¬tan yüksek noktalara erişmedikçe yaşam gerçeğine ay¬nı geniş ufuktan, tepeden bakamayız. Ruskin diyor ki: «Hiç kuşkunuz olmasın eğer kitabını okuduğunuz yaza¬rın bir değeri varsa yazdıklarını öyle hemen kolaycacık bir solukta anlayamayacaksınız. Evet bu böyle. Ne ya¬parsanız yapın uzun bir süre size tam olarak yazdıkla¬rının anlamını açıklamayacaktır. Bunun nedeni anlat-mak istediği şeyi güçlü, anlamlı sözcüklerle söyleyeme¬miş olmasından değildir. Onu daha fazla anlatamıyor, daha da şaşırtıcı olan yanı şu; asıl anlatmaya çalıştığı şeyi kapalı bir biçimde, dokundurmalar, benzetmeler yapmak, örneklemek yoluyla açıkça söylemeden anla¬tıyor. Sanki sizin onu almak istediğinize önce kesin olarak inanmak istiyor. Bilgelerin her zaman en iç, en derin düşüncelerini saklamaktaki bu ağız sıkılıklarının nedenini tam olarak anlayamıyorum. Anlaşılan onlar size bu düşünceleri karşılıksız bir bağış olarak değil de bir ödül olarak veriyorlar, siz ödülü almadan önce de ödülü hak edip etmediğinize güven duymak istiyorlar.» İşte bilgelik denen bu pahasız hâzineyi açacak anahtar bize ancak sabırlı ve zorlu bir çaba, bir çekişme sonu¬cunda veriliyor.\n" +
                "Zihin hemen hemen her zaman çeşit çeşit saçma sapan yargılarla, kararlarla, kanılarla birtakım anlam¬sız duygusallıklarla tıka basa doludur. Kuşkusuz bun¬lar bizim günlük yaşamımızda yerine göre yararlı ve gerekli olabilirler. Bunun tersini söyleyemeyiz. Ama ken¬dimizi mutsuz, perişan duruma düşürmemizin, bağım¬lılık duygusu altında ezilip inlememizin başlıca nedeni zihnimizde biriktirdiğimiz bu gibi şeylerdir. Her yap¬mak istediğimiz harekette bunlar bizi zincirliyor, bo¬ğazımızı sıkıyor, ruhsal ufkumuza kalın bir perde çe¬kiyorlar. Hep engellerle çevrelenmişiz gibi bir duygu için-de yaşıyoruz. Özgür olmak doğallıkla, içtenlikle dav¬ranmak istiyoruz ama buralara gelebilmek elimizden gelmiyor. Zen ustaları da bir zamanlar bu yaşantılar¬dan kendileri de geçtiklerinden bu durumları biliyorlar. Asıl gerçeğin ayırdında olarak, uyanmış, aydınlanmış bir kimse olarak yaşamımızı yürütebilmemiz için taşı¬mamızda hiç bir gerek olmayan bu ezici, yıpratıcı yük¬lerden bizleri kurtarmak istiyorlar. Bu amaçla birkaç lâkırdı ediyorlar ve davranışlarıyla da destekleyerek eğer bu lâkırdılar gereği gibi anlaşılıp değerlendirilirse zihnimizde birikmiş yargıların, kararların, kanıların zorbaca baskısından bizi kurtarabileceklerini göster¬mek istiyorlar. Ama bunlar kolaylıkla anlaşılabilecek şeyler değil. Yargıların, kararların, kanıların zorbalığı altında yaşamaya o kadar uzun bir süreden beri alışmı¬şız ki zihnimizi tembellikten kurtarıp devinime geçire¬bilmemiz çok güç. Varlığımızın öyle derinine işlemişler ki bunlar, bütün kişiliğimizi. altüst edip yeni baştan yapmaktan başka seçenek yok elimizde. Bu yeni baş¬tan yapım işlemi de kanlı gözyaşları akıtılmadan ola¬mıyor. Ama büyük ustaların çıktıkları doruklara eriş¬menin başka yolu da yok. Zen’in gerçeğini kişiliğimizin olanca gücünü harcamadan ele geçiremeyiz. Zen’e gö¬türen geçitin her bir yanı dikenli çalılarla, devediken- leriyle örtülü, bayırlarsa son derece kaygan. Bu iş öyle boş vakit doldurmak için bir eğlence değil, yaşamda en önemli, en önde gelen ciddî bir iş bu. Aylaklann, boş vakit harcayanların gözlerinin kesebileceği bir iş değil. Bu öyle bir örs ki üstünde karakterimiz balyozlana bal- yozlana biçimleniyor. «Zen nedir?» sorusuna bir usta «Kızgın ateş üstünde kaynar yağ», diye yanıt vermiş. Kızgın yağlarla gövdemiz dağlanmadan Zen bize güler yüzünü gösterip «Hoşgeldin, işte burası senin evin» de¬miyor.\n" +
                "Zihnimizde bir dönüşüm oluşturabilecek Zen usta¬larından birinin ünlü lâkırdılarından işte birisi: Önce¬leri bir Konfiçyuscu olan Hokoji (P’ang-yun) Baso’ya (Ma-tsu - 788) «Hiç bir şeye gereksinme duymayan adam ne tür bir adamdır?» diye sormuş, «Sen bir yudumda Batı Irmağının bütün suyunu içtiğinde sana söylerim» diye usta soruyu karşılıklandırmış. Düşünce tarihinde ortaya konabilecek en önemli bir soruya ne tutarsız bir karşılık bu! Bu sorunun ağırlığı altından kalkamamış, altında ezilip kalmış ne çok insan olabileceğini düşününce bu yanıt kutsal şeyleri aşağılatıcı, saygısız bir sövgü gibi bile görünebilir. Ama Baso’nun konuyu önemsedi¬ğinde, amacının hafife almak olmadığında Zen’i uğraş konusu yapmış olan hiç kimsenin kuşkusu yok. Tar¬tışmasız altıncı pir Hui-neng’den sonraki dönemde Zen’¬in yükselişini sürdürmesinde bir Zen ustası olarak Ba-so’nun parlak kişiliğinin büyük katkısı olmuştur. En azından seksen tane tam anlamıyla yetenekli usta ye¬tiştirmiştir. Onların en önde gelenlerinden biri olan Ho¬koji haklı olarak Çin Budizminin Vimalakirti’si diye ün yapmıştır. Böylesine Zen’de dirsek çürütmüş, çarık es¬kitmiş iki Zen ustası arasındaki bu konuşma elbette boş bir gevezelik olarak nitelendirilemez. Kolay söylen¬miş rastgele lâkırdılar gibi görünse de Zen yazınının en değerli inci taneleri bu lâkırdılar içinde saklıdır. Kim¬bilir ne çok Zen öğrencisi Baso’nun bu sözlerini anla¬maya çaba harcarken ter ve gözyaşı içinde kalmıştır.\n" +
                "İşte bir başka örnek daha : Chosa’lı Shin ustaya (Chang-sha Ching-ch’en) bir keşiş, «Nansen (Nan-ch’¬uan) ölünce nereye gitti?» diye sormuş. Ustanın ver¬diği yanıt şöyle : «Sekito (Shih-tou) daha öğrencilik döneminin ilk çağlarındayken altıncı piri tanımış». «Yok ben Sekito’nun ilk öğrencilik yıllarını sormuyo¬rum. Benim öğrenmek istediğim Nansen’in ölünce ne¬reye gitmiş olduğudur». «Bu konuya gelince», demiş usta, «insanı iyice düşündürüyor.»\n" +
                "Ruhun ölmezliği, işte gene zorlu bir sorun. Dinler tarihi bir tek bu sorun üzerine kurulmuştur dense ye¬ridir. Herkes öldükten sonra başına ne geleceğini bil¬mek istiyor. Bu dünyayı bırakınca nereye gideceğiz? Gerçekten başka bir yaşam daha var mı? Yoksa burada her şey bitiyor mu? Bir başına «yapayalnız» varlığını sürdüren Bir’in asıl anlamı konusunda kafasını yoran¬ların sayısı pek çok olmayabilir ama belki de hiç olmaz¬sa bir defa olsun öldükten sonraki yazgısı konusunda hiç düşünmemiş bir tek insan bile çıkmaz. Sekito’nun gençliğinde altıncı piri görmüş olup olmamasında Nan¬sen’in bu dünyadan ayrılmasıyla ilgili bir şey olmadığı açık. Nansen Chosa’nın öğretmeniymiş, onun için ke¬şiş, Nansen’in ölünce nereye gitmiş olabileceğini sor¬muş olmalı. Chosa’nın yanıtı mantığın alışıla gelmiş kuralları açısından bakılınca bir yanıt sayılamaz. Onun için keşiş ikinci soruyu soruyor ama ustanın ağzından gene anlaşılmaz bir lâkırdı çıkıyor. «İnsanı iyice dü-şündürüyor», sözüyle usta neyi açıklamış oluyor? Bur¬dan da anlaşıldığı gibi Zen başka şey, mantıksa daha başka bir şey. Bu farkı anlayamaz da Zen’den mantık¬sal açıdan tutarlı, akılcı açıdan da aydınlatıcı olma¬sını beklersek Zen’in anlamını bütünüyle yanlış yorum¬lamış oluruz. Daha başlardayken Zen’in gerçeklerle uğ¬raştığını genelleştirmelerle, soyut kavramlarla ilgilen-mediğini söylememiş iniydim? İşte Zen’in dosdoğru ki¬şiliğimizin temeline indiği nokta da tam burası. Akıl genellikle bizi oraya kadar götürmez. Çünkü biz aklı¬mızla değil istencimizle yaşarız. Keşiş Lawrence (Tanrı varlığının yaşama uygulanması) adlı yapıtında «Bir şeyi anlamakla o şeyi istence dönüştürmek arasında büyük fark vardır. Birinciyi İkinciyle karşılaştırınca bi¬rinci değersiz kalır» diyor.\n" +
                "Zen edebiyatı ağza geldiği gibi, düşünmeden rast¬gele safçasınaymış gibi söylenmiş bu tür sözlerle dolu¬dur. Ama Zen’in ne olduğunu gerçekten bilenler usta¬ların ağzından o kadar doğal olarak çıkan bu sözlerin öldürücü zehirlere benzediğini bilirler. Bir kere onları yuttunuz mu öylesine acı verirler ki Çinlilerin deyimiy¬le bağırsaklarınız dokuz kez ya da daha çok kıvrım kıv¬rım sizi kıvrandırır. Ama ancak bu acılar çekildikten, insan allak bulak olduktan sonra içimizdeki bütün pis-liklerden temizleniriz, bambaşka görünümde yeni bir yaşama doğarız. İşin şaşılacak yanı insanın bu iç çatış¬malardan geçmedikçe Zen’i anlayamaması. Gerçek şu :\n" +
                "Zen kişisel olarak yaşanarak varılacak bir yaşantı, yok¬sa karşılaştırmalar, çözümlemeler (analiz) yapılarak el¬de edilecek bir bilgi değil. «Şair olmayana şiirden söz etmeyin, hasta olmayan hastanın halinden anlamaz.» Bu sözler durumu tam olarak açıklıyor. Zihnimiz öyle¬sine olgunlaşmalı ki ustalarınkilerle bir uyum, bir ayar içine gelebilsin. Böyle olabilmesine fırsat verin, bir tele dokundunuz mu öteki teller de ses verir. Uyumlu ezgiler her zaman iki ya da daha çok telin birbirlerine yankı yapmasından oluşur. Zen’in de yapmak istediği zihin¬lerimizi eski ustaların verdiklerini değerlendirmeye ve almaya hazır duruma getirmektir. Ya da başka bir de¬yişle Zen içimizde var olup da günlük yaşamımız içinde, olağan koşullar atında bilincinde olamadığımız ruhsal güçlerin açığa çıkmasına olanak sağlamaktır.\n" +
                "Bazıları Zen’in kendi kendine telkin yapmak oldu¬ğunu söylerler. Ama bu tanım bir şey açıklamış olmu¬yor. «Yamato-damashi» sözü pek çok Japon’da son de¬rece ateşli bir yurtseverlik duygusu uyandırır. Çocuk¬lara doğan güneşli bayrağa saygı duymaları öğretilir. Askerler alay sancaklarının renkleriyle karşılaşınca hiç düşünmeden hemen selâm dururlar. Bir çocuğa küçük bir samurai gibi davranmadığı, atalarını küçük düşür¬düğü söylenince hemen kendini toplar, yüreklenerek korkaklığı, gevşekliği yener. Bütün bu kavramlar Ja¬ponların içlerindeki ruhsal güçlerin açığa çıkmasına olanak verir. Bazı ruhbilimciler ruhsal güçlerin bu yol¬la açığa çıkarılmasına kendi kendine telkin adını koy¬muşlar. Toplumsal alışkanlıklara ve taklit içgüdüsüne de kendi kendine telkin gözüyle bakılabilir. Ahlâksal kurallara uyum konusu için de aynı şeyler söylenebilir. Öğrencilere izlemeleri ve bezemeleri için bir örnek gös¬terilir. Bu kavramlar giderek telkin yoluyla derinlere kök salar, en sonunda öyle bir noktaya gelinir ki insan sanki o kavram kendi yapıtıymış, kendi özmalıymış gi¬bi davranmaya başlar. Kendi kendine telkin verimsiz bir kuram, hiç bir şeyi açıklamaya yetmiyor. Zen ken¬di kendine telkindir dendiği zaman Zen’in ne olduğu konusunda daha açık, daha aydınlatıcı bir bilgi edinmiş olmuyoruz. Bazıları bazı olayları açıklayabilmek için yeni moda olmuş-deyimleri kullanmayı daha bilimsel bir tutum sayıyorlar, böylece de bu olayları aydınlatıcı bir yol buldukları kanısıyla mutlu oluyorlar. Bence Zen’i incelemeyi derinlik ruhbilimcileri (psikanalistler) üst¬lenmelidir.\n" +
                "Bazı kimseler bilincimizde daha tam olarak ve sis¬temli bir biçimde araştırılıp bulunmamış, bilinmeyen bölgelerin bulunduğu kanısındadırlar. Bu bölgelere bi¬linçdışı diyenler de, bilinçaltı diyenler de var. Bu böl¬geler korkulu karanlık imgelerle dolu, bu nedenle de bi¬lim adamlarının çoğu bu bölgelerle uğraşmaktan kor¬kuyorlar. Ama böyle olması bu bölgelerin varlığını yad¬sıma anlamına alınmamalıdır. Nasıl bizim normal bilin¬cimiz akla gelebilecek her türlü yararlı ya da zararlı sistemli ya da karmaşık, açıklıkla belirli ya da dumanlı ve belirsiz, güçlü bir biçimde kendini ortaya vuran ya da soluk ve giderek silinip giden imgelerle dopdoluysa : Eğer bilinçaltı sözcüğünden gizlenmiş olan, anormal olan, ruhsal yada manevî olarak bilinen şeylerin tümü¬nü anlıyorsak, gizli bilimlerin (occultism) ve gizemci¬liğin gereç ambarı olarak niteleyebileceğimiz bilinçaltı da tıpkı böyledir. İnsanın kendi iç yapısını, iç varlığını görebilmesi yetisi de orada saklı olabilir. Zen’in uyan¬dırdığı söylenen bilinç de bu olabilir. İster öyle olsun ister böyle, ustalar simgesel olarak üçüncü gözümüzü açmaktan söz ediyorlar, bu uyanışa ya da üçüncü gö¬zün açılışına halk dilinde verilen ad satori’dir.\n" +
                "Bu nasıl gerçekleştirilir?\n" +
                "Cahillik ve yanılgıdan gelen kargaşayı yok etmenin yolları iyice araştırılarak ve aklın ve imgeleme (hayal) gücünün etkisi dışında kalan en derin alanlardan doğ¬rudan yukarıya gelen sözler ve eylemler üzerinde me¬ditasyon yaparak gerçekleştirilebilir .\n" +
                "Bu konuda okuyucuyu, ustaların öğrencilerinin göz¬lerini açabilmek için uyguladıkları yol ve yöntemlerle tanıştırmakta yarar var. Çok defa ustaların meditas¬yon salonuna giderken yanlarında taşıdıkları ustalı¬ğın simgesel belirtisi olan gereçlerden yararlanmış ol¬maları doğal karşılanabilir. Bunlar genellikle (hossu» , «shippe» , «nyoi»  ya da «shujva» dur (asa ya da sopa). Anlaşıldığına göre son adı geçen gereç Zen gerçeğini göstermek için en çok kullanılan gereçti. İşte asa’dan nasıl yararlanıldığını gösteren birkaç örnek :\n" +
                "Chokei’li (Chang-ch’ing) Ye-ryo’ya (Hui-leng) gö¬re «İnsan bir kere asa’nın ne olduğunu öğrenecek olsa yaşam boyu süren Zen öğrenciliği sona ererdi.» Bu bize Tennyson’un duvar çatlağındaki çiçek adlı şiirini anım¬satıyor. Biz bu asa’nın varoluş nedenini anladığımız za¬man «Tanrı nedir, insanoğlu nedir?» onları da anlamış olacağız. Sözün kısası kendi iç yapımıza, iç benliğimize de bir içgörü kazanmış olacağız, bu içgörü de zihnimi¬zin dirliğini altüst eden kuşkularımızın özlemlerimizin, yakınmalarımızın sona ermesini sağlayacaktır. Böylece de asa’nın Zen için taşımakta olduğu önem kendiliğin¬den ortaya çıkmış olacaktır.\n" +
                "Büyük bir olasılıkla onuncu yüzyılda yaşamış olan Basho’lu (Pa-chiao) Ye-sei (Hui-ch’ing) şöyle bir lâ¬kırdı etmiş. «Bir asa’nız varsa size bir tane daha veri¬rim, eğer yoksa onu sizden alırım.» Tam Zen’e yaraşır bir lâkırdı. Sonraları Daiyi’li (Ta-wei) Bokitsu (Mu-chi) bu sözlere karşı çıkacak yükrekliliği göstermiş «Benim yolum başkadır. Ben asa’sı olandan asa’yı alır olma¬yana veririm. Ben de böyle söylüyorum. Asa’yı kullan¬mayı becerebilir misiniz, beceremez misiniz? Eğer be-cerebilirseniz Tokusan (Te-shan) arkadan, Rinzai’yse (Lin-chi) önden sizi destekler. Ama kullanmayı becere¬mezseniz eski sahibi olan ustaya geri verin.» demiş.\n" +
                "Bir keşiş Bokuju’nun yanına gelip «(Bilgelikte) Bu¬daların, pirlerin sözlerine üstün çıkabilecek bir şey var mıdır?» demiş. Usta hemen oradaki öğrencilerine doğ¬ru asasını uzatıp «Ben buna asa derim, siz ne dersiniz?» diye sormuş. İlk soruyu soran keşişten hiç bir ses çık¬mayınca usta gene asayı öne uzatmış «(Bilgelikte) Bu¬daların, pirlerin sözlerine üstün çıkabilecek şey işte budur. Yoksa senin sorun bu değil miydi keşiş efendi?» demiş.\n" +
                "Bokuju’nunkiler gibi sözler gereken önemi vererek ilgiyle izlemeyenlere baştan aşağı saçma gibi görüne¬bilir. Eğer bilgimizin sınırlarını aşan evreni yöneten bil¬gelik söz konusuysa sopaya asa denmiş olması ya da başka bir şey denmiş olması konuya ışık tutabilecek bir sorun gibi görünmeyebilir. Belki başka ünlü bir Zen ustasının, Ummon'un sözleri konuyu anlamamızı ko-laylaştırır. Ummon da bir kez kendisini dinlemek için toplanan kalabalığa karşı asasını havaya kaldırıp şöy¬le demiş : «Kutsal yazılarda okuduğumuza göre cahil¬ler bunu gerçek bir şey sanıyorlar, Hinayanistler  bu¬nun yokluk olduğunu savunurlar, Pratyekabuddha’la¬rın  gözünde bu bir sanrıdır (hallucination), Bodhi¬sattva’larsa  bunun görünürdeki gerçekliğini yadsı¬mazlar, aslında bu görünümün ardındaki de boşluktur.» «Ama», diye usta sözünü sürdürmüş, «Siz bunu gördü-ğünüzde asa demekle yetinin. Ya yürüyün ya oturun. Kararsız kararsız bir o yana bir bu yana sallanmayın» demiş.\n" +
                "Gene aynı önemsiz asa üzerine Ummon’dan daha da gizemli birkaç lâkırdı. Bir gün Ummon şöyle demiş : «Benim asam ejderha oldu ve bir solukta bütün evreni yuttu; dağlarıyla, ırmaklarıyla benim koca dünyam şimdi nerede acaba?» Başka bir defasında da eski bir Budist filozofun sözlerini aktararak demiş ki, «uzayın boşluğuna hele bir dokunun hemen ses verecektir ama bir odun parçasına vursanız da ses vermez.» Sonra asa¬sını şöyle bir havada savurmuş ve «Uf! Nasıl da acıtı¬yor!» demiş. Ardından da asasıyla masaya birkaç kez vurmuş. «Bir ses duydunuz mu?» diye sormuş. Bir ke¬şiş atılıp «Evet duydum» deyince de kendini tutamayıp «Hey, koca cahil!» diye bağırmış.\n" +
                "Bunlara benzer örnekleri sıralamayı sürdürürsem sonu gelmeyecek. Onun için burada kesiyorum. Ama içi¬nizden birinin «Bütün bu lâkırdıların insanın iç varlı¬ğını, iç yapısını tanımasıyla ne ilgisi var? Asa konusun¬da insana saçma sapan gelen bütün bu lâkırdılarla her şeyden daha önemli olan yaşamın gerçeği sorunu ara¬sında nasıl bir ilişki kurulabilir?» diye sormasını bek¬liyorum. '\n" +
                "Yanıt olarak biri Jimyo’dan (T’zu-ming), öteki Yen¬go’dan (Yuan-wu) aldığım iki parçayı aktarıyorum. Bir vaazda Jimyo, «Yerden bir toz parçacığı kalkacak olsa o toz paçacığında bütün yeryüzü kendini açıklamış olur. Bir aslan milyonlarca aslanı, milyonlarca aslan da bir aslanı açıklar. Kuşkusuz binlerce binlerce aslan vardır. Ama siz bir tanesini tanıyın yeter», dedikten sonra asa¬sını şöyle bir havaya kaldırmış «İşte benim asam bu, peki bu bir aslan nerede?» deyip asasını indirmiş son¬ra da kürsüden inip gitmiş.\n" +
                "Yengo da aynı düşünceyi Gutei’nin «Bir Parmak¬çık Zen» (Chuh-chih İ Chih T’en ch’an) adlı yapıtına önsöz niteliğinde görüşlerini açıkladığı Hekigan’da şöy¬le anlatıyor :\n" +
                "«Yerden bir toz parçacığı kalkıyor ve bütün yeryü¬zü onun içinde; bir çiçek açıyor, bütün evren de onunla birlikte açıyor. Ama yerden toz kalkmamışsa, çiçek aç¬mamışsa gözlerimi nereye yönelteyim? Onun için der¬ler ki bir yumak ipliği kesince bir kesişte hepsini ikiye bölmüş olursun, yumağı boyaya batıracak olsan bütün iplikleri birden aynı renge boyarsın. Bunun gibi seni bağlayan bütün bağlardan sıyır kendini, onları kopar, param parça et. Ama kendi içindeki zenginliklerle iliş¬kini koparma. Ancak bu yolla yüksekle alçak evrensel bir uyum içinde ve ilerdekiyle gerideki arasında bir ayı¬rım olmadan her biri tam bir yetkinlik, eksiksizlikle, kendilerini açıklamış olurlar. \n";


        s3="İkimiz birden sevinebiliriz göğe bakalım\n" +
                "Şu kaçamak ışıklardan şu şeker kamışlarından\n" +
                "Bebe dişlerinden güneşlerden yaban otlarından\n" +
                "Durmadan harcadığım şu gözlerimi al kurtar\n" +
                "Şu aranıp duran korkak ellerimi tut\n" +
                "Bu evleri atla bu evleri de bunları  da\n" +
                "Göğe bakalım\n" +
                "\n" +
                "Falanca durağa şimdi geliriz göğe bakalım\n" +
                "İnecek var deriz otobüs durur ineriz\n" +
                "Bu karanlık böyle iyi afferin Tanrıya\n" +
                "Herkes uyusun iyi oluyor hoşlanıyorum\n" +
                "Hırsızlar polisler açlar toklar uyusun\n" +
                "Herkes uyusun bir seni uyutmam birde ben uyumam\n" +
                "Herkes yokken biz oluruz biz uyumıyalım\n" +
                "Nasıl olsa sarhoşuz nasıl olsa öpüşürüz sokaklarda\n" +
                "Beni bırak göğe bakalım\n" +
                "\n" +
                "Senin bu ellerinde ne var bilmiyorum göğe bakalım\n" +
                "Tuttukca güçleniyorum kalabalık oluyorum\n" +
                "Bu senin eski zaman gözlerin yalnız gibi ağaçlar gibi \n" +
                "Sularım ısınsın diye bakıyorum ısınıyor\n" +
                "Seni aldım bu sunturlu yere getirdim\n" +
                "Sayısız penceren vardı bir bir kapattım\n" +
                "Bana dönesin diye bir bir kapattım\n" +
                "Şimdi otobüs gelir biner gideriz\n" +
                "Dönmiyeceğimiz bir yer beğen başka türlüsü güç\n" +
                "Bir ellerin bir ellerim yeter belliyelim yetsin\n" +
                "Seni aldım bana ayırdım durma kendini hatırlat\n" +
                "Durma kendini hatırlat \n" +
                "Durma göğe bakalım";

        s2="Ben sana mecburum bilemezsin \n" +
                "Adını mıh gibi aklımda tutuyorum \n" +
                "Büyüdükçe büyüyor gözlerin \n" +
                "Ben sana mecburum bilemezsin \n" +
                "İçimi seninle ısıtıyorum. \n" +
                "\n" +
                "Ağaçlar sonbahara hazırlanıyor \n" +
                "Bu şehir o eski İstanbul mudur \n" +
                "Karanlıkta bulutlar parçalanıyor \n" +
                "Sokak lambaları birden yanıyor \n" +
                "Kaldırımlarda yağmur kokusu \n" +
                "Ben sana mecburum sen yoksun. \n" +
                "\n" +
                "Sevmek kimi zaman rezilce korkuludur \n" +
                "İnsan bir akşam üstü ansızın yorulur \n" +
                "Tutsak ustura ağzında yaşamaktan \n" +
                "Kimi zaman ellerini kırar tutkusu \n" +
                "Bir kaç hayat çıkarır yaşamasından \n" +
                "Hangi kapıyı çalsa kimi zaman \n" +
                "Arkasında yalnızlığın hınzır uğultusu \n" +
                "\n" +
                "Fatih'te yoksul bir gramofon çalıyor \n" +
                "Eski zamanlardan bir cuma çalıyor \n" +
                "Durup köşe başında deliksiz dinlesem \n" +
                "Sana kullanılmamış bir gök getirsem \n" +
                "Haftalar ellerimde ufalanıyor \n" +
                "Ne yapsam  ne tutsam nereye gitsem \n" +
                "Ben sana mecburum sen yoksun. \n" +
                "\n" +
                "Belki haziran  da mavi benekli çocuksun \n" +
                "Ah seni bilmiyor kimseler bilmiyor \n" +
                "Bir şilep sızıyor ıssız gözlerinden \n" +
                "Belki Yeşilköy'de uçağa biniyorsun \n" +
                "Bütün ıslanmışsın tüylerin ürperiyor \n" +
                "Belki körsün kırılmışsın telaş içindesin \n" +
                "Kötü rüzgar saçlarını götürüyor \n" +
                "\n" +
                "Ne vakit bir yaşamak düşünsem \n" +
                "Bu kurtlar sofrasında belki zor \n" +
                "Ayıpsız   fakat ellerimizi kirletmeden \n" +
                "Ne vakit bir yaşamak düşünsem \n" +
                "Sus deyip adınla başlıyorum \n" +
                "İçim sıra kımıldıyor gizli denizlerin \n" +
                "Hayır başka türlü olmayacak \n" +
                "Ben sana mecburum bilemezsin";

        s1 = "bi an kayboldum gibi yaşadım kıyameti\n" +
                "yoruldun ama buldun ey kalbim emaneti\n" +
                "\n" +
                "yeniden su yürüdü dalıma yaprağıma\n" +
                "bi bakışın can verdi kurumuş toprağıma\n" +
                "\n" +
                "çiçeğe durdu kalbim içtim parmaklarından\n" +
                "göz çeşmem suya erdi sevda kaynaklarından\n" +
                "\n" +
                "bi aydınlık denizin sonsuz derinliğinde\n" +
                "yüzüyorum gözünün yeşil serinliğinde\n" +
                "\n" +
                "bi ışık bi kelebek biraz çiçek biraz kuş\n" +
                "yeni bi ülke yüzün ellerimde kaybolmuş\n" +
                "\n" +
                "soluğun bi kuş gibi uçuyo ellerime\n" +
                "kapılıp gidiyorum saçının sellerine\n" +
                "\n" +
                "gözlerinden göğüme sayısız yıldız akar\n" +
                "bi gülüşün içimde binlerce lamba yakar\n" +
                "\n" +
                "bi kurtuluştur o an çağrılsa senin adın\n" +
                "sesin ne kadar sıcak sesin ne kadar yakın";

        s = "bi an kayboldum gibi yaşadım kıyameti\n" +
                "yoruldun ama buldun ey kalbim emaneti\n" +
                "\n" +
                "yeniden su yürüdü dalıma yaprağıma\n" +
                "bi bakışın can verdi kurumuş toprağıma\n" +
                "\n" +
                "çiçeğe durdu kalbim içtim parmaklarından\n" +
                "göz çeşmem suya erdi sevda kaynaklarından\n" +
                "\n" +
                "bi aydınlık denizin sonsuz derinliğinde\n" +
                "yüzüyorum gözünün yeşil serinliğinde\n" +
                "\n" +
                "bi ışık bi kelebek biraz çiçek biraz kuş\n" +
                "yeni bi ülke yüzün ellerimde kaybolmuş\n" +
                "\n" +
                "soluğun bi kuş gibi uçuyo ellerime\n" +
                "kapılıp gidiyorum saçının sellerine\n" +
                "\n" +
                "gözlerinden göğüme sayısız yıldız akar\n" +
                "bi gülüşün içimde binlerce lamba yakar\n" +
                "\n" +
                "bi kurtuluştur o an çağrılsa senin adın\n" +
                "sesin ne kadar sıcak sesin ne kadar yakın";

    }


    Thread thread;

    private void runThread(){

        thread= new Thread(){
            public void run(){

                while (++k< words.length){
                    try {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                    textView.setText(words[k]);

                            }
                        });
                        Thread.sleep(surat);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            }
        };
        thread.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    //    final File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "metin.txt");
    //    BufferedReader br = null;
    //    try {
    //        br = new BufferedReader(new FileReader(file));
//
    //    String line;
    //    while ((line = br.readLine()) != null) {
    //        Log.d("sonuc", line);
    //        split = line.split(",");
    //        for(int i = 0; i < split.length; i++) {
    //            Log.d("sonuc", "value " + i + ": " + split[i]);
    //        }
    //    }
    //    br.close();
    //    } catch (FileNotFoundException e) {
    //        e.printStackTrace();
    //    } catch (IOException e) {
    //        e.printStackTrace();
    //    }

        btnzen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s4;
                words = s.split("\\s+");
                j=0;
                k=0;

            }
        });

        btnbsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s2;
                words = s.split("\\s+");
                j=0;
                k=0;
            }
        });

        btngbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s3;
                words = s.split("\\s+");
                j=0;
                k=0;
            }
        });

        btnbulmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s1;
                words = s.split("\\s+");
                j=0;
                k=0;
            }
        });

        words = s.split("\\s+");


        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }


        btndur.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               // thread.interrupted();

            }

        });

        btncokh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                surat=cokh;
            }
        });

        btnhizli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                surat=hizli;
            }
        });

        btnyavas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                surat=yavas;
            }
        });



        btnoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runThread();
            }
        });


    }
}
