public class com.google.ads.internal.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 private static Long f;
	 private static Long h;
	 /* # instance fields */
	 public java.lang.String a;
	 private java.util.LinkedList b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/LinkedList", */
	 /* "<", */
	 /* "Ljava/lang/Long;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private Long c;
private Long d;
private java.util.LinkedList e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Ljava/lang/Long;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.lang.String g;
private Boolean i;
private Boolean j;
/* # direct methods */
static com.google.ads.internal.g ( ) {
/* .locals 2 */
/* .prologue */
/* .line 72 */
/* const-wide/16 v0, 0x0 */
/* sput-wide v0, Lcom/google/ads/internal/g;->f:J */
/* .line 78 */
/* const-wide/16 v0, -0x1 */
/* sput-wide v0, Lcom/google/ads/internal/g;->h:J */
return;
} // .end method
protected com.google.ads.internal.g ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 98 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 83 */
/* iput-boolean v0, p0, Lcom/google/ads/internal/g;->i:Z */
/* .line 88 */
/* iput-boolean v0, p0, Lcom/google/ads/internal/g;->j:Z */
/* .line 99 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.b = v0;
/* .line 100 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.e = v0;
/* .line 101 */
(( com.google.ads.internal.g ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/g;->a()V
/* .line 102 */
return;
} // .end method
public static Long q ( ) {
/* .locals 4 */
/* .prologue */
/* .line 287 */
/* sget-wide v0, Lcom/google/ads/internal/g;->h:J */
/* const-wide/16 v2, -0x1 */
/* cmp-long v0, v0, v2 */
/* if-nez v0, :cond_0 */
/* .line 289 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* sput-wide v0, Lcom/google/ads/internal/g;->h:J */
/* .line 290 */
/* const-wide/16 v0, 0x0 */
/* .line 292 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* sget-wide v2, Lcom/google/ads/internal/g;->h:J */
/* sub-long/2addr v0, v2 */
} // .end method
/* # virtual methods */
protected void a ( ) {
/* .locals 4 */
/* .prologue */
/* const-wide/16 v2, 0x0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 110 */
v0 = this.b;
(( java.util.LinkedList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
/* .line 111 */
/* iput-wide v2, p0, Lcom/google/ads/internal/g;->c:J */
/* .line 112 */
/* iput-wide v2, p0, Lcom/google/ads/internal/g;->d:J */
/* .line 113 */
v0 = this.e;
(( java.util.LinkedList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
/* .line 114 */
int v0 = 0; // const/4 v0, 0x0
this.g = v0;
/* .line 115 */
/* iput-boolean v1, p0, Lcom/google/ads/internal/g;->i:Z */
/* .line 116 */
/* iput-boolean v1, p0, Lcom/google/ads/internal/g;->j:Z */
/* .line 117 */
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 242 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Prior ad identifier = "; // const-string v1, "Prior ad identifier = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .d ( v0 );
/* .line 243 */
this.g = p1;
/* .line 244 */
return;
} // .end method
protected void b ( ) {
/* .locals 3 */
/* .prologue */
/* .line 125 */
final String v0 = "Ad clicked."; // const-string v0, "Ad clicked."
com.google.ads.util.b .d ( v0 );
/* .line 126 */
v0 = this.b;
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
(( java.util.LinkedList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 127 */
return;
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 277 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Prior impression ticket = "; // const-string v1, "Prior impression ticket = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .d ( v0 );
/* .line 278 */
this.a = p1;
/* .line 279 */
return;
} // .end method
protected void c ( ) {
/* .locals 2 */
/* .prologue */
/* .line 135 */
final String v0 = "Ad request loaded."; // const-string v0, "Ad request loaded."
com.google.ads.util.b .d ( v0 );
/* .line 136 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/google/ads/internal/g;->c:J */
/* .line 137 */
return;
} // .end method
protected void d ( ) {
/* .locals 4 */
/* .prologue */
/* .line 145 */
final String v0 = "Ad request started."; // const-string v0, "Ad request started."
com.google.ads.util.b .d ( v0 );
/* .line 146 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/google/ads/internal/g;->d:J */
/* .line 147 */
/* sget-wide v0, Lcom/google/ads/internal/g;->f:J */
/* const-wide/16 v2, 0x1 */
/* add-long/2addr v0, v2 */
/* sput-wide v0, Lcom/google/ads/internal/g;->f:J */
/* .line 148 */
return;
} // .end method
protected Long e ( ) {
/* .locals 2 */
/* .prologue */
/* .line 158 */
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
v1 = this.e;
v1 = (( java.util.LinkedList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->size()I
/* if-eq v0, v1, :cond_0 */
/* .line 159 */
/* const-wide/16 v0, -0x1 */
/* .line 161 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
/* int-to-long v0, v0 */
} // .end method
protected java.lang.String f ( ) {
/* .locals 7 */
/* .prologue */
/* .line 176 */
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
/* if-nez v0, :cond_0 */
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
v1 = this.e;
v1 = (( java.util.LinkedList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->size()I
/* if-eq v0, v1, :cond_1 */
/* .line 178 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 190 */
} // :goto_0
/* .line 182 */
} // :cond_1
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 183 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
} // :goto_1
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
/* if-ge v1, v0, :cond_3 */
/* .line 184 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 185 */
final String v0 = ","; // const-string v0, ","
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 187 */
} // :cond_2
v0 = this.e;
(( java.util.LinkedList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v3 */
v0 = this.b;
(( java.util.LinkedList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v5 */
/* sub-long/2addr v3, v5 */
java.lang.Long .toString ( v3,v4 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 183 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* .line 190 */
} // :cond_3
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
protected java.lang.String g ( ) {
/* .locals 7 */
/* .prologue */
/* .line 204 */
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 205 */
int v0 = 0; // const/4 v0, 0x0
/* .line 217 */
} // :goto_0
/* .line 209 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 210 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
} // :goto_1
v0 = this.b;
v0 = (( java.util.LinkedList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
/* if-ge v1, v0, :cond_2 */
/* .line 211 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 212 */
final String v0 = ","; // const-string v0, ","
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 214 */
} // :cond_1
v0 = this.b;
(( java.util.LinkedList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v3 */
/* iget-wide v5, p0, Lcom/google/ads/internal/g;->c:J */
/* sub-long/2addr v3, v5 */
java.lang.Long .toString ( v3,v4 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 210 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* .line 217 */
} // :cond_2
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
protected Long h ( ) {
/* .locals 4 */
/* .prologue */
/* .line 230 */
/* iget-wide v0, p0, Lcom/google/ads/internal/g;->c:J */
/* iget-wide v2, p0, Lcom/google/ads/internal/g;->d:J */
/* sub-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
protected Long i ( ) {
/* .locals 2 */
/* .prologue */
/* .line 234 */
/* sget-wide v0, Lcom/google/ads/internal/g;->f:J */
/* return-wide v0 */
} // .end method
protected java.lang.String j ( ) {
/* .locals 1 */
/* .prologue */
/* .line 238 */
v0 = this.g;
} // .end method
protected Boolean k ( ) {
/* .locals 1 */
/* .prologue */
/* .line 247 */
/* iget-boolean v0, p0, Lcom/google/ads/internal/g;->i:Z */
} // .end method
protected void l ( ) {
/* .locals 1 */
/* .prologue */
/* .line 251 */
final String v0 = "Interstitial network error."; // const-string v0, "Interstitial network error."
com.google.ads.util.b .d ( v0 );
/* .line 252 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/internal/g;->i:Z */
/* .line 253 */
return;
} // .end method
protected Boolean m ( ) {
/* .locals 1 */
/* .prologue */
/* .line 256 */
/* iget-boolean v0, p0, Lcom/google/ads/internal/g;->j:Z */
} // .end method
protected void n ( ) {
/* .locals 1 */
/* .prologue */
/* .line 260 */
final String v0 = "Interstitial no fill."; // const-string v0, "Interstitial no fill."
com.google.ads.util.b .d ( v0 );
/* .line 261 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/internal/g;->j:Z */
/* .line 262 */
return;
} // .end method
public void o ( ) {
/* .locals 3 */
/* .prologue */
/* .line 268 */
final String v0 = "Landing page dismissed."; // const-string v0, "Landing page dismissed."
com.google.ads.util.b .d ( v0 );
/* .line 269 */
v0 = this.e;
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
(( java.util.LinkedList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 270 */
return;
} // .end method
protected java.lang.String p ( ) {
/* .locals 1 */
/* .prologue */
/* .line 273 */
v0 = this.a;
} // .end method
