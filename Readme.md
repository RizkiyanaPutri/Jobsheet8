#Pertanyaan Percobaan 1#
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?
Jawab: 
akibatnya adalah jumlah iterasi lebih banyak satu kali, karena 
jika i=1 berarti perulangan dimulai dari angka 1
jika i=0 berarti perulangan dimulai dari angka 0
Jadi iterasi sebelumnya berjalan 5 kali akan menjadi 6 kali(0-5)
2. Jika pada perulangan for, kondisi i<=N diubah menjadi i > N, apa akibatnya? Mengapa bisa demikian?
Jawab:
akibatnya perulangan tidak akan berjalan sama sekali karena nilai awal i = 1 dan kondisi awal dicek sebelum perulangan berjalan. Contoh i > 1 (false) -> perulangan tidak berjalan
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?
Jawab:
akibatnya perulangan akan menjadi infinite loop karena i dimulai dari 1 dan loop berjalan selama i <= N 
(i tidak akan pernah menjadi lebih besar dari N karena i-- membuat nilai i semakin kecil: 1 -> 0 -> -1 ..)

#Pertanyaan Percobaan 2#
1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa akibatnya? mengapa bisa demikian?
Jawab:
akibatnya perulangan luar berjalan 1 kali lebih banyak, jadi baris bintang yang dicetak menjadi N+1 baris, karena perulangan dimulai dari 0 bukan dari 1
2. Perhatikan perulangan dalam, jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? mengapa bisa demikian?
Jawab:
akibatnya setiap baris menampilkan N + 1 bintang, karena loop dimulai dari 0 bukan dari 1
3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?
Jawab:
Perulangan luar (iOuter) digunakan untuk mengatur jumlah baris bintang yang dicetak sedangkan perulangan dalam (i) digunakan untuk mengatur jumlah bintang per baris(jumlah kolom)
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? apa akibatnya jika sintaks tersebut dihilangkan?
Jawab:
Karena System.out.println(); digunakan untuk pindah baris baru setelah satu baris bintang selesai dicetak, jika sintaks tersebut dihilangkan akibatnya semua bintang akan dicetak dalam satu baris tanpa berpindah baris