# Garden
pa practise

Készítsünk programot a következő kertészeti szimulációhoz. Egy kertben különböző
növényeket tartanak, amelyeket gondozni kell. A kertész három fajta anyag közül
naponta csak egyet adhat az összes növénynek. Az anyagok fajtái: víz, tápoldat,
műtrágya. A növények az egyes anyagokra eltérően reagálnak: sorvadnak; tűrik,
ekkor nem nőnek; szeretik, ekkor nőnek. Egy növény kipusztulhat, ha sorvadás során
a mérete nullára csökken, illetve túlburjánzásban is kipusztulhat, ha túl naggyá válik.
A túlburjánzás határa növényfajtánként eltérő. Előfordul, hogy a kertész nem ad
nekik tápanyagot, ekkor garantáltan sorvadnak eggyel.
A konkrét kertben három fajta növényt termesztenek: kaktuszt, virágot és bokrot,
ezek jellemzői a következők:
• Kaktusz: Víz esetén a mérete eggyel csökken, tápoldat esetén eggyel nő,
műtrágya esetén eggyel nő. A túlburjánzás határa 4.
• Virág: Víz esetén a mérete hárommal nő, tápoldat és műtrágya esetén eggyel
csökken. A túlburjánzás határa 6.
• Bokor: Víz és műtrágya esetén a mérete eggyel nő, tápoldat esetén eggyel
csökken. A túlburjánzás határa 10.
A szimuláció adatait egy szövegfájl tartalmazza a következő formátumban. Az első
sorban szerepel a napok száma, majd az egyes napokon adott anyag fajtái: 1 – víz, 2
– tápoldat, 3 – műtrágya, illetve 0 – nincs tápanyag. Ezután soronként adottak az
egyes növények adatai. A sor első eleme a növény fajtája, ezt követi a növény
azonosítója, végül a növény kezdeti mérete szerepel a sorban.
A program kérje be a fájl nevét, majd írja ki az életben maradt növények azonosítóját.
Ehhez valósítsuk meg a növényeket reprezentáló osztályokat, amelyek egy absztrakt
növény osztály leszármazottai.
