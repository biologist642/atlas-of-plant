<!DOCTYPE html>
<html lang="ku" dir="rtl" id="html-tag">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NovaPlant | ئەتڵەسی زانستی پێشکەوتوو</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Kufi+Arabic:wght@300;400;600;700&family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
    
    <style>
        /* 🎨 گۆڕاوە سەرەکییەکان */
        :root {
            --bg-main: #f8fafc;
            --bg-navbar: rgba(15, 43, 29, 0.95); 
            --border-nav: 1px solid rgba(255, 255, 255, 0.08);
            --bg-chapters: #f2fbf5; 
            --card-bg: #ffffff;
            --text-main: #0f172a;
            --text-muted: #475569;
            --text-nav: #f8fafc;
            --bg-footer: #05140b; 
            --primary: #10b981;
            --shadow-sm: 0 1px 3px rgba(0,0,0,0.05);
            --shadow-md: 0 4px 6px -1px rgba(0,0,0,0.05), 0 2px 4px -1px rgba(0,0,0,0.03);
            --shadow-lg: 0 10px 15px -3px rgba(0,0,0,0.05), 0 4px 6px -2px rgba(0,0,0,0.02);
            --radius: 16px;
            --transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
        }

        .dark-mode {
            --bg-main: #0b1320;
            --bg-navbar: rgba(10, 18, 30, 0.95);
            --border-nav: 1px solid rgba(255, 255, 255, 0.05);
            --bg-chapters: #0f1d30;
            --card-bg: #132238;
            --text-main: #f1f5f9;
            --text-muted: #94a3b8;
            --text-nav: #f1f5f9;
            --bg-footer: #070d16;
            --shadow-sm: 0 1px 3px rgba(0,0,0,0.2);
            --shadow-md: 0 4px 6px -1px rgba(0,0,0,0.2);
            --shadow-lg: 0 10px 15px -3px rgba(0,0,0,0.3);
        }

        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: 'Noto Kufi Arabic', 'Poppins', sans-serif;
            background-color: var(--bg-main);
            color: var(--text-main);
            line-height: 1.7;
            overflow-x: hidden;
            transition: background-color 0.3s, color 0.3s;
        }

        a {
            text-decoration: none;
            color: inherit;
        }

        /* 🗺️ هێڵی ڕێدۆزی (Navbar) */
        .navbar {
            position: fixed;
            top: 0; left: 0; right: 0;
            height: 70px;
            background: var(--bg-navbar);
            backdrop-filter: blur(12px);
            -webkit-backdrop-filter: blur(12px);
            border-bottom: var(--border-nav);
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 0 2rem;
            z-index: 1000;
            transition: var(--transition);
        }

        .nav-logo {
            font-size: 1.4rem;
            font-weight: 700;
            color: #ffffff;
            display: flex;
            align-items: center;
            gap: 0.5rem;
        }

        .nav-logo span {
            color: var(--primary);
        }

        .nav-links {
            display: flex;
            gap: 2rem;
            list-style: none;
        }

        .nav-links a {
            color: rgba(255, 255, 255, 0.8);
            font-size: 0.95rem;
            font-weight: 400;
            transition: var(--transition);
            position: relative;
            padding: 0.25rem 0;
        }

        .nav-links a:hover, .nav-links a.active {
            color: #ffffff;
        }

        .nav-links a::after {
            content: '';
            position: absolute;
            bottom: 0; left: 0; width: 0; height: 2px;
            background: var(--primary);
            transition: var(--transition);
        }

        .nav-links a:hover::after, .nav-links a.active::after {
            width: 100%;
        }

        .nav-actions {
            display: flex;
            align-items: center;
            gap: 1rem;
        }

        .btn-theme {
            background: rgba(255, 255, 255, 0.08);
            border: none;
            width: 40px; height: 40px;
            border-radius: 50%;
            cursor: pointer;
            display: flex;
            align-items: center;
            justify-content: center;
            color: #ffffff;
            transition: var(--transition);
        }

        .btn-theme:hover {
            background: rgba(255, 255, 255, 0.15);
            transform: scale(1.05);
        }

        .btn-start {
            background: var(--primary);
            color: #ffffff;
            padding: 0.6rem 1.5rem;
            border-radius: 30px;
            font-weight: 600;
            font-size: 0.9rem;
            border: none;
            cursor: pointer;
            transition: var(--transition);
            box-shadow: 0 4px 14px rgba(16, 185, 129, 0.3);
        }

        .btn-start:hover {
            transform: translateY(-2px);
            box-shadow: 0 6px 20px rgba(16, 185, 129, 0.4);
        }

        .menu-toggle {
            display: none;
            flex-direction: column;
            gap: 5px;
            cursor: pointer;
            background: none;
            border: none;
        }

        .menu-toggle span {
            width: 25px; height: 3px;
            background: #ffffff;
            border-radius: 2px;
            transition: var(--transition);
        }

        /* 🚀 بەشی نوێی سەرەکی (Hero Section) بەپێی وێنەکە */
        .hero-section {
            padding: 140px 2rem 80px 2rem;
            max-width: 1300px;
            margin: 0 auto;
            display: grid;
            grid-template-columns: 1.2fr 1fr;
            gap: 4rem;
            align-items: center;
        }

        .hero-content {
            display: flex;
            flex-direction: column;
            gap: 1.5rem;
        }

        .hero-badge {
            align-self: flex-start;
            background: rgba(16, 185, 129, 0.1);
            color: var(--primary);
            padding: 0.4rem 1.2rem;
            border-radius: 50px;
            font-size: 0.85rem;
            font-weight: 600;
            border: 1px solid rgba(16, 185, 129, 0.2);
        }

        .hero-title {
            font-size: 3rem;
            line-height: 1.3;
            font-weight: 700;
        }

        .hero-title span {
            color: var(--primary);
            position: relative;
        }

        .hero-desc {
            font-size: 1.1rem;
            color: var(--text-muted);
            max-width: 550px;
        }

        .hero-btns {
            display: flex;
            gap: 1rem;
            margin-top: 1rem;
        }

        .btn-primary {
            background: var(--primary);
            color: white;
            padding: 0.8rem 2rem;
            border-radius: 12px;
            font-weight: 600;
            box-shadow: 0 10px 20px rgba(16, 185, 129, 0.2);
            transition: var(--transition);
        }

        .btn-primary:hover {
            transform: translateY(-3px);
            box-shadow: 0 15px 25px rgba(16, 185, 129, 0.3);
        }

        .btn-secondary {
            background: transparent;
            color: var(--text-main);
            border: 2px solid rgba(0, 0, 0, 0.1);
            padding: 0.8rem 2rem;
            border-radius: 12px;
            font-weight: 600;
            transition: var(--transition);
        }

        .dark-mode .btn-secondary {
            border-color: rgba(255, 255, 255, 0.1);
        }

        .btn-secondary:hover {
            background: rgba(0, 0, 0, 0.02);
        }

        .dark-mode .btn-secondary:hover {
            background: rgba(255, 255, 255, 0.05);
        }

        /* ئامارەکان خوار هێرۆ */
        .hero-stats {
            display: flex;
            gap: 3rem;
            margin-top: 2rem;
            padding-top: 2rem;
            border-top: 1px solid rgba(0,0,0,0.06);
        }

        .dark-mode .hero-stats {
            border-top-color: rgba(255,255,255,0.06);
        }

        .stat-item h3 {
            font-size: 2rem;
            font-weight: 700;
            color: var(--primary);
        }

        .stat-item p {
            font-size: 0.9rem;
            color: var(--text-muted);
        }

        /* بەشی وێنەی لای چەپ */
        .hero-image-container {
            position: relative;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .hero-circle-bg {
            position: absolute;
            width: 100%;
            height: 100%;
            background: radial-gradient(circle, rgba(16, 185, 129, 0.15) 0%, transparent 70%);
            z-index: 1;
        }

        .hero-main-img {
            width: 100%;
            max-width: 480px;
            height: auto;
            object-fit: cover;
            border-radius: 24px;
            z-index: 2;
            position: relative;
        }

        /* 📚 بەشی بەشەکان (Chapters) */
        .chapters-section {
            background-color: var(--bg-chapters);
            padding: 80px 2rem;
            transition: var(--transition);
        }

        .section-header {
            text-align: center;
            max-width: 600px;
            margin: 0 auto 50px auto;
        }

        .section-header h2 {
            font-size: 2.2rem;
            font-weight: 700;
            margin-bottom: 0.75rem;
        }

        .section-header p {
            color: var(--text-muted);
            font-size: 1rem;
        }

        .chapters-grid {
            max-width: 1200px;
            margin: 0 auto;
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 2rem;
        }

        .chapter-card {
            background: var(--card-bg);
            border-radius: var(--radius);
            padding: 2.5rem 2rem;
            box-shadow: var(--shadow-sm);
            transition: var(--transition);
            border: 1px solid rgba(0,0,0,0.02);
            display: flex;
            flex-direction: column;
            gap: 1.2rem;
            position: relative;
            overflow: hidden;
        }

        .dark-mode .chapter-card {
            border: 1px solid rgba(255,255,255,0.02);
        }

        .chapter-card:hover {
            transform: translateY(-5px);
            box-shadow: var(--shadow-lg);
            border-color: rgba(16, 185, 129, 0.2);
        }

        .chapter-icon {
            width: 55px; height: 55px;
            background: rgba(16, 185, 129, 0.08);
            color: var(--primary);
            border-radius: 12px;
            display: flex; align-items: center; justify-content: center;
            font-size: 1.5rem;
            font-weight: bold;
        }

        .chapter-card h3 {
            font-size: 1.3rem;
            font-weight: 600;
        }

        .chapter-card p {
            color: var(--text-muted);
            font-size: 0.95rem;
            flex-grow: 1;
        }

        .chapter-link {
            display: inline-flex;
            align-items: center;
            gap: 0.5rem;
            color: var(--primary);
            font-weight: 600;
            font-size: 0.95rem;
            margin-top: 0.5rem;
        }

        /* ℹ️ بەشی دەربارە (About Section) - بەبێ وێنەی کۆمپیوتەر */
        .about-section {
            padding: 100px 2rem;
            max-width: 1200px;
            margin: 0 auto;
        }

        .about-wrapper {
            background: var(--card-bg);
            border-radius: var(--radius);
            padding: 4rem 3rem;
            box-shadow: var(--shadow-md);
            text-align: center;
            max-width: 800px;
            margin: 0 auto;
        }

        .about-wrapper h2 {
            font-size: 2.2rem;
            margin-bottom: 1.5rem;
        }

        .about-wrapper p {
            color: var(--text-muted);
            font-size: 1.1rem;
            margin-bottom: 2rem;
            line-height: 1.8;
        }

        /* 👣 پێڕەنگ (Footer) */
        .footer {
            background: var(--bg-footer);
            color: #ffffff;
            padding: 40px 2rem;
            text-align: center;
            font-size: 0.95rem;
            border-top: 1px solid rgba(255,255,255,0.05);
        }

        .footer p {
            color: rgba(255, 255, 255, 0.6);
        }

        /* 📱 وەڵامدەرەوە (Responsive) */
        @media (max-width: 1024px) {
            .hero-section {
                grid-template-columns: 1fr;
                text-align: center;
                gap: 3rem;
                padding-top: 120px;
            }
            .hero-badge { align-self: center; }
            .hero-desc { margin: 0 auto; }
            .hero-btns { justify-content: center; }
            .hero-stats { justify-content: center; }
            .hero-main-img { max-width: 400px; }
        }

        @media (max-width: 768px) {
            .nav-links { display: none; }
            .menu-toggle { display: flex; }
            .hero-title { font-size: 2.2rem; }
            .about-wrapper { padding: 2.5rem 1.5rem; }
        }
    </style>
</head>
<body>

    <nav class="navbar">
        <div class="nav-logo">
            Nova<span>Plant</span>
        </div>
        <ul class="nav-links">
            <li><a href="#" class="active">سەرەکی</a></li>
            <li><a href="#chapters">بەشەکان</a></li>
            <li><a href="#about">دەربارە</a></li>
        </ul>
        <div class="nav-actions">
            <button class="btn-theme" id="theme-btn" aria-label="Toggle Theme">🌙</button>
            <button class="btn-start">دەستپێبکە</button>
            <button class="menu-toggle" id="menu-btn">
                <span></span><span></span><span></span>
            </button>
        </div>
    </nav>

    <header class="hero-section">
        <div class="hero-content">
            <div class="hero-badge">ئەتڵەسی زانستی پێشکەوتوو</div>
            <h1 class="hero-title">جیهانی زانست و <span>ڕووەکناسی</span> بە شێوازێکی نوێ</h1>
            <p class="hero-desc">لێرەوە گەشتەکەت دەستپێبکە بۆ ناو قووڵایی زانیارییە سروشتییەکان و بەشە جیاوازەکانی زانستی ڕووەک بە گرافیک و ڕوونکردنەوەی مۆدێرن.</p>
            <div class="hero-btns">
                <a href="#chapters" class="btn-primary">گەڕان و گەشتکردن</a>
                <a href="#about" class="btn-secondary">زیاتر بزانە</a>
            </div>
            <div class="hero-stats">
                <div class="stat-item">
                    <h3>+١٠k</h3>
                    <p>خوێنەران</p>
                </div>
                <div class="stat-item">
                    <h3>+٥٠</h3>
                    <p>بەشی زانستی</p>
                </div>
                <div class="stat-item">
                    <h3>١٠٠٪</h3>
                    <p>سەرچاوەی باوەڕپێکراو</p>
                </div>
            </div>
        </div>
        <div class="hero-image-container">
            <div class="hero-circle-bg"></div>
            <img src="https://images.unsplash.com/photo-1516259762381-22954d7d3ad2?q=80&w=600" alt="NovaPlant Scientific Illustration" class="hero-main-img">
        </div>
    </header>

    <section class="chapters-section" id="chapters">
        <div class="section-header">
            <h2>بەشەکانی ئەتڵەسەکە</h2>
            <p>تەوەرە سەرەکییەکانی زانستی ڕووەکناسی و پۆلێنکردنە ژینگەییەکان لێرەوە بخوێنەوە.</p>
        </div>
        <div class="chapters-grid">
            <div class="chapter-card">
                <div class="chapter-icon">٠١</div>
                <h3>شانە و پێکهاتەی ڕووەک</h3>
                <p>لێکۆڵینەوە لە پێکهاتەی مایکرۆسکۆپی و جۆرەکانی شانەی ڕووەکی.</p>
                <a href="#" class="chapter-link">خوێندنەوە ←</a>
            </div>
            <div class="chapter-card">
                <div class="chapter-icon">٠٢</div>
                <h3>کرداری ڕۆشنەپێکهاتن</h3>
                <p>چۆنیەتی بەرهەمهێنانی وزە و خۆراک لەلایەن ڕووەکەکانەوە بە درێژی.</p>
                <a href="#" class="chapter-link">خوێندنەوە ←</a>
            </div>
            <div class="chapter-card">
                <div class="chapter-icon">٠٣</div>
                <h3>پۆلێنکردنی ڕووەکەکان</h3>
                <p>تێگەیشتن لە خێزان و جۆرە جیاوازەکانی شانشینی ڕووەک.</p>
                <a href="#" class="chapter-link">خوێندنەوە ←</a>
            </div>
        </div>
    </section>

    <section class="about-section" id="about">
        <div class="about-wrapper">
            <h2>دەربارەی پڕۆژەکە</h2>
            <p>ئەم سەکۆیە هۆکارێکی یارمەتیدەرە بۆ قوتابییان و ئارەزوومەندانی زانست بۆ ئەوەی بە شێوازێکی بینراو و ئاسان لە ئاڵۆزترین بابەتەکانی زیندەوەرناسی و ڕووەکناسی تێبگەن.</p>
            <button class="btn-start">پەیوەندیمان پێوە بکە</button>
        </div>
    </section>

    <footer class="footer">
        <p>مافی لەبەرگرتنەوەی پارێزراوە © 2026 | NovaPlant</p>
    </footer>

    <script>
        // 🌓 گۆڕینی دۆخی تاریک و ڕوون
        const themeBtn = document.getElementById("theme-btn");
        const htmlTag = document.getElementById("html-tag");

        if (localStorage.getItem("theme") === "dark") {
            htmlTag.classList.add("dark-mode");
            themeBtn.textContent = "☀️";
        }

        themeBtn.addEventListener("click", () => {
            htmlTag.classList.toggle("dark-mode");
            const isDark = htmlTag.classList.contains("dark-mode");
            themeBtn.textContent = isDark ? "☀️" : "🌙";
            localStorage.setItem("theme", isDark ? "dark" : "light");
        });

        // 📱 مێنووی مۆبایل
        const menuBtn = document.getElementById("menu-btn");
        const navLinks = document.querySelector(".nav-links");

        menuBtn.addEventListener("click", () => {
            navLinks.style.display = navLinks.style.display === "flex" ? "none" : "flex";
            if(navLinks.style.display === "flex") {
                navLinks.style.flexDirection = "column";
                navLinks.style.position = "absolute";
                navLinks.style.top = "70px";
                navLinks.style.left = "0";
                navLinks.style.right = "0";
                navLinks.style.background = "var(--bg-navbar)";
                navLinks.style.padding = "2rem";
                navLinks.style.textAlign = "center";
            }
        });
    </script>
</body>
</html>