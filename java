const systemProductsDataset = [
    {
        id: "prod-001",
        nameEn: "Urban Technical Shorts",
        namePt: "Shorts Técnico Urban",
        price: 49.99,
        category: "apparel",
        stock: 14,
        rating: 4.8,
        reviews: [
            { author: "Alex D.", score: 5, textEn: "Excellent architectural fit.", textPt: "Excelente caimento estrutural." }
        ],
        views: 3410,
        favorites: 890,
        composition: "Upper Core Structure Blend"
    },
    {
        id: "prod-002",
        nameEn: "Urban Performance Sneaker",
        namePt: "Tênis Performance Urban",
        price: 129.99,
        category: "apparel",
        stock: 5,
        rating: 4.9,
        reviews: [
            { author: "Chris M.", score: 5, textEn: "Maximum sole responsiveness.", textPt: "Máxima responsividade do solado." }
        ],
        views: 5120,
        favorites: 1420,
        composition: "Footwear Compression Base"
    },
    {
        id: "prod-003",
        nameEn: "Compression Training Leggings",
        namePt: "Calça Legging de Compressão",
        price: 59.99,
        category: "apparel",
        stock: 22,
        rating: 4.6,
        reviews: [],
        views: 1890,
        favorites: 410,
        composition: "Lower Core Structure Blend"
    },
    {
        id: "prod-004",
        nameEn: "Engineered Aerodynamic Tee",
        namePt: "Camiseta Aerodinâmica Engineered",
        price: 39.99,
        category: "apparel",
        stock: 8,
        rating: 4.7,
        reviews: [],
        views: 2940,
        favorites: 630,
        composition: "Upper Core Structure Blend"
    },
    {
        id: "prod-005",
        nameEn: "Industrial Strength Kettlebell",
        namePt: "Kettlebell Força Industrial",
        price: 89.99,
        category: "equipment",
        stock: 3,
        rating: 5.0,
        reviews: [],
        views: 4110,
        favorites: 970,
        composition: "Heavy Infrastructure Element"
    },
    {
        id: "prod-006",
        nameEn: "Ergonomic Matte Shaker",
        namePt: "Coqueteleira Fosca Ergonômica",
        price: 19.99,
        category: "equipment",
        stock: 45,
        rating: 4.3,
        reviews: [],
        views: 1240,
        favorites: 180,
        composition: "Accessory Fluid Vessel"
    }
];

const translationMatrix = {
    en: {
        navHome: "Home",
        navCatalog: "Catalog",
        navDetail: "Product Details",
        navUser: "User Portal",
        navLab: "Innovation Lab",
        navCommunity: "Community",
        navAnalytics: "Analytics",
        promoText: "SYSTEM UPDATE: MAXIMUM PERFORMANCE GEAR PROTOCOL ACTIVE",
        scarcityLabel: "Institutional Asset Scarcity Level",
        missionsTitle: "Daily Fitness Missions Protocol",
        rewardsLabel: "Accumulated Balance:",
        recommendationsTitle: "Engineered Recommendations",
        completeSpectrum: "Complete Spectrum",
        apparel: "Apparel",
        equipment: "Equipment",
        lowHigh: "Price: Ascending",
        highLow: "Price: Descending",
        standardOrder: "Standard Order",
        detailsFallback: "No specific asset selected. Access the Complete Spectrum catalog.",
        loginTitle: "Account Authentication",
        registerTitle: "Identity Registry",
        profileTitle: "Identity Configuration Data",
        aiTitle: "AI Style Core Recommendation Engine",
        fittingTitle: "Virtual Fitting Lab Simulator",
        composerTitle: "Dynamic Outfit Composer",
        quizTitle: "Multistep Fitness Gear Quiz",
        bmiTitle: "Biometric Metric Index Calculator (BMI)",
        ecoTitle: "Corporate Sustainability Analytics",
        vaultTitle: "Identity Achievement Vault",
        compTrayLabel: "Comparison Selection Registry",
        cartDrawerTitle: "Shopping Cart Registry",
        wishlistDrawerTitle: "Wishlist Registry",
        compModalTitle: "Product Matrix Correlation Matrix",
        finalCheckout: "Finalize Acquisition Protocol",
        totalLabel: "Financial Subtotal",
        emptyReviews: "No evaluation entries compiled for this asset.",
        addReviewBtn: "Transmit Evaluation Entry",
        addToCart: "Deploy to Cart",
        compareTxt: "Correlate Matrix",
        detailsTxt: "Inspect Matrix",
        postBroadcast: "Broadcast Post",
        rankingTitle: "Weekly Performance Standings",
        lookWeekTitle: "Look Sequence of the Week",
        corporateTitle: "Realtime Corporate Analytics Core",
        revenueLabel: "Total Aggregated Revenue",
        growthLabel: "Monthly Scaling Coefficient",
        topViewedLabel: "Top Catalog View Index",
        topFavLabel: "Top Wishlist Capture Count",
        trajectoryLabel: "Asset Volume Conversion Trajectory",
        validationLabel: "Customer Validation Index Tendency",
        inventoryLabel: "System Asset Inventory & Stock Registry"
    },
    pt: {
        navHome: "Início",
        navCatalog: "Catálogo",
        navDetail: "Detalhes do Produto",
        navUser: "Portal do Usuário",
        navLab: "Laboratório de Inovação",
        navCommunity: "Comunidade",
        navAnalytics: "Métricas Corporativas",
        promoText: "ATUALIZAÇÃO DE SISTEMA: PROTOCOLO DE EQUIPAMENTO MÁXIMO ATIVO",
        scarcityLabel: "Nível de Escassez de Ativos Institucionais",
        missionsTitle: "Protocolo de Missões Fitness Diárias",
        rewardsLabel: "Saldo Acumulado:",
        recommendationsTitle: "Recomendações de Engenharia",
        completeSpectrum: "Espectro Completo",
        apparel: "Vestuário",
        equipment: "Equipamentos",
        lowHigh: "Preço: Crescente",
        highLow: "Preço: Decrescente",
        standardOrder: "Ordem Padrão",
        detailsFallback: "Nenhum ativo selecionado. Acesse o catálogo de Espectro Completo.",
        loginTitle: "Autenticação de Conta",
        registerTitle: "Registro de Identidade",
        profileTitle: "Dados de Configuração de Identidade",
        aiTitle: "Motor de Recomendação AI Style Core",
        fittingTitle: "Simulador de Provador Virtual",
        composerTitle: "Compositor Dinâmico de Looks",
        quizTitle: "Quiz de Equipamento Fitness Multi-etapas",
        bmiTitle: "Calculadora de Índice de Métrica Biométrica (IMC)",
        ecoTitle: "Métricas de Sustentabilidade Corporativa",
        vaultTitle: "Cofre de Conquistas de Identidade",
        compTrayLabel: "Registro de Seleção de Comparação",
        cartDrawerTitle: "Registro do Carrinho de Compras",
        wishlistDrawerTitle: "Registro de Lista de Desejos",
        compModalTitle: "Matriz de Correlação de Produtos",
        finalCheckout: "Finalizar Protocolo de Aquisição",
        totalLabel: "Subtotal Financeiro",
        emptyReviews: "Nenhuma avaliação compilada para este ativo.",
        addReviewBtn: "Transmitir Avaliação",
        addToCart: "Implantar no Carrinho",
        compareTxt: "Correlacionar",
        detailsTxt: "Inspecionar",
        postBroadcast: "Transmitir Publicação",
        rankingTitle: "Classificação Semanal de Performance",
        lookWeekTitle: "Sequência de Look da Semana",
        corporateTitle: "Núcleo de Métricas Corporativas em Tempo Real",
        revenueLabel: "Receita Total Agregada",
        growthLabel: "Coeficiente de Escalonamento Mensal",
        topViewedLabel: "Índice de Visualização de Catálogo",
        topFavLabel: "Capturas de Lista de Desejos",
        trajectoryLabel: "Trajetória de Conversão de Volume de Ativos",
        validationLabel: "Tendência do Índice de Validação do Cliente",
        inventoryLabel: "Inventário de Ativos e Registro de Estoque"
    }
};

const internalApplicationState = {
    activeLanguage: "en",
    activeTheme: "light",
    shoppingCart: [],
    wishlist: [],
    comparisonRegistry: [],
    userPoints: 0,
    unlockedBadges: [],
    activeViewIndex: 0,
    authenticatedUser: null,
    selectedProductIdForDetails: null,
    communityPosts: [
        { id: "post-1", author: "Alpha_Trainer", text: "Target frequency achieved. 5000 meters rowing split completed under structural parameters.", likes: 12 },
        { id: "post-2", author: "Delta_Runner", text: "Aerodynamic Tee operational cycle tested. Thermal regulation threshold optimized.", likes: 8 }
    ],
    leaderboard: [
        { name: "Alpha_Trainer", score: 2450 },
        { name: "Beta_Lifter", score: 2100 },
        { name: "Delta_Runner", score: 1950 },
        { name: "Gamma_Flex", score: 1800 }
    ]
};

function initializeApplicationCore() {
    loadPersistedStateFromStorage();
    registerArchitecturalEventListeners();
    renderGlobalLocalizedUI();
    applyDynamicThemeState();
    executeHorizontalViewShift(internalApplicationState.activeViewIndex);
    renderPrimaryCatalogGrid();
    renderHomeRecommendations();
    rebuildCartDrawerInterface();
    rebuildWishlistDrawerInterface();
    updateComparisonTrayDock();
    initializeInnovationLabSelectors();
    evaluateAchievementVaultCriteria();
    renderCommunityHubModules();
    renderCorporateAnalyticsEngine();
    spawnSocialProofNotificationLoop();
}

function loadPersistedStateFromStorage() {
    const savedLang = localStorage.getItem("uf_lang");
    if (savedLang) internalApplicationState.activeLanguage = savedLang;
    
    const savedTheme = localStorage.getItem("uf_theme");
    if (savedTheme) internalApplicationState.activeTheme = savedTheme;
    
    const savedCart = localStorage.getItem("uf_cart");
    if (savedCart) internalApplicationState.shoppingCart = JSON.parse(savedCart);
    
    const savedWish = localStorage.getItem("uf_wish");
    if (savedWish) internalApplicationState.wishlist = JSON.parse(savedWish);
    
    const savedPoints = localStorage.getItem("uf_points");
    if (savedPoints) internalApplicationState.userPoints = parseInt(savedPoints, 10);
    
    const savedUser = localStorage.getItem("uf_user");
    if (savedUser) internalApplicationState.authenticatedUser = JSON.parse(savedUser);
}

function saveStateToLocalStorage() {
    localStorage.setItem("uf_lang", internalApplicationState.activeLanguage);
    localStorage.setItem("uf_theme", internalApplicationState.activeTheme);
    localStorage.setItem("uf_cart", JSON.stringify(internalApplicationState.shoppingCart));
    localStorage.setItem("uf_wish", JSON.stringify(internalApplicationState.wishlist));
    localStorage.setItem("uf_points", internalApplicationState.userPoints.toString());
    if (internalApplicationState.authenticatedUser) {
        localStorage.setItem("uf_user", JSON.stringify(internalApplicationState.authenticatedUser));
    } else {
        localStorage.removeItem("uf_user");
    }
}

function registerArchitecturalEventListeners() {
    document.querySelectorAll(".nav-link").forEach(link => {
        link.addEventListener("click", (e) => {
            const index = parseInt(e.target.getAttribute("data-target"), 10);
            executeHorizontalViewShift(index);
        });
    });

    document.getElementById("brand-logo-btn").addEventListener("click", () => {
        executeHorizontalViewShift(0);
    });

    document.getElementById("lang-toggle-btn").addEventListener("click", () => {
        internalApplicationState.activeLanguage = internalApplicationState.activeLanguage === "en" ? "pt" : "en";
        saveStateToLocalStorage();
        renderGlobalLocalizedUI();
        renderPrimaryCatalogGrid();
        renderHomeRecommendations();
        rebuildCartDrawerInterface();
        rebuildWishlistDrawerInterface();
        renderProductDetailsView();
    });

    document.getElementById("theme-toggle-btn").addEventListener("click", () => {
        internalApplicationState.activeTheme = internalApplicationState.activeTheme === "light" ? "dark" : "light";
        saveStateToLocalStorage();
        applyDynamicThemeState();
    });

    document.getElementById("cart-toggle-btn").addEventListener("click", () => {
        document.getElementById("cart-drawer-element").classList.add("active");
    });
    document.getElementById("cart-close-trigger").addEventListener("click", () => {
        document.getElementById("cart-drawer-element").classList.remove("active");
    });

    document.getElementById("wishlist-toggle-btn").addEventListener("click", () => {
        document.getElementById("wishlist-drawer-element").classList.add("active");
    });
    document.getElementById("wishlist-close-trigger").addEventListener("click", () => {
        document.getElementById("wishlist-drawer-element").classList.remove("active");
    });

    document.getElementById("catalog-search").addEventListener("input", () => triggerCatalogFilteringSequence());
    document.getElementById("catalog-category-filter").addEventListener("change", () => triggerCatalogFilteringSequence());
    document.getElementById("catalog-sort").addEventListener("change", () => triggerCatalogFilteringSequence());

    document.getElementById("sticky-search-input").addEventListener("input", (e) => {
        document.getElementById("catalog-search").value = e.target.value;
        executeHorizontalViewShift(1);
        triggerCatalogFilteringSequence();
    });
    document.getElementById("sticky-filter-category").addEventListener("change", (e) => {
        const val = e.target.value;
        document.getElementById("catalog-category-filter").value = val === "all" ? "all" : val;
        executeHorizontalViewShift(1);
        triggerCatalogFilteringSequence();
    });

    document.querySelectorAll(".mission-checkbox").forEach(box => {
        box.addEventListener("change", (e) => {
            const pts = parseInt(e.target.getAttribute("data-points"), 10);
            if (e.target.checked) {
                internalApplicationState.userPoints += pts;
            } else {
                internalApplicationState.userPoints -= pts;
            }
            saveStateToLocalStorage();
            document.getElementById("rewards-points-value").textContent = internalApplicationState.userPoints;
            evaluateAchievementVaultCriteria();
        });
    });

    document.getElementById("register-password-field").addEventListener("input", (e) => {
        const val = e.target.value;
        const meter = document.getElementById("pwd-strength-indicator");
        const log = document.getElementById("password-validation-log");
        let score = 0;
        if (val.length >= 8) score += 33;
        if (/[A-Z]/.test(val)) score += 33;
        if (/[0-9]/.test(val)) score += 34;
        
        meter.style.width = score + "%";
        if (score < 66) {
            meter.style.backgroundColor = "#ff3b30";
            log.textContent = "Weak Matrix Password Rule Block";
        } else if (score < 100) {
            meter.style.backgroundColor = "#0080ff";
            log.textContent = "Medium Security Structure";
        } else {
            meter.style.backgroundColor = "#34c759";
            log.textContent = "Optimal Security Matrix Confirmed";
        }
    });

    document.getElementById("register-form-element").addEventListener("submit", (e) => {
        e.preventDefault();
        const inputs = e.target.querySelectorAll("input");
        const name = inputs[0].value;
        const email = inputs[1].value;
        const pass = inputs[2].value;
        if (pass.length < 8) return;

        internalApplicationState.authenticatedUser = { name, email };
        saveStateToLocalStorage();
        toggleUserPortalLayoutVisibility();
    });

    document.getElementById("login-form-element").addEventListener("submit", (e) => {
        e.preventDefault();
        const inputs = e.target.querySelectorAll("input");
        internalApplicationState.authenticatedUser = { name: "Operator Identity", email: inputs[0].value };
        saveStateToLocalStorage();
        toggleUserPortalLayoutVisibility();
    });

    document.getElementById("ai-recommend-trigger").addEventListener("click", () => {
        const goal = document.getElementById("ai-fitness-goal").value;
        const output = document.getElementById("ai-style-output");
        if (internalApplicationState.activeLanguage === "en") {
            output.textContent = "AI Matrix Output: Recommended Upper Core Structure Blend + Footwear Compression Base adjusted for " + goal + " track parameters.";
        } else {
            output.textContent = "Resultado da IA: Recomendado combinação de Tecidos de Compressão Superior + Calçados de Amortecimento de Impacto para objetivos de " + goal + ".";
        }
    });

    document.getElementById("bmi-calculate-trigger").addEventListener("click", () => {
        const h = parseFloat(document.getElementById("bmi-height-input").value) / 100;
        const w = parseFloat(document.getElementById("bmi-weight-input").value);
        const bmi = w / (h * h);
        const output = document.getElementById("bmi-output-panel");
        let size = "M";
        if (bmi > 25) size = "XL";
        if (bmi < 18.5) size = "S";

        if (internalApplicationState.activeLanguage === "en") {
            output.textContent = "Computed BMI: " + bmi.toFixed(2) + " [Recommended Structural Frame Size: " + size + "]. Suggested assets: Heavy Infrastructure Kettlebell Matrix.";
        } else {
            output.textContent = "IMC Calculado: " + bmi.toFixed(2) + " [Tamanho de Grade Recomendado: " + size + "]. Ativos sugeridos: Kettlebell Força Industrial.";
        }
    });

    document.getElementById("composer-checkout-btn").addEventListener("click", () => {
        systemProductsDataset.forEach(p => {
            if (p.id === "prod-001" || p.id === "prod-002") {
                executeProductCartDeployment(p.id);
            }
        });
        document.getElementById("cart-drawer-element").classList.add("active");
    });

    document.querySelectorAll(".quiz-opt-btn").forEach(btn => {
        btn.addEventListener("click", (e) => {
            const currentStep = e.target.parentElement;
            const nextStepNum = parseInt(currentStep.getAttribute("data-step"), 10) + 1;
            currentStep.classList.remove("active");
            const nextStep = document.querySelector(".quiz-step[data-step='" + nextStepNum + "']");
            if (nextStep) {
                nextStep.classList.add("active");
                if (nextStepNum === 3) {
                    const finalRes = document.getElementById("quiz-final-result");
                    if (internalApplicationState.activeLanguage === "en") {
                        finalRes.textContent = "Quiz Optimization Matrix complete: Recommended deployment code variant Apparel Division Core Alpha.";
                    } else {
                        finalRes.textContent = "Otimização de Questionário concluída: Recomendado variante de vestuário Linha de Alta Performance Alpha.";
                    }
                }
            }
        });
    });

    document.getElementById("post-publish-trigger").addEventListener("click", () => {
        const txt = document.getElementById("post-input-textarea").value;
        if (!txt) return;
        const post = {
            id: "post-" + Date.now(),
            author: internalApplicationState.authenticatedUser ? internalApplicationState.authenticatedUser.name : "Guest_Operator",
            text: txt,
            likes: 0
        };
        internalApplicationState.communityPosts.unshift(post);
        document.getElementById("post-input-textarea").value = "";
        renderCommunityHubModules();
    });

    document.getElementById("comparison-execute-trigger").addEventListener("click", () => {
        if (internalApplicationState.comparisonRegistry.length === 0) return;
        const modal = document.getElementById("comparison-modal-element");
        const tableSlot = document.getElementById("comparison-matrix-table-output");
        
        let tableHtml = "<table class='comparison-matrix-table'><thead><tr><th>Asset Field</th>";
        internalApplicationState.comparisonRegistry.forEach(id => {
            const p = systemProductsDataset.find(x => x.id === id);
            tableHtml += "<th>" + (internalApplicationState.activeLanguage === "en" ? p.nameEn : p.namePt) + "</th>";
        });
        tableHtml += "</tr></thead><tbody><tr><td>Price / Custo</td>";
        internalApplicationState.comparisonRegistry.forEach(id => {
            const p = systemProductsDataset.find(x => x.id === id);
            tableHtml += "<td>" + formatFinancialCurrencyValue(p.price) + "</td>";
        });
        tableHtml += "</tr><tr><td>Structural Line</td>";
        internalApplicationState.comparisonRegistry.forEach(id => {
            const p = systemProductsDataset.find(x => x.id === id);
            tableHtml += "<td>" + p.composition + "</td>";
        });
        tableHtml += "</tr><tr><td>Rating Index</td>";
        internalApplicationState.comparisonRegistry.forEach(id => {
            const p = systemProductsDataset.find(x => x.id === id);
            tableHtml += "<td>" + p.rating + " / 5.0</td>";
        });
        tableHtml += "</tr></tbody></table>";
        
        tableSlot.innerHTML = tableHtml;
        modal.classList.add("active");
    });

    document.getElementById("comparison-modal-element").addEventListener("click", (e) => {
        if (e.target === document.getElementById("comparison-modal-element")) {
            document.getElementById("comparison-modal-element").classList.remove("active");
        }
    });

    document.getElementById("comparison-modal-close-trigger").addEventListener("click", () => {
        document.getElementById("comparison-modal-element").classList.remove("active");
    });

    document.getElementById("cart-checkout-action-btn").addEventListener("click", () => {
        internalApplicationState.shoppingCart = [];
        saveStateToLocalStorage();
        rebuildCartDrawerInterface();
        document.getElementById("cart-drawer-element").classList.remove("active");
        alert(internalApplicationState.activeLanguage === "en" ? "Acquisition protocol transmission successfully finalized." : "Protocolo de aquisição finalizado com sucesso.");
    });
}

function executeHorizontalViewShift(viewIndex) {
    internalApplicationState.activeViewIndex = viewIndex;
    const wrapper = document.getElementById("main-slider-wrapper");
    const offset = viewIndex * -100;
    wrapper.style.transform = "translateX(" + offset + "vw)";
    
    document.querySelectorAll(".nav-link").forEach((link, idx) => {
        if (idx === viewIndex) link.classList.add("active");
        else link.classList.remove("active");
    });
}

function renderGlobalLocalizedUI() {
    const matrix = translationMatrix[internalApplicationState.activeLanguage];
    document.getElementById("nav-home-txt").textContent = matrix.navHome;
    document.getElementById("nav-catalog-txt").textContent = matrix.navCatalog;
    document.getElementById("nav-detail-txt").textContent = matrix.navDetail;
    document.getElementById("nav-user-txt").textContent = matrix.navUser;
    document.getElementById("nav-lab-txt").textContent = matrix.navLab;
    document.getElementById("nav-community-txt").textContent = matrix.navCommunity;
    document.getElementById("nav-analytics-txt").textContent = matrix.navAnalytics;
    
    document.getElementById("lang-toggle-btn").textContent = internalApplicationState.activeLanguage.toUpperCase();
    document.getElementById("promo-banner-text").textContent = matrix.promoText;
    document.getElementById("scarcity-txt-label").textContent = matrix.scarcityLabel;
    document.getElementById("missions-title").textContent = matrix.missionsTitle;
    document.getElementById("rewards-points-label").textContent = matrix.rewardsLabel;
    document.getElementById("recommendations-title").textContent = matrix.recommendationsTitle;
    
    document.getElementById("catalog-search").placeholder = internalApplicationState.activeLanguage === "en" ? "Filter assets by designation..." : "Filtrar ativos por designação...";
    document.getElementById("catalog-category-filter").options[0].textContent = matrix.completeSpectrum;
    document.getElementById("catalog-category-filter").options[1].textContent = matrix.apparel;
    document.getElementById("catalog-category-filter").options[2].textContent = matrix.equipment;
    
    document.getElementById("catalog-sort").options[0].textContent = matrix.standardOrder;
    document.getElementById("catalog-sort").options[1].textContent = matrix.lowHigh;
    document.getElementById("catalog-sort").options[2].textContent = matrix.highLow;
    
    document.getElementById("details-fallback-txt").textContent = matrix.detailsFallback;
    document.getElementById("login-title").textContent = matrix.loginTitle;
    document.getElementById("register-title").textContent = matrix.registerTitle;
    document.getElementById("profile-title").textContent = matrix.profileTitle;
    
    document.getElementById("login-email-lbl").textContent = internalApplicationState.activeLanguage === "en" ? "Email Address" : "Endereço de Email";
    document.getElementById("login-pass-lbl").textContent = internalApplicationState.activeLanguage === "en" ? "Security Password" : "Senha de Segurança";
    document.getElementById("login-submit-btn").textContent = internalApplicationState.activeLanguage === "en" ? "Execute Authentication" : "Executar Autenticação";
    
    document.getElementById("reg-name-lbl").textContent = internalApplicationState.activeLanguage === "en" ? "Full Name" : "Nome Completo";
    document.getElementById("reg-email-lbl").textContent = internalApplicationState.activeLanguage === "en" ? "Email Address" : "Endereço de Email";
    document.getElementById("reg-pass-lbl").textContent = internalApplicationState.activeLanguage === "en" ? "Security Password" : "Senha de Segurança";
    document.getElementById("register-submit-btn").textContent = internalApplicationState.activeLanguage === "en" ? "Register Identity" : "Registrar Identidade";
    
    document.getElementById("prof-lbl-name").textContent = internalApplicationState.activeLanguage === "en" ? "Name:" : "Nome:";
    document.getElementById("prof-lbl-email").textContent = internalApplicationState.activeLanguage === "en" ? "Email:" : "Email:";
    
    document.getElementById("lab-ai-title").textContent = matrix.aiTitle;
    document.getElementById("lab-fitting-title").textContent = matrix.fittingTitle;
    document.getElementById("lab-composer-title").textContent = matrix.composerTitle;
    document.getElementById("lab-quiz-title").textContent = matrix.quizTitle;
    document.getElementById("lab-bmi-title").textContent = matrix.bmiTitle;
    document.getElementById("lab-eco-title").textContent = matrix.ecoTitle;
    document.getElementById("lab-vault-title").textContent = matrix.vaultTitle;
    
    document.getElementById("composer-checkout-btn").textContent = internalApplicationState.activeLanguage === "en" ? "Purchase Complete Composition Bundle" : "Adquirir Conjunto Completo de Composição";
    document.getElementById("bmi-calculate-trigger").textContent = internalApplicationState.activeLanguage === "en" ? "Process Metrics" : "Processar Métricas";
    document.getElementById("ai-recommend-trigger").textContent = internalApplicationState.activeLanguage === "en" ? "Compute Style Matrix" : "Calcular Matriz de Estilo";
    
    document.getElementById("cart-drawer-title").textContent = matrix.cartDrawerTitle;
    document.getElementById("cart-total-lbl").textContent = matrix.totalLabel;
    document.getElementById("cart-checkout-action-btn").textContent = matrix.finalCheckout;
    document.getElementById("wishlist-drawer-title").textContent = matrix.wishlistDrawerTitle;
    document.getElementById("comp-modal-title").textContent = matrix.compModalTitle;
    document.getElementById("post-publish-trigger").textContent = matrix.postBroadcast;
    document.getElementById("community-leaderboard-title").textContent = matrix.rankingTitle;
    document.getElementById("community-look-title").textContent = matrix.lookWeekTitle;
    
    document.getElementById("analytics-panel-title").textContent = matrix.corporateTitle;
    document.getElementById("an-lbl-sales").textContent = matrix.revenueLabel;
    document.getElementById("an-lbl-growth").textContent = matrix.growthLabel;
    document.getElementById("an-lbl-viewed").textContent = matrix.topCatalogViewIndex;
    document.getElementById("an-lbl-fav").textContent = matrix.topWishlistCaptureCount;
    document.getElementById("an-chart-sales").textContent = matrix.trajectoryLabel;
    document.getElementById("an-chart-reviews").textContent = matrix.validationLabel;
    document.getElementById("an-table-title").textContent = matrix.inventoryLabel;
    
    document.getElementById("th-id").textContent = internalApplicationState.activeLanguage === "en" ? "Identifier" : "Identificador";
    document.getElementById("th-name").textContent = internalApplicationState.activeLanguage === "en" ? "Product Label" : "Rótulo do Produto";
    document.getElementById("th-stock").textContent = internalApplicationState.activeLanguage === "en" ? "Units Level" : "Nível de Unidades";
    document.getElementById("th-status").textContent = internalApplicationState.activeLanguage === "en" ? "Logistics Status" : "Status Logístico";

    document.getElementById("rewards-points-value").textContent = internalApplicationState.userPoints;
    toggleUserPortalLayoutVisibility();
}

function applyDynamicThemeState() {
    document.documentElement.setAttribute("data-theme", internalApplicationState.activeTheme);
}

function formatFinancialCurrencyValue(value) {
    if (internalApplicationState.activeLanguage === "en") {
        return "$" + value.toFixed(2);
    } else {
        return "R$ " + value.toFixed(2).replace(".", ",");
    }
}

function generateProductAssetCardMarkup(p) {
    const isFav = internalApplicationState.wishlist.includes(p.id);
    const favClass = isFav ? "favorite-toggle-icon-btn active" : "favorite-toggle-icon-btn";
    const favText = isFav ? (internalApplicationState.activeLanguage === "en" ? "Favorited Asset" : "Ativo Favoritado") : (internalApplicationState.activeLanguage === "en" ? "Capture to Wishlist" : "Capturar para Lista");
    const title = internalApplicationState.activeLanguage === "en" ? p.nameEn : p.namePt;
    const isChecked = internalApplicationState.comparisonRegistry.includes(p.id) ? "checked" : "";
    
    return "<div class='product-asset-card' data-id='" + p.id + "'>" +
        "<div class='card-image-placeholder'>URBAN FIT / " + p.category.toUpperCase() + "</div>" +
        "<div class='card-title'>" + title + "</div>" +
        "<div class='card-price'>" + formatFinancialCurrencyValue(p.price) + "</div>" +
        "<div class='card-comparison-row'>" +
            "<input type='checkbox' data-comp-id='" + p.id + "' " + isChecked + " class='comparison-node-checkbox'>" +
            "<span>" + (internalApplicationState.activeLanguage === "en" ? "Correlate System Matrix" : "Correlacionar Matriz") + "</span>" +
        "</div>" +
        "<div class='card-actions-grid'>" +
            "<button class='prime-action-btn' data-action='cart' data-id='" + p.id + "'>" + (internalApplicationState.activeLanguage === "en" ? "Deploy" : "Implantar") + "</button>" +
            "<button class='secondary-action-btn' data-action='details' data-id='" + p.id + "'>" + (internalApplicationState.activeLanguage === "en" ? "Inspect" : "Inspecionar") + "</button>" +
            "<button class='" + favClass + "' data-action='wish' data-id='" + p.id + "'>" + favText + "</button>" +
        "</div>" +
    "</div>";
}

function renderPrimaryCatalogGrid(productsToRender = systemProductsDataset) {
    const target = document.getElementById("catalog-main-grid");
    let html = "";
    productsToRender.forEach(p => {
        html += generateProductAssetCardMarkup(p);
    });
    target.innerHTML = html;
    bindAssetCardInteractions();
}

function renderHomeRecommendations() {
    const target = document.getElementById("home-recommendations-grid");
    const selections = [systemProductsDataset[0], systemProductsDataset[1], systemProductsDataset[4]];
    let html = "";
    selections.forEach(p => {
        html += generateProductAssetCardMarkup(p);
    });
    target.innerHTML = html;
    bindAssetCardInteractions();
}

function bindAssetCardInteractions() {
    document.querySelectorAll(".product-asset-card [data-action='cart']").forEach(btn => {
        btn.addEventListener("click", (e) => {
            const id = e.target.getAttribute("data-id");
            executeProductCartDeployment(id);
        });
    });

    document.querySelectorAll(".product-asset-card [data-action='wish']").forEach(btn => {
        btn.addEventListener("click", (e) => {
            const id = e.target.getAttribute("data-id");
            toggleProductWishlistPersistence(id);
        });
    });

    document.querySelectorAll(".product-asset-card [data-action='details']").forEach(btn => {
        btn.addEventListener("click", (e) => {
            const id = e.target.getAttribute("data-id");
            internalApplicationState.selectedProductIdForDetails = id;
            const targetProd = systemProductsDataset.find(x => x.id === id);
            if (targetProd) targetProd.views++;
            renderProductDetailsView();
            executeHorizontalViewShift(2);
            renderCorporateAnalyticsEngine();
        });
    });

    document.querySelectorAll(".comparison-node-checkbox").forEach(box => {
        box.addEventListener("change", (e) => {
            const id = e.target.getAttribute("data-comp-id");
            if (e.target.checked) {
                if (internalApplicationState.comparisonRegistry.length >= 3) {
                    e.target.checked = false;
                    return;
                }
                if (!internalApplicationState.comparisonRegistry.includes(id)) {
                    internalApplicationState.comparisonRegistry.push(id);
                }
            } else {
                internalApplicationState.comparisonRegistry = internalApplicationState.comparisonRegistry.filter(x => x !== id);
            }
            updateComparisonTrayDock();
        });
    });
}

function triggerCatalogFilteringSequence() {
    const skeleton = document.getElementById("catalog-skeleton-loader");
    const grid = document.getElementById("catalog-main-grid");
    
    grid.style.display = "none";
    skeleton.style.display = "grid";
    
    setTimeout(() => {
        const searchText = document.getElementById("catalog-search").value.toLowerCase();
        const categoryFilter = document.getElementById("catalog-category-filter").value;
        const sortingParam = document.getElementById("catalog-sort").value;
        
        let filtered = systemProductsDataset.filter(p => {
            const matchText = p.nameEn.toLowerCase().includes(searchText) || p.namePt.toLowerCase().includes(searchText);
            const matchCat = categoryFilter === "all" || p.category === categoryFilter;
            return matchText && matchCat;
        });
        
        if (sortingParam === "low-high") {
            filtered.sort((a, b) => a.price - b.price);
        } else if (sortingParam === "high-low") {
            filtered.sort((a, b) => b.price - a.price);
        }
        
        skeleton.style.display = "none";
        grid.style.display = "grid";
        renderPrimaryCatalogGrid(filtered);
    }, 600);
}

function executeProductCartDeployment(id) {
    const existing = internalApplicationState.shoppingCart.find(item => item.id === id);
    if (existing) {
        existing.quantity++;
    } else {
        internalApplicationState.shoppingCart.push({ id: id, quantity: 1 });
    }
    saveStateToLocalStorage();
    rebuildCartDrawerInterface();
}

function toggleProductWishlistPersistence(id) {
    const index = internalApplicationState.wishlist.indexOf(id);
    const targetProd = systemProductsDataset.find(x => x.id === id);
    if (index > -1) {
        internalApplicationState.wishlist.splice(index, 1);
        if (targetProd && targetProd.favorites > 0) targetProd.favorites--;
    } else {
        internalApplicationState.wishlist.push(id);
        if (targetProd) targetProd.favorites++;
    }
    saveStateToLocalStorage();
    rebuildWishlistDrawerInterface();
    renderPrimaryCatalogGrid();
    renderHomeRecommendations();
    renderCorporateAnalyticsEngine();
}

function rebuildCartDrawerInterface() {
    const target = document.getElementById("cart-items-output-list");
    let html = "";
    let aggregatedTotal = 0;
    let itemsCount = 0;

    internalApplicationState.shoppingCart.forEach(item => {
        const p = systemProductsDataset.find(x => x.id === item.id);
        if (p) {
            const title = internalApplicationState.activeLanguage === "en" ? p.nameEn : p.namePt;
            const cost = p.price * item.quantity;
            aggregatedTotal += cost;
            itemsCount += item.quantity;
            
            html += "<div class='drawer-item-node'>" +
                "<div class='drawer-item-info'>" +
                    "<h5>" + title + "</h5>" +
                    "<span>" + item.quantity + " x " + formatFinancialCurrencyValue(p.price) + "</span>" +
                "</div>" +
                "<button class='close-drawer-btn' data-remove-cart-id='" + p.id + "'>Remove</button>" +
            "</div>";
        }
    });

    target.innerHTML = html;
    document.getElementById("cart-count").textContent = itemsCount;
    document.getElementById("cart-calculated-total-value").textContent = formatFinancialCurrencyValue(aggregatedTotal);
    
    target.querySelectorAll("[data-remove-cart-id]").forEach(btn => {
        btn.addEventListener("click", (e) => {
            const id = e.target.getAttribute("data-remove-cart-id");
            internalApplicationState.shoppingCart = internalApplicationState.shoppingCart.filter(x => x.id !== id);
            saveStateToLocalStorage();
            rebuildCartDrawerInterface();
        });
    });
}

function rebuildWishlistDrawerInterface() {
    const target = document.getElementById("wishlist-items-output-list");
    let html = "";
    
    internalApplicationState.wishlist.forEach(id => {
        const p = systemProductsDataset.find(x => x.id === id);
        if (p) {
            const title = internalApplicationState.activeLanguage === "en" ? p.nameEn : p.namePt;
            html += "<div class='drawer-item-node'>" +
                "<div class='drawer-item-info'>" +
                    "<h5>" + title + "</h5>" +
                    "<span>" + formatFinancialCurrencyValue(p.price) + "</span>" +
                "</div>" +
                "<button class='prime-action-btn' data-wish-deploy-id='" + p.id + "'>Deploy</button>" +
            "</div>";
        }
    });

    target.innerHTML = html;
    document.getElementById("wishlist-count").textContent = internalApplicationState.wishlist.length;
    
    target.querySelectorAll("[data-wish-deploy-id]").forEach(btn => {
        btn.addEventListener("click", (e) => {
            const id = e.target.getAttribute("data-wish-deploy-id");
            executeProductCartDeployment(id);
            internalApplicationState.wishlist = internalApplicationState.wishlist.filter(x => x !== id);
            saveStateToLocalStorage();
            rebuildWishlistDrawerInterface();
            renderPrimaryCatalogGrid();
            renderHomeRecommendations();
        });
    });
}

function updateComparisonTrayDock() {
    const tray = document.getElementById("comparison-dock-tray");
    const countSlot = document.getElementById("comparison-qty-counter");
    const previewSlot = document.getElementById("comparison-previews-tray-slot");
    
    countSlot.textContent = internalApplicationState.comparisonRegistry.length;
    
    if (internalApplicationState.comparisonRegistry.length > 0) {
        tray.classList.add("active");
        let html = "";
        internalApplicationState.comparisonRegistry.forEach(id => {
            const p = systemProductsDataset.find(x => x.id === id);
            if (p) {
                const label = internalApplicationState.activeLanguage === "en" ? p.nameEn : p.namePt;
                html += "<div class='mini-preview-node'>" + label + "</div>";
            }
        });
        previewSlot.innerHTML = html;
    } else {
        tray.classList.remove("active");
    }
}

function renderProductDetailsView() {
    const target = document.getElementById("dynamic-details-target");
    if (!internalApplicationState.selectedProductIdForDetails) {
        target.innerHTML = "<div class='details-fallback-message' id='details-fallback-txt'>" + translationMatrix[internalApplicationState.activeLanguage].detailsFallback + "</div>";
        return;
    }

    const p = systemProductsDataset.find(x => x.id === internalApplicationState.selectedProductIdForDetails);
    if (!p) return;

    const title = internalApplicationState.activeLanguage === "en" ? p.nameEn : p.namePt;
    let reviewsHtml = "";
    
    if (p.reviews.length === 0) {
        reviewsHtml = "<p>" + translationMatrix[internalApplicationState.activeLanguage].emptyReviews + "</p>";
    } else {
        p.reviews.forEach(rev => {
            const revText = internalApplicationState.activeLanguage === "en" ? rev.textEn : rev.textPt;
            reviewsHtml += "<div class='review-node-item'>" +
                "<div class='review-node-header'><span>" + rev.author + "</span><span>" + rev.score + " / 5</span></div>" +
                "<p style='font-size:13px; color:var(--text-secondary);'>" + revText + "</p>" +
            "</div>";
        });
    }

    target.innerHTML = "<div class='details-main-layout'>" +
        "<div class='card-image-placeholder' style='height:400px;'>URBAN FIT MASTER SYSTEM IMAGE REFERENCE</div>" +
        "<div class='details-info-column'>" +
            "<h2>" + title + "</h2>" +
            "<div class='details-price-tag'>" + formatFinancialCurrencyValue(p.price) + "</div>" +
            "<p class='details-description-text'>URBAN FIT High Performance engineering Specification Asset. Validated structural integrity for high threshold physiological demand cycles. Composition Matrix Type: " + p.composition + ".</p>Clone Array Core Process." +
            "<button class='prime-action-btn' id='details-add-to-cart-trigger' style='width:100%; padding:16px;'>" + translationMatrix[internalApplicationState.activeLanguage].addToCart + "</button>" +
            "<div class='ratings-summary-block'>" +
                "<h4>Validation Index Ledger</h4>" +
                "<div class='aggregate-score-metric'>" + p.rating + " <span style='font-size:16px; color:var(--text-secondary);'>/ 5.0</span></div>" +
                "<div class='feedback-submission-form'>" +
                    "<h4>Append Validation Feedback</h4>" +
                    "<div class='form-group' style='margin-bottom:15px;'>" +
                        "<textarea id='feedback-form-text' style='width:100%; height:80px; padding:10px;' placeholder='Enter validation feedback log...'></textarea>" +
                    "</div>" +
                    "<button class='prime-action-btn' id='feedback-submit-trigger'>" + translationMatrix[internalApplicationState.activeLanguage].addReviewBtn + "</button>" +
                "</div>" +
                "<div class='reviews-rendered-stream'>" + reviewsHtml + "</div>" +
            "</div>" +
        "</div>" +
    "</div>";

    document.getElementById("details-add-to-cart-trigger").addEventListener("click", () => {
        executeProductCartDeployment(p.id);
    });

    document.getElementById("feedback-submit-trigger").addEventListener("click", () => {
        const text = document.getElementById("feedback-form-text").value;
        if (!text) return;
        p.reviews.push({
            author: internalApplicationState.authenticatedUser ? internalApplicationState.authenticatedUser.name : "Anonymous_Operator",
            score: 5,
            textEn: text,
            textPt: text
        });
        document.getElementById("feedback-form-text").value = "";
        renderProductDetailsView();
    });
}

function toggleUserPortalLayoutVisibility() {
    const formsGrid = document.querySelector(".auth-portal-grid");
    const profilePanel = document.getElementById("user-profile-panel");
    
    if (internalApplicationState.authenticatedUser) {
        formsGrid.style.display = "none";
        profilePanel.style.display = "block";
        document.getElementById("prof-val-name").textContent = internalApplicationState.authenticatedUser.name;
        document.getElementById("prof-val-email").textContent = internalApplicationState.authenticatedUser.email;
    } else {
        formsGrid.style.display = "grid";
        profilePanel.style.display = "none";
    }
}

function initializeInnovationLabSelectors() {
    const up = document.getElementById("fit-upper");
    const lw = document.getElementById("fit-lower");
    const fw = document.getElementById("fit-footwear");
    const canvas = document.getElementById("composer-canvas-area");

    let upperHtml = "", lowerHtml = "", footwearHtml = "", canvasHtml = "";

    systemProductsDataset.forEach(p => {
        const label = internalApplicationState.activeLanguage === "en" ? p.nameEn : p.namePt;
        if (p.id === "prod-001") lowerHtml += "<option value='" + p.id + "'>" + label + "</option>";
        if (p.id === "prod-002") footwearHtml += "<option value='" + p.id + "'>" + label + "</option>";
        if (p.id === "prod-003") lowerHtml += "<option value='" + p.id + "'>" + label + "</option>";
        if (p.id === "prod-004") upperHtml += "<option value='" + p.id + "'>" + label + "</option>";
        
        canvasHtml += "<div style='padding:8px; background:var(--surface-panel); border:1px solid var(--border-grid); font-size:11px; font-weight:700; text-transform:uppercase;'>" + label + "</div>";
    });

    up.innerHTML = upperHtml;
    lw.innerHTML = lowerHtml;
    fw.innerHTML = footwearHtml;
    canvas.innerHTML = canvasHtml;

    const updateMirror = () => {
        document.getElementById("mirror-upper-slot").textContent = up.options[up.selectedIndex] ? up.options[up.selectedIndex].text : "Empty Slot";
        document.getElementById("mirror-lower-slot").textContent = lw.options[lw.selectedIndex] ? lw.options[lw.selectedIndex].text : "Empty Slot";
        document.getElementById("mirror-footwear-slot").textContent = fw.options[fw.selectedIndex] ? fw.options[fw.selectedIndex].text : "Empty Slot";
    };

    up.addEventListener("change", updateMirror);
    lw.addEventListener("change", updateMirror);
    fw.addEventListener("change", updateMirror);
    updateMirror();
}

function evaluateAchievementVaultCriteria() {
    const target = document.getElementById("achievements-container-matrix");
    const badges = [
        { id: "b1", label: "Core Active", req: 100 },
        { id: "b2", label: "Elite Tier", req: 300 },
        { id: "b3", label: "Apex Form", req: 500 },
        { id: "b4", label: "Sustained Protocol", req: 600 }
    ];

    let html = "";
    badges.forEach(b => {
        const unlocked = internalApplicationState.userPoints >= b.req;
        const stateClass = unlocked ? "achievement-badge-node unlocked" : "achievement-badge-node";
        html += "<div class='" + stateClass + "'>" + b.label + "<br>[" + b.req + " PTS]</div>";
    });
    target.innerHTML = html;
}

function renderCommunityHubModules() {
    const stream = document.getElementById("social-feed-stream");
    let html = "";
    internalApplicationState.communityPosts.forEach(post => {
        html += "<div class='social-post-node'>" +
            "<div class='post-node-meta'>@" + post.author + "</div>" +
            "<div class='post-node-body'>" + post.text + "</div>" +
            "<button class='prime-action-btn' data-like-id='" + post.id + "' style='padding:6px 12px; font-size:10px;'>Like Ledger (" + post.likes + ")</button>" +
        "</div>";
    });
    stream.innerHTML = html;

    stream.querySelectorAll("[data-like-id]").forEach(btn => {
        btn.addEventListener("click", (e) => {
            const id = e.target.getAttribute("data-like-id");
            const post = internalApplicationState.communityPosts.find(x => x.id === id);
            if (post) {
                post.likes++;
                renderCommunityHubModules();
            }
        });
    });

    const list = document.getElementById("leaderboard-ranking-list");
    let listHtml = "";
    internalApplicationState.leaderboard.forEach(user => {
        listHtml += "<li>" + user.name + " <span style='color:var(--primary-core); font-weight:900;'>[" + user.score + " Log Units]</span></li>";
    });
    list.innerHTML = listHtml;

    document.getElementById("weekly-look-box").textContent = internalApplicationState.activeLanguage === "en" ?
        "System Outfit Optimization Array: Technical Shorts Combined with Aerodynamic Compression Grid Protocol." :
        "Matriz Otimizada da Semana: Shorts Técnico Combinado com Grade de Compressão Aerodinâmica.";
}

function renderCorporateAnalyticsEngine() {
    let topViewedProduct = systemProductsDataset[0];
    let topFavoritedProduct = systemProductsDataset[0];

    systemProductsDataset.forEach(p => {
        if (p.views > topViewedProduct.views) topViewedProduct = p;
        if (p.favorites > topFavoritedProduct.favorites) topFavoritedProduct = p;
    });

    document.getElementById("an-val-viewed").textContent = topViewedProduct.views;
    document.getElementById("an-val-fav").textContent = topFavoritedProduct.favorites;

    const barsContainer = document.getElementById("sales-chart-bars");
    let barsHtml = "";
    const mockDataValues = [40, 75, 55, 90, 65, 84];
    mockDataValues.forEach(val => {
        barsHtml += "<div class='chart-bar-column' data-value='" + val + "%' style='height:" + val + "%;'></div>";
    });
    barsContainer.innerHTML = barsHtml;

    const lineContainer = document.getElementById("reviews-chart-line");
    let lineHtml = "";
    const mockLineValues = [4.2, 4.5, 4.4, 4.8, 4.7, 4.9];
    mockLineValues.forEach(val => {
        lineHtml += "<div class='line-node-point' data-value='" + val + "'></div>";
    });
    lineHtml += "<div style='position:absolute; width:100%; height:2px; background-color:var(--secondary-structural); z-index:1;'></div>";
    lineContainer.innerHTML = lineHtml;

    const tableBody = document.getElementById("inventory-table-body");
    let tableHtml = "";
    systemProductsDataset.forEach(p => {
        const label = internalApplicationState.activeLanguage === "en" ? p.nameEn : p.namePt;
        const status = p.stock <= 5 ? (internalApplicationState.activeLanguage === "en" ? "CRITICAL ORDER OVERRIDE" : "REPOSIÇÃO CRÍTICA") : (internalApplicationState.activeLanguage === "en" ? "NOMINAL STRUCTURAL LEVEL" : "ESTOQUE NOMINAL");
        const statusColor = p.stock <= 5 ? "color:var(--alert-critical); font-weight:900;" : "color:var(--success-matrix);";
        
        tableHtml += "<tr>" +
            "<td>" + p.id + "</td>" +
            "<td>" + label + "</td>" +
            "<td>" + p.stock + " Units</td>" +
            "<td style='" + statusColor + "'>" + status + "</td>" +
        "</tr>";
    });
    tableBody.innerHTML = tableHtml;
}

function spawnSocialProofNotificationLoop() {
    const buyersLocationPool = ["London Core Terminal", "New York Vector", "Tokyo District Hub", "Berlin Axis Section", "São Paulo Megacity Node"];
    const productsAssetPool = systemProductsDataset;
    const toast = document.getElementById("live-social-proof-toast");
    const textNode = document.getElementById("live-toast-message-content");

    setInterval(() => {
        const loc = buyersLocationPool[Math.floor(Math.random() * buyersLocationPool.length)];
        const prod = productsAssetPool[Math.floor(Math.random() * productsAssetPool.length)];
        const title = internalApplicationState.activeLanguage === "en" ? prod.nameEn : prod.namePt;
        
        if (internalApplicationState.activeLanguage === "en") {
            textNode.textContent = "Logistics Notification: Client at " + loc + " executed acquisition protocol for " + title + ".";
        } else {
            textNode.textContent = "Notificação de Logística: Cliente em " + loc + " executou protocolo de aquisição para " + title + ".";
        }

        toast.classList.add("active");
        setTimeout(() => {
            toast.classList.remove("active");
        }, 4000);
    }, 15000);
}

window.addEventListener("DOMContentLoaded", initializeApplicationCore);
