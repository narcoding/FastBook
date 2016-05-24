package com.narcoding.fastbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button,btngbd,btnbsm,btnbulmak;
    int j=0;
    String s,s1,s2,s3;

    //String[] split;



    String[] words;

    private void init(){
        textView= (TextView) findViewById(R.id.txt);
        button= (Button) findViewById(R.id.button);
        btnbsm= (Button) findViewById(R.id.btnbsm);
        btngbd= (Button) findViewById(R.id.btngbd);
        btnbulmak= (Button) findViewById(R.id.btnbulmak);


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

        btnbsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s2;
                words = s.split("\\s+");
                j=0;
            }
        });

        btngbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s3;
                words = s.split("\\s+");
                j=0;
            }
        });

        btnbulmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s1;
                words = s.split("\\s+");
                j=0;
            }
        });

        words = s.split("\\s+");


        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(words!=null&& j<words.length){
                    textView.setText(words[j] + "");
                    j++;
                }
                else{
                    Toast.makeText(MainActivity.this,"Bitti",Toast.LENGTH_LONG).show();
                }

            }

        });


    }
}
