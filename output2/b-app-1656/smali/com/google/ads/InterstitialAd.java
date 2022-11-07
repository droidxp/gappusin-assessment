public class com.google.ads.InterstitialAd implements com.google.ads.Ad {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private com.google.ads.internal.d a;
	 private com.google.ads.m b;
	 /* # direct methods */
	 public com.google.ads.InterstitialAd ( ) {
		 /* .locals 1 */
		 /* .param p1, "activity" # Landroid/app/Activity; */
		 /* .param p2, "adUnitId" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 86 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/google/ads/InterstitialAd;-><init>(Landroid/app/Activity;Ljava/lang/String;Z)V */
		 /* .line 87 */
		 return;
	 } // .end method
	 public com.google.ads.InterstitialAd ( ) {
		 /* .locals 2 */
		 /* .param p1, "activity" # Landroid/app/Activity; */
		 /* .param p2, "adUnitId" # Ljava/lang/String; */
		 /* .param p3, "shortTimeout" # Z */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 101 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 102 */
		 com.google.ads.m .a ( p0,p2,p1,v0,v0 );
		 this.b = v0;
		 /* .line 103 */
		 /* new-instance v0, Lcom/google/ads/internal/d; */
		 v1 = this.b;
		 /* invoke-direct {v0, v1, p3}, Lcom/google/ads/internal/d;-><init>(Lcom/google/ads/m;Z)V */
		 this.a = v0;
		 /* .line 105 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isReady ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 114 */
		 v0 = this.a;
		 v0 = 		 (( com.google.ads.internal.d ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->q()Z
	 } // .end method
	 public void loadAd ( com.google.ads.AdRequest p0 ) {
		 /* .locals 1 */
		 /* .param p1, "adRequest" # Lcom/google/ads/AdRequest; */
		 /* .prologue */
		 /* .line 126 */
		 v0 = this.a;
		 (( com.google.ads.internal.d ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/internal/d;->a(Lcom/google/ads/AdRequest;)V
		 /* .line 127 */
		 return;
	 } // .end method
	 public void setAdListener ( com.google.ads.AdListener p0 ) {
		 /* .locals 1 */
		 /* .param p1, "adListener" # Lcom/google/ads/AdListener; */
		 /* .prologue */
		 /* .line 148 */
		 v0 = this.b;
		 v0 = this.j;
		 (( com.google.ads.util.i$c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/util/i$c;->a(Ljava/lang/Object;)V
		 /* .line 149 */
		 return;
	 } // .end method
	 public void show ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 136 */
		 v0 = this.a;
		 (( com.google.ads.internal.d ) v0 ).y ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->y()V
		 /* .line 137 */
		 return;
	 } // .end method
	 public void stopLoading ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 158 */
		 v0 = this.a;
		 (( com.google.ads.internal.d ) v0 ).z ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->z()V
		 /* .line 159 */
		 return;
	 } // .end method
