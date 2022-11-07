public class com.google.ads.AdSize {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer AUTO_HEIGHT;
	 public static final com.google.ads.AdSize BANNER;
	 public static final Integer FULL_WIDTH;
	 public static final com.google.ads.AdSize IAB_BANNER;
	 public static final com.google.ads.AdSize IAB_LEADERBOARD;
	 public static final com.google.ads.AdSize IAB_MRECT;
	 public static final com.google.ads.AdSize IAB_WIDE_SKYSCRAPER;
	 public static final Integer LANDSCAPE_AD_HEIGHT;
	 public static final Integer LARGE_AD_HEIGHT;
	 public static final Integer PORTRAIT_AD_HEIGHT;
	 public static final com.google.ads.AdSize SMART_BANNER;
	 /* # instance fields */
	 private Integer a;
	 private Integer b;
	 private Boolean c;
	 private Boolean d;
	 private Boolean e;
	 private java.lang.String f;
	 /* # direct methods */
	 static com.google.ads.AdSize ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 93 */
		 /* new-instance v0, Lcom/google/ads/AdSize; */
		 int v1 = -1; // const/4 v1, -0x1
		 int v2 = -2; // const/4 v2, -0x2
		 final String v3 = "mb"; // const-string v3, "mb"
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/AdSize;-><init>(IILjava/lang/String;)V */
		 /* .line 97 */
		 /* new-instance v0, Lcom/google/ads/AdSize; */
		 /* const/16 v1, 0x140 */
		 /* const/16 v2, 0x32 */
		 final String v3 = "mb"; // const-string v3, "mb"
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/AdSize;-><init>(IILjava/lang/String;)V */
		 /* .line 100 */
		 /* new-instance v0, Lcom/google/ads/AdSize; */
		 /* const/16 v1, 0x12c */
		 /* const/16 v2, 0xfa */
		 final String v3 = "as"; // const-string v3, "as"
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/AdSize;-><init>(IILjava/lang/String;)V */
		 /* .line 103 */
		 /* new-instance v0, Lcom/google/ads/AdSize; */
		 /* const/16 v1, 0x1d4 */
		 /* const/16 v2, 0x3c */
		 final String v3 = "as"; // const-string v3, "as"
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/AdSize;-><init>(IILjava/lang/String;)V */
		 /* .line 106 */
		 /* new-instance v0, Lcom/google/ads/AdSize; */
		 /* const/16 v1, 0x2d8 */
		 /* const/16 v2, 0x5a */
		 final String v3 = "as"; // const-string v3, "as"
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/AdSize;-><init>(IILjava/lang/String;)V */
		 /* .line 112 */
		 /* new-instance v0, Lcom/google/ads/AdSize; */
		 /* const/16 v1, 0xa0 */
		 /* const/16 v2, 0x258 */
		 final String v3 = "as"; // const-string v3, "as"
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/AdSize;-><init>(IILjava/lang/String;)V */
		 return;
	 } // .end method
	 public com.google.ads.AdSize ( ) {
		 /* .locals 1 */
		 /* .param p1, "width" # I */
		 /* .param p2, "height" # I */
		 /* .prologue */
		 /* .line 142 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/google/ads/AdSize;-><init>(IILjava/lang/String;)V */
		 /* .line 145 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/google/ads/AdSize;->a()Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 146 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* iput-boolean v0, p0, Lcom/google/ads/AdSize;->e:Z */
			 /* .line 147 */
			 final String v0 = "mb"; // const-string v0, "mb"
			 this.f = v0;
			 /* .line 151 */
		 } // :goto_0
		 return;
		 /* .line 149 */
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/google/ads/AdSize;->e:Z */
} // .end method
private com.google.ads.AdSize ( ) {
	 /* .locals 3 */
	 /* .param p1, "width" # I */
	 /* .param p2, "height" # I */
	 /* .param p3, "type" # Ljava/lang/String; */
	 /* .prologue */
	 int v1 = 1; // const/4 v1, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 160 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 161 */
	 /* iput p1, p0, Lcom/google/ads/AdSize;->a:I */
	 /* .line 162 */
	 /* iput p2, p0, Lcom/google/ads/AdSize;->b:I */
	 /* .line 163 */
	 this.f = p3;
	 /* .line 164 */
	 int v0 = -1; // const/4 v0, -0x1
	 /* if-ne p1, v0, :cond_0 */
	 /* move v0, v1 */
} // :goto_0
/* iput-boolean v0, p0, Lcom/google/ads/AdSize;->c:Z */
/* .line 165 */
int v0 = -2; // const/4 v0, -0x2
/* if-ne p2, v0, :cond_1 */
} // :goto_1
/* iput-boolean v1, p0, Lcom/google/ads/AdSize;->d:Z */
/* .line 166 */
/* iput-boolean v2, p0, Lcom/google/ads/AdSize;->e:Z */
/* .line 167 */
return;
} // :cond_0
/* move v0, v2 */
/* .line 164 */
} // :cond_1
/* move v1, v2 */
/* .line 165 */
} // .end method
private static Integer a ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 348 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 349 */
/* iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v1, v1 */
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
/* div-float v0, v1, v0 */
/* float-to-int v0, v0 */
} // .end method
private Boolean a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 226 */
/* iget v0, p0, Lcom/google/ads/AdSize;->a:I */
/* if-ltz v0, :cond_0 */
/* iget v0, p0, Lcom/google/ads/AdSize;->b:I */
/* if-gez v0, :cond_1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static Integer b ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 360 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 361 */
/* iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* int-to-float v1, v1 */
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
/* div-float v0, v1, v0 */
/* float-to-int v0, v0 */
/* .line 362 */
/* const/16 v1, 0x190 */
/* if-gt v0, v1, :cond_0 */
/* .line 363 */
/* const/16 v0, 0x20 */
/* .line 367 */
} // :goto_0
/* .line 364 */
} // :cond_0
/* const/16 v1, 0x2d0 */
/* if-gt v0, v1, :cond_1 */
/* .line 365 */
/* const/16 v0, 0x32 */
/* .line 367 */
} // :cond_1
/* const/16 v0, 0x5a */
} // .end method
public static com.google.ads.AdSize createAdSize ( com.google.ads.AdSize p0, android.content.Context p1 ) {
/* .locals 4 */
/* .param p0, "adSize" # Lcom/google/ads/AdSize; */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 181 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = /* invoke-direct {p0}, Lcom/google/ads/AdSize;->a()Z */
/* if-nez v0, :cond_2 */
/* .line 182 */
} // :cond_0
v0 = /* invoke-direct {p0}, Lcom/google/ads/AdSize;->a()Z */
if ( v0 != null) { // if-eqz v0, :cond_1
p0 = com.google.ads.AdSize.BANNER;
/* .line 195 */
} // .end local p0 # "adSize":Lcom/google/ads/AdSize;
} // :cond_1
} // :goto_0
/* .line 185 */
/* .restart local p0 # "adSize":Lcom/google/ads/AdSize; */
} // :cond_2
v0 = (( com.google.ads.AdSize ) p0 ).isFullWidth ( ); // invoke-virtual {p0}, Lcom/google/ads/AdSize;->isFullWidth()Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = com.google.ads.AdSize .a ( p1 );
/* .line 187 */
} // :goto_1
v1 = (( com.google.ads.AdSize ) p0 ).isAutoHeight ( ); // invoke-virtual {p0}, Lcom/google/ads/AdSize;->isAutoHeight()Z
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = com.google.ads.AdSize .b ( p1 );
/* .line 190 */
} // :goto_2
/* new-instance v2, Lcom/google/ads/AdSize; */
v3 = this.f;
/* invoke-direct {v2, v0, v1, v3}, Lcom/google/ads/AdSize;-><init>(IILjava/lang/String;)V */
/* .line 191 */
/* iget-boolean v0, p0, Lcom/google/ads/AdSize;->d:Z */
/* iput-boolean v0, v2, Lcom/google/ads/AdSize;->d:Z */
/* .line 192 */
/* iget-boolean v0, p0, Lcom/google/ads/AdSize;->c:Z */
/* iput-boolean v0, v2, Lcom/google/ads/AdSize;->c:Z */
/* .line 193 */
/* iget-boolean v0, p0, Lcom/google/ads/AdSize;->e:Z */
/* iput-boolean v0, v2, Lcom/google/ads/AdSize;->e:Z */
/* move-object p0, v2 */
/* .line 195 */
/* .line 185 */
} // :cond_3
v0 = (( com.google.ads.AdSize ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/google/ads/AdSize;->getWidth()I
/* .line 187 */
} // :cond_4
v1 = (( com.google.ads.AdSize ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/google/ads/AdSize;->getHeight()I
} // .end method
/* # virtual methods */
public com.google.ads.AdSize findBestSize ( com.google.ads.AdSize...p0 ) {
/* .locals 14 */
/* .param p1, "options" # [Lcom/google/ads/AdSize; */
/* .prologue */
/* const-wide/high16 v12, 0x3ff0000000000000L # 1.0 */
/* .line 317 */
int v5 = 0; // const/4 v5, 0x0
/* .line 318 */
/* const-wide/16 v2, 0x0 */
/* .line 320 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 321 */
/* array-length v7, p1 */
int v0 = 0; // const/4 v0, 0x0
/* move v6, v0 */
} // :goto_0
/* if-ge v6, v7, :cond_1 */
/* aget-object v4, p1, v6 */
/* .line 322 */
/* iget v0, v4, Lcom/google/ads/AdSize;->a:I */
/* iget v1, v4, Lcom/google/ads/AdSize;->b:I */
v0 = (( com.google.ads.AdSize ) p0 ).isSizeAppropriate ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/AdSize;->isSizeAppropriate(II)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 323 */
/* iget v0, v4, Lcom/google/ads/AdSize;->a:I */
/* int-to-double v0, v0 */
/* iget v8, v4, Lcom/google/ads/AdSize;->b:I */
/* int-to-double v8, v8 */
/* mul-double/2addr v0, v8 */
/* iget v8, p0, Lcom/google/ads/AdSize;->a:I */
/* int-to-double v8, v8 */
/* iget v10, p0, Lcom/google/ads/AdSize;->b:I */
/* int-to-double v10, v10 */
/* mul-double/2addr v8, v10 */
/* div-double/2addr v0, v8 */
/* .line 325 */
/* cmpl-double v8, v0, v12 */
/* if-lez v8, :cond_0 */
/* .line 326 */
/* div-double v0, v12, v0 */
/* .line 329 */
} // :cond_0
/* cmpl-double v8, v0, v2 */
/* if-lez v8, :cond_2 */
/* move-object v2, v4 */
/* .line 321 */
} // :goto_1
/* add-int/lit8 v3, v6, 0x1 */
/* move v6, v3 */
/* move-object v5, v2 */
/* move-wide v2, v0 */
/* .line 337 */
} // :cond_1
} // :cond_2
/* move-wide v0, v2 */
/* move-object v2, v5 */
} // .end method
public Integer getHeight ( ) {
/* .locals 2 */
/* .prologue */
/* .line 213 */
/* iget v0, p0, Lcom/google/ads/AdSize;->b:I */
/* if-gez v0, :cond_0 */
/* .line 214 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Ad size was not set before getHeight() was called."; // const-string v1, "Ad size was not set before getHeight() was called."
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 217 */
} // :cond_0
/* iget v0, p0, Lcom/google/ads/AdSize;->b:I */
} // .end method
public Integer getHeightInPixels ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 278 */
int v0 = 1; // const/4 v0, 0x1
/* iget v1, p0, Lcom/google/ads/AdSize;->b:I */
/* int-to-float v1, v1 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
v0 = android.util.TypedValue .applyDimension ( v0,v1,v2 );
/* float-to-int v0, v0 */
} // .end method
public Integer getWidth ( ) {
/* .locals 2 */
/* .prologue */
/* .line 202 */
/* iget v0, p0, Lcom/google/ads/AdSize;->a:I */
/* if-gez v0, :cond_0 */
/* .line 203 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Ad size was not set before getWidth() was called."; // const-string v1, "Ad size was not set before getWidth() was called."
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 206 */
} // :cond_0
/* iget v0, p0, Lcom/google/ads/AdSize;->a:I */
} // .end method
public Integer getWidthInPixels ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 268 */
int v0 = 1; // const/4 v0, 0x1
/* iget v1, p0, Lcom/google/ads/AdSize;->a:I */
/* int-to-float v1, v1 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
v0 = android.util.TypedValue .applyDimension ( v0,v1,v2 );
/* float-to-int v0, v0 */
} // .end method
public Boolean isAutoHeight ( ) {
/* .locals 1 */
/* .prologue */
/* .line 244 */
/* iget-boolean v0, p0, Lcom/google/ads/AdSize;->d:Z */
} // .end method
public Boolean isCustomAdSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 253 */
/* iget-boolean v0, p0, Lcom/google/ads/AdSize;->e:Z */
} // .end method
public Boolean isFullWidth ( ) {
/* .locals 1 */
/* .prologue */
/* .line 235 */
/* iget-boolean v0, p0, Lcom/google/ads/AdSize;->c:Z */
} // .end method
public Boolean isSizeAppropriate ( Integer p0, Integer p1 ) {
/* .locals 8 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .prologue */
/* const-wide/high16 v6, 0x3ff4000000000000L # 1.25 */
/* const-wide v4, 0x3fe999999999999aL # 0.8 */
/* .line 294 */
/* int-to-double v0, p1 */
/* iget v2, p0, Lcom/google/ads/AdSize;->a:I */
/* int-to-double v2, v2 */
/* mul-double/2addr v2, v6 */
/* cmpg-double v0, v0, v2 */
/* if-gtz v0, :cond_0 */
/* int-to-double v0, p1 */
/* iget v2, p0, Lcom/google/ads/AdSize;->a:I */
/* int-to-double v2, v2 */
/* mul-double/2addr v2, v4 */
/* cmpl-double v0, v0, v2 */
/* if-ltz v0, :cond_0 */
/* int-to-double v0, p2 */
/* iget v2, p0, Lcom/google/ads/AdSize;->b:I */
/* int-to-double v2, v2 */
/* mul-double/2addr v2, v6 */
/* cmpg-double v0, v0, v2 */
/* if-gtz v0, :cond_0 */
/* int-to-double v0, p2 */
/* iget v2, p0, Lcom/google/ads/AdSize;->b:I */
/* int-to-double v2, v2 */
/* mul-double/2addr v2, v4 */
/* cmpl-double v0, v0, v2 */
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .prologue */
/* .line 261 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = (( com.google.ads.AdSize ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/google/ads/AdSize;->getWidth()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "x"; // const-string v1, "x"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( com.google.ads.AdSize ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/google/ads/AdSize;->getHeight()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v0 = this.f;
/* if-nez v0, :cond_0 */
final String v0 = ""; // const-string v0, ""
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "_"; // const-string v2, "_"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.f;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
