package com.demirkol.foodlyze;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ProductResponse {
    @SerializedName("product")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public class Product {

        // Temel bilgiler

        @SerializedName("product_name")
        private String productName; // Ürün adı



        @SerializedName("fiber")
        private String  liforani; //  lif oranı

        @SerializedName("generic_name")
        private String genericName; // Genel ürün ismi

        @SerializedName("quantity")
        private String quantity; // Miktar (örnek: 250g)

        @SerializedName("code")
        private String code; // Barkod

        // İçerik
        @SerializedName("ingredients_text")
        private String ingredientsText; // İçindekiler (kullanıcının eklediği)

        @SerializedName("ingredients_text_en")
        private String ingredientsTextEn; // İçindekiler (İngilizce)

        @SerializedName("ingredients_analysis_tags")
        private List<String> ingredientsAnalysisTags; // Örn: en:halal, en:vegetarian

        @SerializedName("allergens")
        private String allergens; // Alerjenler

        @SerializedName("traces")
        private String traces; // Eser miktarda bulunan maddeler

        @SerializedName("warnings")
        private List<String> warnings; // Uyarılar

        // Etiket ve kategori bilgileri
        @SerializedName("labels")
        private String labels; // Etiketler (metin)

        @SerializedName("labels_tags")
        private List<String> labelTags; // Etiketler (tag formatında)

        @SerializedName("categories")
        private String categories; // Kategoriler (metin)

        @SerializedName("categories_tags")
        private List<String> categoriesTags; // Kategori tag'leri

        @SerializedName("brands")
        private String brands; // Marka adı

        @SerializedName("brands_tags")
        private List<String> brandsTags; // Marka tag'leri

        @SerializedName("origins")
        private String origins; // Köken bilgisi


        @SerializedName("trans-fat")
        private String trans_yag; // Doymuş Yağ

        public String getTrans_yag() {
            return trans_yag;
        }



        // Görseller
        @SerializedName("image_url")
        private String imageUrl; // Genel resim

        @SerializedName("image_small_url")
        private String imageSmallUrl; // Küçük boyutlu resim

        @SerializedName("image_front_url")
        private String productImage; // Ön yüz görseli

        @SerializedName("image_ingredients_url")
        private String ingredientsImage; // İçerik görseli

        @SerializedName("image_nutrition_url")
        private String nutritionImage; // Besin tablosu görseli

        @SerializedName("image_thumb_url")
        private String thumbnailImage; // Küçük önizleme resmi

        // Besin bilgileri
        @SerializedName("nutriscore_grade")
        private String nutriscoreGrade; // Nutriscore harfi (A–E)

        @SerializedName("nutriscore_score")
        private int nutriscoreScore; // Nutriscore puanı

        @SerializedName("nova_group")
        private int novaGroup; // Nova işlenmişlik skoru (1–4)

        @SerializedName("ecoscore_grade")
        private String ecoscoreGrade; // Eco-Score (çevresel etki puanı)

        @SerializedName("nutriments")
        private Nutriments nutriments; // Besin değerleri

        // Üretici / kaynak
        @SerializedName("manufacturing_places")
        private String manufacturingPlaces; // Üretim yerleri

        @SerializedName("emb_codes")
        private String embCodes; // Üretici kodları

        @SerializedName("packaging")
        private String packaging; // Ambalaj türü

        @SerializedName("stores")
        private String stores; // Satıldığı mağazalar

        @SerializedName("purchase_places")
        private String purchasePlaces; // Satın alındığı yerler

        @SerializedName("countries")
        private String countries; // Ürünün bulunduğu ülkeler

        @SerializedName("countries_tags")
        private List<String> countriesTags; // Ülke tag'leri

        // Getter’lar (mevcut olanlar ve yeniler)
        public String getProductName() { return productName; }
        public String getGenericName() { return genericName; }
        public String getIngredientsText() { return ingredientsText; }
        public String getIngredientsTextEn() { return ingredientsTextEn; }
        public String getAllergens() { return allergens; }
        public List<String> getWarnings() { return warnings; }
        public String getLabels() { return labels; }
        public List<String> getLabelTags() { return labelTags; }
        public String getImageUrl() { return imageUrl; }
        public String getImageSmallUrl() { return imageSmallUrl; }
        public String getProductImage() { return productImage; }
        public String getIngredientsImage() { return ingredientsImage; }
        public String getNutritionImage() { return nutritionImage; }
        public String getThumbnailImage() { return thumbnailImage; }
        public String getCategories() { return categories; }
        public List<String> getCategoriesTags() { return categoriesTags; }
        public String getBrands() { return brands; }
        public List<String> getBrandsTags() { return brandsTags; }
        public String getOrigins() { return origins; }
        public String getQuantity() { return quantity; }
        public Nutriments getNutriments() { return nutriments; }
        public String getNutriscoreGrade() { return nutriscoreGrade; }
        public int getNutriscoreScore() { return nutriscoreScore; }
        public int getNovaGroup() { return novaGroup; }
        public String getEcoscoreGrade() { return ecoscoreGrade; }
        public String getManufacturingPlaces() { return manufacturingPlaces; }
        public String getEmbCodes() { return embCodes; }
        public String getPackaging() { return packaging; }
        public String getStores() { return stores; }
        public String getPurchasePlaces() { return purchasePlaces; }
        public String getCountries() { return countries; }
        public List<String> getCountriesTags() { return countriesTags; }
        public String getCode() { return code; }
        public List<String> getIngredientsAnalysisTags() { return ingredientsAnalysisTags; }
        public String getLiforani() {
            return liforani;
        }



    }
}
