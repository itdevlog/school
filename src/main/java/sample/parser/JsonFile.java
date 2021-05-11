package sample.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class JsonFile {

public static String urlSchool;

    //устанавливаем URL школы
    public static void setUrlSchool(String x) {
        urlSchool = x;
    }
//список школ с адресами Json
    public static String getLinkSchool(String number) {
        Map<String, String> linkSchool = new HashMap<>();
        linkSchool.put("1 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=a86ac5db-e0ff-44f9-c6e7-0ccfa47a647c");
        linkSchool.put("3 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=908deeae-f61c-4657-8dd5-0208b32307c3");
        linkSchool.put("4 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=d8233eed-b4a5-4911-dde2-8f66332dd388");
        linkSchool.put("5 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=ab7058ed-39e2-4d03-c11c-4182e8bc717c");
        linkSchool.put("7 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=5cf47b42-f271-4f5c-ddc1-081e2b0baec1");
        linkSchool.put("8 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=f1667626-6280-41f5-ac1d-62527e17c8c8");
        linkSchool.put("10 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=459b224f-c157-476d-9db3-9461d743c286");
        linkSchool.put("11 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=588201dc-9024-497b-e915-128e5ab610b8");
        linkSchool.put("12 лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=3e5d606b-a08f-4581-8127-5e33061e047e");
        linkSchool.put("13 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=22819a4b-51fb-4d04-e2bd-768bd967c6dd");
        linkSchool.put("14 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=4868203f-6d34-41d9-c1d5-5c754d2ac3a6");
        linkSchool.put("15 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=26fa8a5c-1010-4729-8b89-1fc2b598e6b9");
        linkSchool.put("16 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=d9aa9bbd-9f5f-401f-a544-a03197de4988");
        linkSchool.put("17 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=fbc360e7-e3f3-4537-848b-1b9721dd548e");
        linkSchool.put("18 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=48f58a37-ce63-411d-9be8-240772b3ff82");
        linkSchool.put("19 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e9287e56-50e5-11e3-bb69-005056a85f43");
        linkSchool.put("20 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=d625ea6d-8987-42a3-8993-a11601a7540d");
        linkSchool.put("21 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=08f62764-a740-418d-ca9c-ace9e4a5ee4f");
        linkSchool.put("22 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=af86774d-f34a-4863-ffd4-1ee2f4579369");
        linkSchool.put("23 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=07abd9c9-f398-4962-88ff-f4d7c8060408");
        linkSchool.put("24 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=49b5d5a8-7e5d-48bc-84f2-85640b508a27");
        linkSchool.put("25 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=fac6141c-86b4-4649-a25c-73969f082195");
        linkSchool.put("26 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=fedeeba5-d12d-4f22-abd7-2a0a5a3451e8");
        linkSchool.put("27 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=35ed316c-1746-4ea0-d869-fdac2ed972bc");
        linkSchool.put("28 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=96d66a83-b719-4952-c089-a256575c043a");
        linkSchool.put("30 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e22f0c31-1340-4d5e-f7ba-01abc6d9f56a");
        linkSchool.put("32 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=9eda7bea-abd2-4c45-e2b1-4378e24e5fbe");
        linkSchool.put("35 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=ebc163da-d61f-4e41-f360-6206cd55a93a");
        linkSchool.put("36 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=91bca962-9f39-4365-8c58-896724c772a6");
        linkSchool.put("37 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=30811e5a-e484-45e2-ac35-17ce4a3dc5b6");
        linkSchool.put("39 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=515c1ce9-2d0f-44e1-d360-0bf9fdf36ee4");
        linkSchool.put("40 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=992544f0-40be-4238-efa0-f38ea4293e89");
        linkSchool.put("41 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=b94b6044-31b7-440b-b454-db8fb6e69fcc");
        linkSchool.put("43 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=c652ff85-76b5-4987-b6d4-dbaaa754e5a0");
        linkSchool.put("44 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=538647cc-eab0-4dff-ddd7-ce71c7fb2c1e");
        linkSchool.put("45 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=bda863b8-442a-481e-d182-2d55ffcd1914");
        linkSchool.put("46 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=6a13e3be-1b5e-4ea0-fa3d-5a8ae82b3c17");
        linkSchool.put("47 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=8ca4104b-fadb-4a28-949d-7fbde86ac51d");
        linkSchool.put("48 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e8c42cd5-f70d-479a-ad75-52e74b9e7d88");
        linkSchool.put("49 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=41975e7c-36ba-464a-c88e-e7d08dcb5e74");
        linkSchool.put("50 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=ac76fdec-3e10-44d8-b677-1eea0c2eb35f");
        linkSchool.put("52 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=90bdbc0e-d8cd-4241-9e84-5d713aef577b");
        linkSchool.put("53 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e65a024c-9519-491c-af6d-8d2d23599391");
        linkSchool.put("55 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=6893c696-e38f-4e2d-ec8e-656902353110");
        linkSchool.put("57 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=31345ec5-7fb6-4e76-8e4d-4ee557e2fe90");
        linkSchool.put("59 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=d08e5128-946c-48d0-ab24-1dca81171fca");
        linkSchool.put("60 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=113c1841-91f5-4be2-d23e-f00e6dde90d2");
        linkSchool.put("61 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e0dc1aa8-f9f8-451f-84bf-c7010aec33f1");
        linkSchool.put("62 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=46af425c-424a-4fbb-9cfd-411f60af630d");
        linkSchool.put("63 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=5cecff7c-a096-436b-9a81-29301e7d4aeb");
        linkSchool.put("64 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=0c533657-53f9-4a98-d2b2-bcd97cad393c");
        linkSchool.put("65 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=95d4da1a-84fa-4bb6-ec62-cddf63482329");
        linkSchool.put("66 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=861b439b-69c6-4f49-b21c-611692a55961");
        linkSchool.put("67 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=f0bcbbfc-f1d7-4b06-caa4-b5d17ae7450a");
        linkSchool.put("68 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=ebe4d5cc-c58a-4878-fabe-46dd0698fff6");
        linkSchool.put("69 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=255ea539-383d-435f-c209-a3cfa58df1b4");
        linkSchool.put("70 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=ee790c32-9561-4fd1-c7fa-ae08f3be924d");
        linkSchool.put("71 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=de13c0ce-df48-4eae-b3d1-a6cabe5aaa57");
        linkSchool.put("72 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=24bb114d-4c7b-4290-ef1e-37fec617819c");
        linkSchool.put("74 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=560b1bec-acbe-45bc-eef0-69d491588f23");
        linkSchool.put("75 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=5b62fa00-7e7c-4fa3-da48-7f3e5f6e030f");
        linkSchool.put("76 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e66c57ef-96fd-4984-8d29-808634b388ae");
        linkSchool.put("77 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=0e7d86dc-87cd-4c48-d2dc-edc890d25463");
        linkSchool.put("79 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=ff1fd69d-06fb-476d-ae58-6f5cf6b56429");
        linkSchool.put("80 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=af03aa1d-5386-4fe3-a4cf-cd6a58f72393");
        linkSchool.put("81 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=da509965-057f-49bc-8003-e2036e35e017");
        linkSchool.put("82 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=c6b2d479-34c1-40be-df1f-39f24ee2b343");
        linkSchool.put("83 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=8eca7f09-dc19-4ca7-d725-56cecbbb4031");
        linkSchool.put("84 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=c25248f9-7b18-4152-f4a6-21b1732e2575");
        linkSchool.put("85 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=54a1f021-0a1a-41be-88b8-58fabce2c9b6");
        linkSchool.put("86 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=6a047ed0-5703-4c6b-a42b-4b5e6dad41c2");
        linkSchool.put("87 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e92a0a09-a219-48e3-af2a-f201465fe50c");
        linkSchool.put("88 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=18798fab-b38d-4f41-c123-7e3e1ba3852d");
        linkSchool.put("91 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=9625b9f3-e15e-4e8d-9fc6-c739ccae1669");
        linkSchool.put("92 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=06c1c1e9-cb69-4d96-8121-bdb8d39055f7");
        linkSchool.put("93 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=db013a63-4a50-4259-e6b3-ce333ceb31ee");
        linkSchool.put("94 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=671aff43-5a1f-45fa-d127-22d5b321fd6f");
        linkSchool.put("95 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=1a9d41c8-539e-41cf-abc3-ca1978cb1027");
        linkSchool.put("96 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=0fe6f388-b88e-4fab-abdd-e1a98d65e262");
        linkSchool.put("97 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=44aae500-a11a-4cf6-b56b-9fa93a33dec3");
        linkSchool.put("98 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=861978aa-e1ae-41d3-fc13-625db5a57f0e");
        linkSchool.put("100 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=ce565f17-f00b-4d2c-a424-19d740bf3a6b");
        linkSchool.put("102 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=9c4453f2-cf03-4b30-99a4-c4233fe6ce0d");
        linkSchool.put("104 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=910b5959-4eae-482a-9f7c-637316901ed3");
        linkSchool.put("105 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=98d6f037-5868-48a5-8a2c-8ecd012cbb7f");
        linkSchool.put("106 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=1655b7c9-29c4-42c0-8aac-999000fa1292");
        linkSchool.put("107 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=914b1175-54c9-4892-e90d-523c10500da0");
        linkSchool.put("108 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=9d72688b-d6a4-4e62-d568-4b89d263ccee");
        linkSchool.put("109 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=79805d9a-a8f6-4de2-ddb4-d9f44ee29f4c");
        linkSchool.put("112 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e3d4b788-942d-4ba8-a1fd-bb0bfff6d076");
        linkSchool.put("113 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=a85a4b7a-d6c9-4f14-85f0-d9324417b304");
        linkSchool.put("114 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=8374314d-8856-4b55-8e6f-f12c557085af");
        linkSchool.put("115 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=59e394b3-517d-4c75-cb83-ac7a555a354a");
        linkSchool.put("116 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=63445b7d-b38c-4c86-973f-70f554054089");
        linkSchool.put("117 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=4d57de13-6771-4d52-8793-d40d5184b766");
        linkSchool.put("119 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=328607d4-4f8b-452b-cc96-dd55f0b00610");
        linkSchool.put("120 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=4b4baff3-4f65-4a45-eebe-5785b03367d8");
        linkSchool.put("121 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=48875613-02d6-472f-e01d-94131e8a80d0");
        linkSchool.put("122 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=caca612c-74e3-408c-d361-204599c0ece7");
        linkSchool.put("125 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=14ec2f6e-fd22-47b3-ff1b-643ee420b2a1");
        linkSchool.put("127 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=506ea66f-1aae-41b1-d557-eb213fc77b59");
        linkSchool.put("128 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=a8639dd0-263b-4d18-d70b-3ea12ba92544");
        linkSchool.put("129 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=389d06eb-dbad-47c3-b648-69517c660c8c");
        linkSchool.put("130 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=d733ba8a-b95c-4f1e-b41d-64b45712e03d");
        linkSchool.put("131 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=788548b8-504c-4cba-f73b-14cb5ee641ff");
        linkSchool.put("132 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=837a46cd-5ed6-4956-d05c-7f9036e9fbe8");
        linkSchool.put("134 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=a68ca39d-2925-4c6a-c9b3-f606d0b22817");
        linkSchool.put("135 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=79640291-b566-4a0e-ec25-b74dd09bac38");
        linkSchool.put("136 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=64b2e726-ed52-4430-c8b7-9815832c387f");
        linkSchool.put("137 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=7ed359ac-65aa-4e83-894d-a42100fe8cdf");
        linkSchool.put("138 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=f9376973-d7a9-4bf1-d980-61eec15d564e");
        linkSchool.put("140 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e8e5d8f6-c4ca-4307-b0c2-78c64c471817");
        linkSchool.put("141 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=ba308d9e-f387-4f93-b6bd-e6f7d97aa942");
        linkSchool.put("142 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=a0e8a722-45d1-44c6-ca26-7ee8532d7d7e");
        linkSchool.put("143 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=b6a14013-947d-41c3-eaea-beb75170840f");
        linkSchool.put("144 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=bf1142d7-b1e1-4111-d03b-3f2f7469fa81");
        linkSchool.put("145 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=8169f035-8b8a-40b4-f7ad-a63a6eaed399");
        linkSchool.put("146 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=20182bb4-e7d8-4114-b235-74ba9aec1cdd");
        linkSchool.put("147 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=767c23a4-7610-43f8-b47d-1bf8113647fb");
        linkSchool.put("148 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=9c340ab8-8f5f-4608-f891-53b715aa5076");
        linkSchool.put("149 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=dd2ade00-5920-4263-c6e7-1ab234cc79eb");
        linkSchool.put("150 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=6ed57c1b-3e3e-498f-fb5c-b268d1fb288b");
        linkSchool.put("151 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=60b7e5be-28c4-4915-eb86-99a4c56d68b0");
        linkSchool.put("154 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=b26fdab7-56a7-405f-9bda-4ca820362e56");
        linkSchool.put("155 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=3906d67d-62b1-4bd6-866b-4e4c1c9b8908");
        linkSchool.put("156 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=e5e69e63-4d5b-4f26-9ebd-874658f814ba");
        linkSchool.put("157 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=6d450c8d-7766-40e0-81ce-53e38cffabd0");
        linkSchool.put("159 лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=80bf13b3-198a-4e61-c77d-e0d4f2aa7cbb");
        linkSchool.put("161 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=7d963836-3585-498e-d6df-0468850843d5");
        linkSchool.put("163 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=54d6fedd-7c5c-4a55-ab83-6e978ac3d49c");
        linkSchool.put("164 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=b4d5c3db-ac55-41f5-cc75-8d021acc82c7");
        linkSchool.put("165 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=57ede52b-6775-4d1d-fc7e-fabb6cb658e5");
        linkSchool.put("166 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=6c64f60f-ab56-4d2c-bb85-cd52cf29c7c6");
        linkSchool.put("167 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=b52dc9e2-93a4-41ed-b376-4e2fc3eeef3d");
        linkSchool.put("168 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=a8e9f892-a841-4d88-e7ec-c896188c5df0");
        linkSchool.put("170 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=588dd248-f4b9-486c-db38-28cb520796d4");
        linkSchool.put("171 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=04fa7fad-c0be-4458-d5db-68069c3d4fef");
        linkSchool.put("173 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=90aba816-b8f5-43ea-fd80-5095753c8733");
        linkSchool.put("174 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=b0739a6e-0be2-4438-bcba-013a02c2758a");
        linkSchool.put("175 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=5300f48e-3127-4e60-feb6-edabb8c71c68");
        linkSchool.put("176 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=17a596ad-c0ed-4b48-98ea-8f737068b782");
        linkSchool.put("177 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=75f81bdf-5401-4386-e924-dcbb8a7b4da4");
        linkSchool.put("178 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=76be6d07-4028-4398-a2bd-a577a6bc0a13");
        linkSchool.put("179 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=71790c2a-de53-4a80-b17e-41bb2bd22601");
        linkSchool.put("180 Лицей", "https://edu-inform.ekadm.ru/api/queue?schoolId=67572ad9-2adc-4ae8-9661-8c21e51d9ba8");
        linkSchool.put("181 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=2af26360-4b42-414d-ff32-b050e06c16f9");
        linkSchool.put("183 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=86a1f3e1-9681-431d-d087-1bd5272753eb");
        linkSchool.put("184 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=226688f7-86d4-4ad2-b54d-7b2579656e06");
        linkSchool.put("197 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=0a498919-0fcf-45f2-af29-6da3ebab140b");
        linkSchool.put("200 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=eee15c16-86e5-4a33-c772-cebb831d56c2");
        linkSchool.put("205 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=a4e1e0e9-6754-450c-bced-03230c319c73");
        linkSchool.put("208 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=f03ec0e4-8f30-42ba-9f8d-2ab851245a34");
        linkSchool.put("210 Гимназия", "https://edu-inform.ekadm.ru/api/queue?schoolId=e4b2aced-962a-480d-b510-e2f8aa75ae9d");
        linkSchool.put("215 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=db3dc08f-e161-4583-a199-e33852b49e2d");
        linkSchool.put("221 Школа", "https://edu-inform.ekadm.ru/api/queue?schoolId=17234ea6-088b-449a-dc66-fafb314839df");
        linkSchool.put("Гимназия Арт-Этюд ", "https://edu-inform.ekadm.ru/api/queue?schoolId=500044d2-a83a-11e4-83e5-005056a87b3f");
        linkSchool.put("Гелиос", "https://edu-inform.ekadm.ru/api/queue?schoolId=a26a30d9-dfc5-4d95-d7dd-3217c404e84e");

        return linkSchool.get(number);
    }
//Блок сохранения Json в файл
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
    //читаем URL
    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
    //получаем JSON с сайта и перенаправляем поток для сохранения в файл
    public static void jsonWriteFile() throws IOException, JSONException {
        JSONObject json = readJsonFromUrl(urlSchool);
        fileSaveToFile(json.toString());

    }
    //сохраняем json в файл json.json
    private static void fileSaveToFile(String text) throws IOException {
        new FileOutputStream("json.json", false).close();
        try (FileOutputStream fos = new FileOutputStream("json.json")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
