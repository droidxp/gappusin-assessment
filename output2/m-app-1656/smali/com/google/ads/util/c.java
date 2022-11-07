public class com.google.ads.util.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/util/c$c;, */
	 /* Lcom/google/ads/util/c$b;, */
	 /* Lcom/google/ads/util/c$a; */
	 /* } */
} // .end annotation
/* # static fields */
static final Boolean a; //synthetic
/* # direct methods */
static com.google.ads.util.c ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 29 */
	 /* const-class v0, Lcom/google/ads/util/c; */
	 v0 = 	 (( java.lang.Class ) v0 ).desiredAssertionStatus ( ); // invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
com.google.ads.util.c.a = (v0!= 0);
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private com.google.ads.util.c ( ) {
/* .locals 0 */
/* .prologue */
/* .line 798 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 799 */
return;
} // .end method
public static a ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 118 */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
int v1 = 0; // const/4 v1, 0x0
com.google.ads.util.c .a ( v0,v1 );
} // .end method
public static a ( Object[] p0, Integer p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 161 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
com.google.ads.util.c .a ( p0,v0,v1,p1 );
} // .end method
public static a ( Object[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 188 */
/* new-instance v1, Lcom/google/ads/util/c$b; */
/* mul-int/lit8 v0, p2, 0x3 */
/* div-int/lit8 v0, v0, 0x4 */
/* new-array v0, v0, [B */
/* invoke-direct {v1, p3, v0}, Lcom/google/ads/util/c$b;-><init>(I[B)V */
/* .line 190 */
int v0 = 1; // const/4 v0, 0x1
v0 = (( com.google.ads.util.c$b ) v1 ).a ( p0, p1, p2, v0 ); // invoke-virtual {v1, p0, p1, p2, v0}, Lcom/google/ads/util/c$b;->a([BIIZ)Z
/* if-nez v0, :cond_0 */
/* .line 191 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "bad base-64"; // const-string v1, "bad base-64"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 195 */
} // :cond_0
/* iget v0, v1, Lcom/google/ads/util/c$b;->b:I */
v2 = this.a;
/* array-length v2, v2 */
/* if-ne v0, v2, :cond_1 */
/* .line 196 */
v0 = this.a;
/* .line 203 */
} // :goto_0
/* .line 201 */
} // :cond_1
/* iget v0, v1, Lcom/google/ads/util/c$b;->b:I */
/* new-array v0, v0, [B */
/* .line 202 */
v2 = this.a;
/* iget v1, v1, Lcom/google/ads/util/c$b;->b:I */
java.lang.System .arraycopy ( v2,v3,v0,v3,v1 );
} // .end method
public static java.lang.String b ( Object[] p0, Integer p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 487 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/String; */
com.google.ads.util.c .c ( p0,p1 );
final String v2 = "US-ASCII"; // const-string v2, "US-ASCII"
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 489 */
/* :catch_0 */
/* move-exception v0 */
/* .line 491 */
/* new-instance v1, Ljava/lang/AssertionError; */
/* invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw v1 */
} // .end method
public static b ( Object[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 5 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 549 */
/* new-instance v3, Lcom/google/ads/util/c$c; */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {v3, p3, v0}, Lcom/google/ads/util/c$c;-><init>(I[B)V */
/* .line 552 */
/* div-int/lit8 v0, p2, 0x3 */
/* mul-int/lit8 v0, v0, 0x4 */
/* .line 555 */
/* iget-boolean v1, v3, Lcom/google/ads/util/c$c;->d:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 556 */
/* rem-int/lit8 v1, p2, 0x3 */
/* if-lez v1, :cond_0 */
/* .line 557 */
/* add-int/lit8 v0, v0, 0x4 */
/* .line 574 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
/* iget-boolean v1, v3, Lcom/google/ads/util/c$c;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* if-lez p2, :cond_1 */
/* .line 575 */
/* add-int/lit8 v1, p2, -0x1 */
/* div-int/lit8 v1, v1, 0x39 */
/* add-int/lit8 v4, v1, 0x1 */
/* iget-boolean v1, v3, Lcom/google/ads/util/c$c;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
int v1 = 2; // const/4 v1, 0x2
} // :goto_1
/* mul-int/2addr v1, v4 */
/* add-int/2addr v0, v1 */
/* .line 579 */
} // :cond_1
/* new-array v1, v0, [B */
this.a = v1;
/* .line 580 */
(( com.google.ads.util.c$c ) v3 ).a ( p0, p1, p2, v2 ); // invoke-virtual {v3, p0, p1, p2, v2}, Lcom/google/ads/util/c$c;->a([BIIZ)Z
/* .line 582 */
/* sget-boolean v1, Lcom/google/ads/util/c;->a:Z */
/* if-nez v1, :cond_4 */
/* iget v1, v3, Lcom/google/ads/util/c$c;->b:I */
/* if-eq v1, v0, :cond_4 */
/* new-instance v0, Ljava/lang/AssertionError; */
/* invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V */
/* throw v0 */
/* .line 561 */
} // :cond_2
/* rem-int/lit8 v1, p2, 0x3 */
/* packed-switch v1, :pswitch_data_0 */
/* .line 565 */
/* :pswitch_1 */
/* add-int/lit8 v0, v0, 0x2 */
/* .line 566 */
/* .line 568 */
/* :pswitch_2 */
/* add-int/lit8 v0, v0, 0x3 */
} // :cond_3
/* move v1, v2 */
/* .line 575 */
/* .line 584 */
} // :cond_4
v0 = this.a;
/* .line 561 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public static c ( Object[] p0, Integer p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 531 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
com.google.ads.util.c .b ( p0,v0,v1,p1 );
} // .end method
