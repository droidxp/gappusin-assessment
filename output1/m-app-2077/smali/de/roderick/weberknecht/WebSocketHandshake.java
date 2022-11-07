public class de.roderick.weberknecht.WebSocketHandshake {
	 /* .source "WebSocketHandshake.java" */
	 /* # instance fields */
	 private expectedServerResponse;
	 private java.lang.String key1;
	 private java.lang.String key2;
	 private key3;
	 private java.lang.String origin;
	 private java.lang.String protocol;
	 private java.net.URI url;
	 /* # direct methods */
	 public de.roderick.weberknecht.WebSocketHandshake ( ) {
		 /* .locals 1 */
		 /* .param p1, "url" # Ljava/net/URI; */
		 /* .param p2, "protocol" # Ljava/lang/String; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 39 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 29 */
		 this.key1 = v0;
		 /* .line 30 */
		 this.key2 = v0;
		 /* .line 31 */
		 this.key3 = v0;
		 /* .line 32 */
		 this.expectedServerResponse = v0;
		 /* .line 34 */
		 this.url = v0;
		 /* .line 35 */
		 this.origin = v0;
		 /* .line 36 */
		 this.protocol = v0;
		 /* .line 41 */
		 this.url = p1;
		 /* .line 42 */
		 this.protocol = v0;
		 /* .line 43 */
		 /* invoke-direct {p0}, Lde/roderick/weberknecht/WebSocketHandshake;->generateKeys()V */
		 /* .line 44 */
		 return;
	 } // .end method
	 private createRandomBytes ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* const/16 v4, 0x8 */
		 /* .line 203 */
		 /* new-array v0, v4, [B */
		 /* .line 205 */
		 /* .local v0, "bytes":[B */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .local v1, "i":I */
	 } // :goto_0
	 /* if-lt v1, v4, :cond_0 */
	 /* .line 209 */
	 /* .line 206 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0xff */
v2 = /* invoke-direct {p0, v2, v3}, Lde/roderick/weberknecht/WebSocketHandshake;->rand(II)I */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* .line 205 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
private void generateKeys ( ) {
/* .locals 17 */
/* .prologue */
/* .line 124 */
int v13 = 1; // const/4 v13, 0x1
/* const/16 v14, 0xc */
/* move-object/from16 v0, p0 */
v11 = /* invoke-direct {v0, v13, v14}, Lde/roderick/weberknecht/WebSocketHandshake;->rand(II)I */
/* .line 125 */
/* .local v11, "spaces1":I */
int v13 = 1; // const/4 v13, 0x1
/* const/16 v14, 0xc */
/* move-object/from16 v0, p0 */
v12 = /* invoke-direct {v0, v13, v14}, Lde/roderick/weberknecht/WebSocketHandshake;->rand(II)I */
/* .line 127 */
/* .local v12, "spaces2":I */
/* const v13, 0x7fffffff */
/* div-int v3, v13, v11 */
/* .line 128 */
/* .local v3, "max1":I */
/* const v13, 0x7fffffff */
/* div-int v4, v13, v12 */
/* .line 130 */
/* .local v4, "max2":I */
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p0 */
v5 = /* invoke-direct {v0, v13, v3}, Lde/roderick/weberknecht/WebSocketHandshake;->rand(II)I */
/* .line 131 */
/* .local v5, "number1":I */
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p0 */
v7 = /* invoke-direct {v0, v13, v4}, Lde/roderick/weberknecht/WebSocketHandshake;->rand(II)I */
/* .line 133 */
/* .local v7, "number2":I */
/* mul-int v9, v5, v11 */
/* .line 134 */
/* .local v9, "product1":I */
/* mul-int v10, v7, v12 */
/* .line 136 */
/* .local v10, "product2":I */
java.lang.Integer .toString ( v9 );
/* move-object/from16 v0, p0 */
this.key1 = v13;
/* .line 137 */
java.lang.Integer .toString ( v10 );
/* move-object/from16 v0, p0 */
this.key2 = v13;
/* .line 139 */
/* move-object/from16 v0, p0 */
v13 = this.key1;
/* move-object/from16 v0, p0 */
/* invoke-direct {v0, v13}, Lde/roderick/weberknecht/WebSocketHandshake;->insertRandomCharacters(Ljava/lang/String;)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
this.key1 = v13;
/* .line 140 */
/* move-object/from16 v0, p0 */
v13 = this.key2;
/* move-object/from16 v0, p0 */
/* invoke-direct {v0, v13}, Lde/roderick/weberknecht/WebSocketHandshake;->insertRandomCharacters(Ljava/lang/String;)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
this.key2 = v13;
/* .line 142 */
/* move-object/from16 v0, p0 */
v13 = this.key1;
/* move-object/from16 v0, p0 */
/* invoke-direct {v0, v13, v11}, Lde/roderick/weberknecht/WebSocketHandshake;->insertSpaces(Ljava/lang/String;I)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
this.key1 = v13;
/* .line 143 */
/* move-object/from16 v0, p0 */
v13 = this.key2;
/* move-object/from16 v0, p0 */
/* invoke-direct {v0, v13, v12}, Lde/roderick/weberknecht/WebSocketHandshake;->insertSpaces(Ljava/lang/String;I)Ljava/lang/String; */
/* move-object/from16 v0, p0 */
this.key2 = v13;
/* .line 145 */
/* invoke-direct/range {p0 ..p0}, Lde/roderick/weberknecht/WebSocketHandshake;->createRandomBytes()[B */
/* move-object/from16 v0, p0 */
this.key3 = v13;
/* .line 147 */
int v13 = 4; // const/4 v13, 0x4
java.nio.ByteBuffer .allocate ( v13 );
/* .line 148 */
/* .local v1, "buffer":Ljava/nio/ByteBuffer; */
(( java.nio.ByteBuffer ) v1 ).putInt ( v5 ); // invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
/* .line 149 */
(( java.nio.ByteBuffer ) v1 ).array ( ); // invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B
/* .line 150 */
/* .local v6, "number1Array":[B */
int v13 = 4; // const/4 v13, 0x4
java.nio.ByteBuffer .allocate ( v13 );
/* .line 151 */
(( java.nio.ByteBuffer ) v1 ).putInt ( v7 ); // invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
/* .line 152 */
(( java.nio.ByteBuffer ) v1 ).array ( ); // invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B
/* .line 154 */
/* .local v8, "number2Array":[B */
/* const/16 v13, 0x10 */
/* new-array v2, v13, [B */
/* .line 155 */
/* .local v2, "challenge":[B */
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
int v15 = 4; // const/4 v15, 0x4
java.lang.System .arraycopy ( v6,v13,v2,v14,v15 );
/* .line 156 */
int v13 = 0; // const/4 v13, 0x0
int v14 = 4; // const/4 v14, 0x4
int v15 = 4; // const/4 v15, 0x4
java.lang.System .arraycopy ( v8,v13,v2,v14,v15 );
/* .line 157 */
/* move-object/from16 v0, p0 */
v13 = this.key3;
int v14 = 0; // const/4 v14, 0x0
/* const/16 v15, 0x8 */
/* const/16 v16, 0x8 */
/* move/from16 v0, v16 */
java.lang.System .arraycopy ( v13,v14,v2,v15,v0 );
/* .line 159 */
/* move-object/from16 v0, p0 */
/* invoke-direct {v0, v2}, Lde/roderick/weberknecht/WebSocketHandshake;->md5([B)[B */
/* move-object/from16 v0, p0 */
this.expectedServerResponse = v13;
/* .line 160 */
return;
} // .end method
private java.lang.String insertRandomCharacters ( java.lang.String p0 ) {
/* .locals 13 */
/* .param p1, "key" # Ljava/lang/String; */
/* .prologue */
int v12 = 0; // const/4 v12, 0x0
/* .line 165 */
int v8 = 1; // const/4 v8, 0x1
/* const/16 v9, 0xc */
v0 = /* invoke-direct {p0, v8, v9}, Lde/roderick/weberknecht/WebSocketHandshake;->rand(II)I */
/* .line 167 */
/* .local v0, "count":I */
/* new-array v6, v0, [C */
/* .line 168 */
/* .local v6, "randomChars":[C */
int v5 = 0; // const/4 v5, 0x0
/* .line 169 */
/* .local v5, "randCount":I */
} // :cond_0
} // :goto_0
/* if-lt v5, v0, :cond_1 */
/* .line 177 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
/* if-lt v1, v0, :cond_4 */
/* .line 184 */
/* .line 170 */
} // .end local v1 # "i":I
} // :cond_1
java.lang.Math .random ( );
/* move-result-wide v8 */
/* const-wide v10, 0x405f800000000000L # 126.0 */
/* mul-double/2addr v8, v10 */
/* const-wide v10, 0x4040800000000000L # 33.0 */
/* add-double/2addr v8, v10 */
/* double-to-int v4, v8 */
/* .line 171 */
/* .local v4, "rand":I */
/* const/16 v8, 0x21 */
/* if-ge v8, v4, :cond_2 */
/* const/16 v8, 0x2f */
/* if-lt v4, v8, :cond_3 */
} // :cond_2
/* const/16 v8, 0x3a */
/* if-ge v8, v4, :cond_0 */
/* const/16 v8, 0x7e */
/* if-ge v4, v8, :cond_0 */
/* .line 172 */
} // :cond_3
/* int-to-char v8, v4 */
/* aput-char v8, v6, v5 */
/* .line 173 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 178 */
} // .end local v4 # "rand":I
/* .restart local v1 # "i":I */
} // :cond_4
v8 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
v7 = /* invoke-direct {p0, v12, v8}, Lde/roderick/weberknecht/WebSocketHandshake;->rand(II)I */
/* .line 179 */
/* .local v7, "split":I */
(( java.lang.String ) p1 ).substring ( v12, v7 ); // invoke-virtual {p1, v12, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 180 */
/* .local v2, "part1":Ljava/lang/String; */
(( java.lang.String ) p1 ).substring ( v7 ); // invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 181 */
/* .local v3, "part2":Ljava/lang/String; */
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* aget-char v9, v6, v1 */
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 177 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
private java.lang.String insertSpaces ( java.lang.String p0, Integer p1 ) {
/* .locals 6 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "spaces" # I */
/* .prologue */
/* .line 190 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, p2, :cond_0 */
/* .line 197 */
/* .line 191 */
} // :cond_0
int v4 = 1; // const/4 v4, 0x1
v5 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/lit8 v5, v5, -0x1 */
v3 = /* invoke-direct {p0, v4, v5}, Lde/roderick/weberknecht/WebSocketHandshake;->rand(II)I */
/* .line 192 */
/* .local v3, "split":I */
int v4 = 0; // const/4 v4, 0x0
(( java.lang.String ) p1 ).substring ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 193 */
/* .local v1, "part1":Ljava/lang/String; */
(( java.lang.String ) p1 ).substring ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 194 */
/* .local v2, "part2":Ljava/lang/String; */
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = " "; // const-string v5, " "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 190 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private md5 ( Object[] p0 ) {
/* .locals 3 */
/* .param p1, "bytes" # [B */
/* .prologue */
/* .line 216 */
try { // :try_start_0
final String v2 = "MD5"; // const-string v2, "MD5"
java.security.MessageDigest .getInstance ( v2 );
/* .line 217 */
/* .local v1, "md":Ljava/security/MessageDigest; */
(( java.security.MessageDigest ) v1 ).digest ( p1 ); // invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->digest([B)[B
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 220 */
} // .end local v1 # "md":Ljava/security/MessageDigest;
} // :goto_0
/* .line 219 */
/* :catch_0 */
/* move-exception v0 */
/* .line 220 */
/* .local v0, "e":Ljava/security/NoSuchAlgorithmException; */
int v2 = 0; // const/4 v2, 0x0
} // .end method
private Integer rand ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "min" # I */
/* .param p2, "max" # I */
/* .prologue */
/* .line 227 */
java.lang.Math .random ( );
/* move-result-wide v1 */
/* int-to-double v3, p2 */
/* mul-double/2addr v1, v3 */
/* int-to-double v3, p1 */
/* add-double/2addr v1, v3 */
/* double-to-int v0, v1 */
/* .line 228 */
/* .local v0, "rand":I */
} // .end method
/* # virtual methods */
public getHandshake ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 49 */
v4 = this.url;
(( java.net.URI ) v4 ).getPath ( ); // invoke-virtual {v4}, Ljava/net/URI;->getPath()Ljava/lang/String;
/* .line 50 */
/* .local v3, "path":Ljava/lang/String; */
v4 = this.url;
(( java.net.URI ) v4 ).getHost ( ); // invoke-virtual {v4}, Ljava/net/URI;->getHost()Ljava/lang/String;
/* .line 51 */
/* .local v2, "host":Ljava/lang/String; */
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "http://"; // const-string v5, "http://"
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.origin = v4;
/* .line 53 */
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "GET "; // const-string v5, "GET "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = " HTTP/1.1\r\n"; // const-string v5, " HTTP/1.1\r\n"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 54 */
final String v5 = "Host: "; // const-string v5, "Host: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\r\n"; // const-string v5, "\r\n"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 55 */
final String v5 = "Connection: Upgrade\r\n"; // const-string v5, "Connection: Upgrade\r\n"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 56 */
final String v5 = "Sec-WebSocket-Key2: "; // const-string v5, "Sec-WebSocket-Key2: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = this.key2;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\r\n"; // const-string v5, "\r\n"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 53 */
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 58 */
/* .local v0, "handshake":Ljava/lang/String; */
v4 = this.protocol;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 59 */
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = "Sec-WebSocket-Protocol: "; // const-string v5, "Sec-WebSocket-Protocol: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = this.protocol;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\r\n"; // const-string v5, "\r\n"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 62 */
} // :cond_0
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = "Upgrade: WebSocket\r\nSec-WebSocket-Key1: "; // const-string v5, "Upgrade: WebSocket\r\nSec-WebSocket-Key1: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 63 */
v5 = this.key1;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\r\n"; // const-string v5, "\r\n"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 64 */
final String v5 = "Origin: "; // const-string v5, "Origin: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = this.origin;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\r\n"; // const-string v5, "\r\n"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 65 */
final String v5 = "\r\n"; // const-string v5, "\r\n"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 62 */
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 67 */
(( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
/* array-length v4, v4 */
/* add-int/lit8 v4, v4, 0x8 */
/* new-array v1, v4, [B */
/* .line 68 */
/* .local v1, "handshakeBytes":[B */
(( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
(( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
/* array-length v5, v5 */
java.lang.System .arraycopy ( v4,v7,v1,v7,v5 );
/* .line 69 */
v4 = this.key3;
(( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
/* array-length v5, v5 */
/* const/16 v6, 0x8 */
java.lang.System .arraycopy ( v4,v7,v1,v5,v6 );
/* .line 71 */
} // .end method
public void verifyServerHandshakeHeaders ( java.util.HashMap p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 104 */
/* .local p1, "headers":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;" */
final String v0 = "Upgrade"; // const-string v0, "Upgrade"
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
final String v1 = "WebSocket"; // const-string v1, "WebSocket"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 105 */
/* new-instance v0, Lde/roderick/weberknecht/WebSocketException; */
final String v1 = "connection failed: missing header field in server handshake: Upgrade"; // const-string v1, "connection failed: missing header field in server handshake: Upgrade"
/* invoke-direct {v0, v1}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 107 */
} // :cond_0
final String v0 = "Connection"; // const-string v0, "Connection"
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
final String v1 = "Upgrade"; // const-string v1, "Upgrade"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 108 */
/* new-instance v0, Lde/roderick/weberknecht/WebSocketException; */
final String v1 = "connection failed: missing header field in server handshake: Connection"; // const-string v1, "connection failed: missing header field in server handshake: Connection"
/* invoke-direct {v0, v1}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 110 */
} // :cond_1
final String v0 = "Sec-WebSocket-Origin"; // const-string v0, "Sec-WebSocket-Origin"
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
v1 = this.origin;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
/* .line 111 */
/* new-instance v0, Lde/roderick/weberknecht/WebSocketException; */
final String v1 = "connection failed: missing header field in server handshake: Sec-WebSocket-Origin"; // const-string v1, "connection failed: missing header field in server handshake: Sec-WebSocket-Origin"
/* invoke-direct {v0, v1}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 119 */
} // :cond_2
return;
} // .end method
public void verifyServerResponse ( Object[] p0 ) {
/* .locals 2 */
/* .param p1, "bytes" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 78 */
v0 = this.expectedServerResponse;
v0 = java.util.Arrays .equals ( p1,v0 );
/* if-nez v0, :cond_0 */
/* .line 79 */
/* new-instance v0, Lde/roderick/weberknecht/WebSocketException; */
final String v1 = "not a WebSocket Server"; // const-string v1, "not a WebSocket Server"
/* invoke-direct {v0, v1}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 81 */
} // :cond_0
return;
} // .end method
public void verifyServerStatusLine ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "statusLine" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lde/roderick/weberknecht/WebSocketException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 87 */
/* const/16 v1, 0x9 */
/* const/16 v2, 0xc */
(( java.lang.String ) p1 ).substring ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
java.lang.Integer .valueOf ( v1 );
v0 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* .line 89 */
/* .local v0, "statusCode":I */
/* const/16 v1, 0x197 */
/* if-ne v0, v1, :cond_0 */
/* .line 90 */
/* new-instance v1, Lde/roderick/weberknecht/WebSocketException; */
final String v2 = "connection failed: proxy authentication not supported"; // const-string v2, "connection failed: proxy authentication not supported"
/* invoke-direct {v1, v2}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 92 */
} // :cond_0
/* const/16 v1, 0x194 */
/* if-ne v0, v1, :cond_1 */
/* .line 93 */
/* new-instance v1, Lde/roderick/weberknecht/WebSocketException; */
final String v2 = "connection failed: 404 not found"; // const-string v2, "connection failed: 404 not found"
/* invoke-direct {v1, v2}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 95 */
} // :cond_1
/* const/16 v1, 0x65 */
/* if-eq v0, v1, :cond_2 */
/* .line 96 */
/* new-instance v1, Lde/roderick/weberknecht/WebSocketException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "connection failed: unknown status code "; // const-string v3, "connection failed: unknown status code "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Lde/roderick/weberknecht/WebSocketException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 98 */
} // :cond_2
return;
} // .end method
