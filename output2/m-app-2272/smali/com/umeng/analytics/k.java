public class com.umeng.analytics.k {
	 /* .source "UmengTimeStack.java" */
	 /* # static fields */
	 private static final Integer b;
	 /* # instance fields */
	 private java.util.Vector a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Vector", */
	 /* "<", */
	 /* "Ljava/lang/Long;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.lang.String c;
/* # direct methods */
public com.umeng.analytics.k ( ) {
/* .locals 2 */
/* .prologue */
/* .line 25 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 26 */
/* new-instance v0, Ljava/util/Vector; */
int v1 = 4; // const/4 v1, 0x4
/* invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V */
this.a = v0;
/* .line 27 */
this.c = p1;
/* .line 28 */
return;
} // .end method
public com.umeng.analytics.k ( ) {
/* .locals 2 */
/* .prologue */
/* .line 30 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 31 */
this.c = p1;
/* .line 32 */
/* if-gez p2, :cond_0 */
/* .line 33 */
/* new-instance v0, Ljava/util/Vector; */
int v1 = 4; // const/4 v1, 0x4
/* invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V */
this.a = v0;
/* .line 37 */
} // :goto_0
return;
/* .line 35 */
} // :cond_0
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0, p2}, Ljava/util/Vector;-><init>(I)V */
this.a = v0;
} // .end method
public static com.umeng.analytics.k a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 105 */
com.umeng.analytics.j .e ( p0 );
/* .line 106 */
int v1 = 0; // const/4 v1, 0x0
/* .line 108 */
com.umeng.analytics.k .a ( p1,v0 );
} // .end method
public static com.umeng.analytics.k a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 7 */
/* .prologue */
/* .line 113 */
/* new-instance v0, Lcom/umeng/analytics/k; */
/* invoke-direct {v0, p0}, Lcom/umeng/analytics/k;-><init>(Ljava/lang/String;)V */
/* .line 115 */
v1 = android.text.TextUtils .isEmpty ( p1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 137 */
} // :cond_0
/* .line 119 */
} // :cond_1
final String v1 = ","; // const-string v1, ","
(( java.lang.String ) p1 ).split ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 120 */
/* array-length v3, v2 */
/* .line 122 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v3, :cond_0 */
/* .line 124 */
/* aget-object v4, v2, v1 */
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 125 */
v5 = android.text.TextUtils .isEmpty ( v4 );
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 122 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 128 */
} // :cond_2
/* const-wide/16 v5, -0x1 */
java.lang.Long .valueOf ( v5,v6 );
/* .line 130 */
try { // :try_start_0
java.lang.Long .parseLong ( v4 );
/* move-result-wide v4 */
java.lang.Long .valueOf ( v4,v5 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 134 */
(( com.umeng.analytics.k ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/umeng/analytics/k;->a(Ljava/lang/Long;)V
/* .line 131 */
/* :catch_0 */
/* move-exception v4 */
} // .end method
/* # virtual methods */
public java.lang.Long a ( ) {
/* .locals 2 */
/* .prologue */
/* .line 61 */
v0 = this.a;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
/* .line 62 */
/* if-gtz v0, :cond_0 */
/* .line 63 */
/* const-wide/16 v0, -0x1 */
java.lang.Long .valueOf ( v0,v1 );
/* .line 65 */
} // :goto_0
} // :cond_0
v1 = this.a;
/* add-int/lit8 v0, v0, -0x1 */
(( java.util.Vector ) v1 ).remove ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 141 */
(( com.umeng.analytics.k ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/umeng/analytics/k;->toString()Ljava/lang/String;
/* .line 142 */
com.umeng.analytics.j .e ( p1 );
/* .line 144 */
v2 = android.text.TextUtils .isEmpty ( v0 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 145 */
v0 = this.c;
/* .line 150 */
} // :goto_0
return;
/* .line 149 */
} // :cond_0
v2 = this.c;
} // .end method
public void a ( java.lang.Long p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 47 */
} // :goto_0
v0 = this.a;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
int v1 = 4; // const/4 v1, 0x4
/* if-ge v0, v1, :cond_0 */
/* .line 51 */
v0 = this.a;
(( java.util.Vector ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 52 */
return;
/* .line 48 */
} // :cond_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( java.util.Vector ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
v0 = this.a;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .prologue */
/* .line 80 */
v0 = this.a;
v1 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
/* .line 82 */
/* if-gtz v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 94 */
} // :goto_0
/* .line 84 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuffer; */
int v0 = 4; // const/4 v0, 0x4
/* invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(I)V */
/* .line 86 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* if-lt v0, v1, :cond_1 */
/* .line 92 */
v0 = this.a;
(( java.util.Vector ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/Vector;->clear()V
/* .line 94 */
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 87 */
} // :cond_1
v3 = this.a;
(( java.util.Vector ) v3 ).get ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
/* .line 89 */
/* add-int/lit8 v3, v1, -0x1 */
/* if-eq v0, v3, :cond_2 */
final String v3 = ","; // const-string v3, ","
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 86 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
