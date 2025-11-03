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