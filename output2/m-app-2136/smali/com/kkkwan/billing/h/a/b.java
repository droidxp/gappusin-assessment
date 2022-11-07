public abstract class com.kkkwan.billing.h.a.b {
	 /* # instance fields */
	 private java.io.PrintStream a;
	 /* # direct methods */
	 public com.kkkwan.billing.h.a.b ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static Integer a ( java.io.InputStream p0, Object[] p1 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* array-length v1, p1 */
	 /* if-ge v0, v1, :cond_1 */
	 v1 = 	 (( java.io.InputStream ) p0 ).read ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->read()I
	 int v2 = -1; // const/4 v2, -0x1
	 /* if-ne v1, v2, :cond_0 */
} // :goto_1
} // :cond_0
/* int-to-byte v1, v1 */
/* aput-byte v1, p1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* array-length v0, p1 */
} // .end method
private void a ( java.io.InputStream p0, java.io.OutputStream p1 ) {
/* .locals 5 */
/* const/16 v4, 0x39 */
/* new-array v1, v4, [B */
/* invoke-direct {p0, p2}, Lcom/kkkwan/billing/h/a/b;->a(Ljava/io/OutputStream;)V */
} // :goto_0
v2 = com.kkkwan.billing.h.a.b .a ( p1,v1 );
if ( v2 != null) { // if-eqz v2, :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* if-ge v0, v2, :cond_1 */
/* add-int/lit8 v3, v0, 0x3 */
/* if-gt v3, v2, :cond_0 */
int v3 = 3; // const/4 v3, 0x3
(( com.kkkwan.billing.h.a.b ) p0 ).a ( p2, v1, v0, v3 ); // invoke-virtual {p0, p2, v1, v0, v3}, Lcom/kkkwan/billing/h/a/b;->a(Ljava/io/OutputStream;[BII)V
} // :goto_2
/* add-int/lit8 v0, v0, 0x3 */
} // :cond_0
/* sub-int v3, v2, v0 */
(( com.kkkwan.billing.h.a.b ) p0 ).a ( p2, v1, v0, v3 ); // invoke-virtual {p0, p2, v1, v0, v3}, Lcom/kkkwan/billing/h/a/b;->a(Ljava/io/OutputStream;[BII)V
} // :cond_1
/* if-lt v2, v4, :cond_2 */
v0 = this.a;
(( java.io.PrintStream ) v0 ).println ( ); // invoke-virtual {v0}, Ljava/io/PrintStream;->println()V
} // :cond_2
return;
} // .end method
private void a ( java.io.OutputStream p0 ) {
/* .locals 1 */
/* new-instance v0, Ljava/io/PrintStream; */
/* invoke-direct {v0, p1}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public final java.lang.String a ( Object[] p0 ) {
/* .locals 2 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v1, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
try { // :try_start_0
/* invoke-direct {p0, v1, v0}, Lcom/kkkwan/billing/h/a/b;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V */
final String v1 = "8859_1"; // const-string v1, "8859_1"
(( java.io.ByteArrayOutputStream ) v0 ).toString ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v0, Ljava/lang/Error; */
final String v1 = "CharacterEncoder.encode internal error"; // const-string v1, "CharacterEncoder.encode internal error"
/* invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
protected abstract void a ( java.io.OutputStream p0, Object[] p1, Integer p2, Integer p3 ) {
} // .end method
