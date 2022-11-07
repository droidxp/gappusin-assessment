public class org.anddev.andengine.util.Base64 {
	 /* # static fields */
	 static final Boolean $assertionsDisabled; //synthetic
	 public static final Integer CRLF;
	 public static final Integer DEFAULT;
	 public static final Integer NO_CLOSE;
	 public static final Integer NO_PADDING;
	 public static final Integer NO_WRAP;
	 public static final Integer URL_SAFE;
	 /* # direct methods */
	 static org.anddev.andengine.util.Base64 ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lorg/anddev/andengine/util/Base64; */
		 v0 = 		 (( java.lang.Class ) v0 ).desiredAssertionStatus ( ); // invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
	 org.anddev.andengine.util.Base64.$assertionsDisabled = (v0!= 0);
	 return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private org.anddev.andengine.util.Base64 ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static decode ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
org.anddev.andengine.util.Base64 .decode ( v0,p1 );
} // .end method
public static decode ( Object[] p0, Integer p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
org.anddev.andengine.util.Base64 .decode ( p0,v0,v1,p1 );
} // .end method
public static decode ( Object[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* new-instance v0, Lorg/anddev/andengine/util/Base64$Decoder; */
/* mul-int/lit8 v1, p2, 0x3 */
/* div-int/lit8 v1, v1, 0x4 */
/* new-array v1, v1, [B */
/* invoke-direct {v0, p3, v1}, Lorg/anddev/andengine/util/Base64$Decoder;-><init>(I[B)V */
int v1 = 1; // const/4 v1, 0x1
v1 = (( org.anddev.andengine.util.Base64$Decoder ) v0 ).process ( p0, p1, p2, v1 ); // invoke-virtual {v0, p0, p1, p2, v1}, Lorg/anddev/andengine/util/Base64$Decoder;->process([BIIZ)Z
/* if-nez v1, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "bad base-64"; // const-string v1, "bad base-64"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* iget v1, v0, Lorg/anddev/andengine/util/Base64$Decoder;->op:I */
v2 = this.output;
/* array-length v2, v2 */
/* if-ne v1, v2, :cond_1 */
v0 = this.output;
} // :goto_0
} // :cond_1
/* iget v1, v0, Lorg/anddev/andengine/util/Base64$Decoder;->op:I */
/* new-array v1, v1, [B */
v2 = this.output;
/* iget v0, v0, Lorg/anddev/andengine/util/Base64$Decoder;->op:I */
java.lang.System .arraycopy ( v2,v3,v1,v3,v0 );
/* move-object v0, v1 */
} // .end method
public static encode ( Object[] p0, Integer p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
org.anddev.andengine.util.Base64 .encode ( p0,v0,v1,p1 );
} // .end method
public static encode ( Object[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
/* new-instance v0, Lorg/anddev/andengine/util/Base64$Encoder; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p3, v1}, Lorg/anddev/andengine/util/Base64$Encoder;-><init>(I[B)V */
/* div-int/lit8 v1, p2, 0x3 */
/* mul-int/lit8 v1, v1, 0x4 */
/* iget-boolean v2, v0, Lorg/anddev/andengine/util/Base64$Encoder;->do_padding:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* rem-int/lit8 v2, p2, 0x3 */
/* if-lez v2, :cond_0 */
/* add-int/lit8 v1, v1, 0x4 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
/* iget-boolean v2, v0, Lorg/anddev/andengine/util/Base64$Encoder;->do_newline:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* if-lez p2, :cond_1 */
/* sub-int v2, p2, v4 */
/* div-int/lit8 v2, v2, 0x39 */
/* add-int/lit8 v2, v2, 0x1 */
/* iget-boolean v3, v0, Lorg/anddev/andengine/util/Base64$Encoder;->do_cr:Z */
if ( v3 != null) { // if-eqz v3, :cond_3
int v3 = 2; // const/4 v3, 0x2
} // :goto_1
/* mul-int/2addr v2, v3 */
/* add-int/2addr v1, v2 */
} // :cond_1
/* new-array v2, v1, [B */
this.output = v2;
(( org.anddev.andengine.util.Base64$Encoder ) v0 ).process ( p0, p1, p2, v4 ); // invoke-virtual {v0, p0, p1, p2, v4}, Lorg/anddev/andengine/util/Base64$Encoder;->process([BIIZ)Z
/* sget-boolean v2, Lorg/anddev/andengine/util/Base64;->$assertionsDisabled:Z */
/* if-nez v2, :cond_4 */
/* iget v2, v0, Lorg/anddev/andengine/util/Base64$Encoder;->op:I */
/* if-eq v2, v1, :cond_4 */
/* new-instance v0, Ljava/lang/AssertionError; */
/* invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V */
/* throw v0 */
} // :cond_2
/* rem-int/lit8 v2, p2, 0x3 */
/* packed-switch v2, :pswitch_data_0 */
/* :pswitch_1 */
/* add-int/lit8 v1, v1, 0x2 */
/* :pswitch_2 */
/* add-int/lit8 v1, v1, 0x3 */
} // :cond_3
/* move v3, v4 */
} // :cond_4
v0 = this.output;
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public static java.lang.String encodeToString ( Object[] p0, Integer p1 ) {
/* .locals 3 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/String; */
org.anddev.andengine.util.Base64 .encode ( p0,p1 );
final String v2 = "US-ASCII"; // const-string v2, "US-ASCII"
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/AssertionError; */
/* invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw v1 */
} // .end method
public static java.lang.String encodeToString ( Object[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 3 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/String; */
org.anddev.andengine.util.Base64 .encode ( p0,p1,p2,p3 );
final String v2 = "US-ASCII"; // const-string v2, "US-ASCII"
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Ljava/lang/AssertionError; */
/* invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw v1 */
} // .end method
