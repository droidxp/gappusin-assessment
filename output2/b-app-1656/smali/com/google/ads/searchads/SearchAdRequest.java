public class com.google.ads.searchads.SearchAdRequest extends com.google.ads.AdRequest {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
	 /* } */
} // .end annotation
/* # instance fields */
private java.lang.String a;
private Integer b;
private Integer c;
private Integer d;
private Integer e;
private Integer f;
private Integer g;
private java.lang.String h;
private Integer i;
private Integer j;
private com.google.ads.searchads.SearchAdRequest$BorderType k;
private Integer l;
private java.lang.String m;
/* # direct methods */
public com.google.ads.searchads.SearchAdRequest ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 17 */
	 /* invoke-direct {p0}, Lcom/google/ads/AdRequest;-><init>()V */
	 /* .line 22 */
	 return;
} // .end method
private java.lang.String a ( Integer p0 ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 284 */
	 v0 = java.util.Locale.US;
	 final String v1 = "#%06x"; // const-string v1, "#%06x"
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-array v2, v2, [Ljava/lang/Object; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* const v4, 0xffffff */
	 /* and-int/2addr v4, p1 */
	 java.lang.Integer .valueOf ( v4 );
	 /* aput-object v4, v2, v3 */
	 java.lang.String .format ( v0,v1,v2 );
} // .end method
/* # virtual methods */
public java.util.Map getRequestMap ( android.content.Context p0 ) {
	 /* .locals 5 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/content/Context;", */
	 /* ")", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0xff */
/* .line 220 */
/* const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
(( com.google.ads.searchads.SearchAdRequest ) p0 ).getNetworkExtras ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/searchads/SearchAdRequest;->getNetworkExtras(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* .line 222 */
/* if-nez v0, :cond_0 */
/* .line 223 */
/* new-instance v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* invoke-direct {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;-><init>()V */
/* .line 224 */
(( com.google.ads.searchads.SearchAdRequest ) p0 ).setNetworkExtras ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/searchads/SearchAdRequest;->setNetworkExtras(Lcom/google/ads/mediation/NetworkExtras;)Lcom/google/ads/AdRequest;
/* .line 227 */
} // :cond_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 228 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "q"; // const-string v2, "q"
v3 = this.a;
/* .line 231 */
} // :cond_1
/* iget v1, p0, Lcom/google/ads/searchads/SearchAdRequest;->b:I */
v1 = android.graphics.Color .alpha ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 232 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "bgcolor"; // const-string v2, "bgcolor"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->b:I */
/* invoke-direct {p0, v3}, Lcom/google/ads/searchads/SearchAdRequest;->a(I)Ljava/lang/String; */
/* .line 235 */
} // :cond_2
/* iget v1, p0, Lcom/google/ads/searchads/SearchAdRequest;->c:I */
v1 = android.graphics.Color .alpha ( v1 );
/* if-ne v1, v4, :cond_3 */
/* iget v1, p0, Lcom/google/ads/searchads/SearchAdRequest;->d:I */
v1 = android.graphics.Color .alpha ( v1 );
/* if-ne v1, v4, :cond_3 */
/* .line 237 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "gradientfrom"; // const-string v2, "gradientfrom"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->c:I */
/* invoke-direct {p0, v3}, Lcom/google/ads/searchads/SearchAdRequest;->a(I)Ljava/lang/String; */
/* .line 238 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "gradientto"; // const-string v2, "gradientto"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->d:I */
/* invoke-direct {p0, v3}, Lcom/google/ads/searchads/SearchAdRequest;->a(I)Ljava/lang/String; */
/* .line 241 */
} // :cond_3
/* iget v1, p0, Lcom/google/ads/searchads/SearchAdRequest;->e:I */
v1 = android.graphics.Color .alpha ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 242 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "hcolor"; // const-string v2, "hcolor"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->e:I */
/* invoke-direct {p0, v3}, Lcom/google/ads/searchads/SearchAdRequest;->a(I)Ljava/lang/String; */
/* .line 245 */
} // :cond_4
/* iget v1, p0, Lcom/google/ads/searchads/SearchAdRequest;->f:I */
v1 = android.graphics.Color .alpha ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 246 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "dcolor"; // const-string v2, "dcolor"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->f:I */
/* invoke-direct {p0, v3}, Lcom/google/ads/searchads/SearchAdRequest;->a(I)Ljava/lang/String; */
/* .line 250 */
} // :cond_5
/* iget v1, p0, Lcom/google/ads/searchads/SearchAdRequest;->g:I */
v1 = android.graphics.Color .alpha ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 251 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "acolor"; // const-string v2, "acolor"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->g:I */
/* invoke-direct {p0, v3}, Lcom/google/ads/searchads/SearchAdRequest;->a(I)Ljava/lang/String; */
/* .line 254 */
} // :cond_6
v1 = this.h;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 255 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "font"; // const-string v2, "font"
v3 = this.h;
/* .line 258 */
} // :cond_7
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "headersize"; // const-string v2, "headersize"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->i:I */
java.lang.Integer .toString ( v3 );
/* .line 260 */
/* iget v1, p0, Lcom/google/ads/searchads/SearchAdRequest;->j:I */
v1 = android.graphics.Color .alpha ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 261 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "bcolor"; // const-string v2, "bcolor"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->j:I */
/* invoke-direct {p0, v3}, Lcom/google/ads/searchads/SearchAdRequest;->a(I)Ljava/lang/String; */
/* .line 264 */
} // :cond_8
v1 = this.k;
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 265 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "btype"; // const-string v2, "btype"
v3 = this.k;
(( com.google.ads.searchads.SearchAdRequest$BorderType ) v3 ).toString ( ); // invoke-virtual {v3}, Lcom/google/ads/searchads/SearchAdRequest$BorderType;->toString()Ljava/lang/String;
/* .line 268 */
} // :cond_9
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v2 = "bthick"; // const-string v2, "bthick"
/* iget v3, p0, Lcom/google/ads/searchads/SearchAdRequest;->l:I */
java.lang.Integer .toString ( v3 );
/* .line 270 */
v1 = this.m;
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 271 */
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).getExtras ( ); // invoke-virtual {v0}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getExtras()Ljava/util/Map;
final String v1 = "channel"; // const-string v1, "channel"
v2 = this.m;
/* .line 274 */
} // :cond_a
/* invoke-super {p0, p1}, Lcom/google/ads/AdRequest;->getRequestMap(Landroid/content/Context;)Ljava/util/Map; */
} // .end method
public void setAnchorTextColor ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "anchorTextColor" # I */
/* .prologue */
/* .line 159 */
/* iput p1, p0, Lcom/google/ads/searchads/SearchAdRequest;->g:I */
/* .line 160 */
return;
} // .end method
public void setBackgroundColor ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "backgroundColor" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 101 */
v0 = android.graphics.Color .alpha ( p1 );
/* const/16 v1, 0xff */
/* if-ne v0, v1, :cond_0 */
/* .line 102 */
/* iput p1, p0, Lcom/google/ads/searchads/SearchAdRequest;->b:I */
/* .line 103 */
/* iput v2, p0, Lcom/google/ads/searchads/SearchAdRequest;->c:I */
/* .line 104 */
/* iput v2, p0, Lcom/google/ads/searchads/SearchAdRequest;->d:I */
/* .line 108 */
} // :cond_0
return;
} // .end method
public void setBackgroundGradient ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "from" # I */
/* .param p2, "to" # I */
/* .prologue */
/* const/16 v2, 0xff */
int v1 = 0; // const/4 v1, 0x0
/* .line 120 */
v0 = android.graphics.Color .alpha ( p1 );
/* if-ne v0, v2, :cond_0 */
v0 = android.graphics.Color .alpha ( p2 );
/* if-ne v0, v2, :cond_0 */
/* .line 121 */
v0 = android.graphics.Color .argb ( v1,v1,v1,v1 );
/* iput v0, p0, Lcom/google/ads/searchads/SearchAdRequest;->b:I */
/* .line 122 */
/* iput p1, p0, Lcom/google/ads/searchads/SearchAdRequest;->c:I */
/* .line 123 */
/* iput p2, p0, Lcom/google/ads/searchads/SearchAdRequest;->d:I */
/* .line 127 */
} // :cond_0
return;
} // .end method
public void setBorderColor ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "borderColor" # I */
/* .prologue */
/* .line 189 */
/* iput p1, p0, Lcom/google/ads/searchads/SearchAdRequest;->j:I */
/* .line 190 */
return;
} // .end method
public void setBorderThickness ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "borderThickness" # I */
/* .prologue */
/* .line 207 */
/* iput p1, p0, Lcom/google/ads/searchads/SearchAdRequest;->l:I */
/* .line 208 */
return;
} // .end method
public void setBorderType ( com.google.ads.searchads.SearchAdRequest$BorderType p0 ) {
/* .locals 0 */
/* .param p1, "borderType" # Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
/* .prologue */
/* .line 197 */
this.k = p1;
/* .line 198 */
return;
} // .end method
public void setCustomChannels ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "channelIds" # Ljava/lang/String; */
/* .prologue */
/* .line 215 */
this.m = p1;
/* .line 216 */
return;
} // .end method
public void setDescriptionTextColor ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "descriptionTextColor" # I */
/* .prologue */
/* .line 148 */
/* iput p1, p0, Lcom/google/ads/searchads/SearchAdRequest;->f:I */
/* .line 149 */
return;
} // .end method
public void setFontFace ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "fontFace" # Ljava/lang/String; */
/* .prologue */
/* .line 168 */
this.h = p1;
/* .line 169 */
return;
} // .end method
public void setHeaderTextColor ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "headerTextColor" # I */
/* .prologue */
/* .line 137 */
/* iput p1, p0, Lcom/google/ads/searchads/SearchAdRequest;->e:I */
/* .line 138 */
return;
} // .end method
public void setHeaderTextSize ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "headerTextSize" # I */
/* .prologue */
/* .line 178 */
/* iput p1, p0, Lcom/google/ads/searchads/SearchAdRequest;->i:I */
/* .line 179 */
return;
} // .end method
public void setQuery ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "query" # Ljava/lang/String; */
/* .prologue */
/* .line 91 */
this.a = p1;
/* .line 92 */
return;
} // .end method
