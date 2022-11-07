public class org.apache.commons.codec.digest.Sha2Crypt {
	 /* .source "Sha2Crypt.java" */
	 /* # static fields */
	 private static final Integer ROUNDS_DEFAULT;
	 private static final Integer ROUNDS_MAX;
	 private static final Integer ROUNDS_MIN;
	 private static final java.lang.String ROUNDS_PREFIX;
	 private static final java.util.regex.Pattern SALT_PATTERN;
	 private static final Integer SHA256_BLOCKSIZE;
	 static final java.lang.String SHA256_PREFIX;
	 private static final Integer SHA512_BLOCKSIZE;
	 static final java.lang.String SHA512_PREFIX;
	 /* # direct methods */
	 static org.apache.commons.codec.digest.Sha2Crypt ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 68 */
		 final String v0 = "^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*"; // const-string v0, "^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*"
		 java.util.regex.Pattern .compile ( v0 );
		 return;
	 } // .end method
	 public org.apache.commons.codec.digest.Sha2Crypt ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 41 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String sha256Crypt ( Object[] p0 ) {
		 /* .locals 1 */
		 /* .param p0, "keyBytes" # [B */
		 /* .prologue */
		 /* .line 80 */
		 int v0 = 0; // const/4 v0, 0x0
		 org.apache.commons.codec.digest.Sha2Crypt .sha256Crypt ( p0,v0 );
	 } // .end method
	 public static java.lang.String sha256Crypt ( Object[] p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .param p0, "keyBytes" # [B */
		 /* .param p1, "salt" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 94 */
		 /* if-nez p1, :cond_0 */
		 /* .line 95 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "$5$"; // const-string v1, "$5$"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* const/16 v1, 0x8 */
		 org.apache.commons.codec.digest.B64 .getRandomSalt ( v1 );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 97 */
	 } // :cond_0
	 final String v0 = "$5$"; // const-string v0, "$5$"
	 /* const/16 v1, 0x20 */
	 final String v2 = "SHA-256"; // const-string v2, "SHA-256"
	 org.apache.commons.codec.digest.Sha2Crypt .sha2Crypt ( p0,p1,v0,v1,v2 );
} // .end method
private static java.lang.String sha2Crypt ( Object[] p0, java.lang.String p1, java.lang.String p2, Integer p3, java.lang.String p4 ) {
	 /* .locals 25 */
	 /* .param p0, "keyBytes" # [B */
	 /* .param p1, "salt" # Ljava/lang/String; */
	 /* .param p2, "saltPrefix" # Ljava/lang/String; */
	 /* .param p3, "blocksize" # I */
	 /* .param p4, "algorithm" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 128 */
	 /* move-object/from16 v0, p0 */
	 /* array-length v11, v0 */
	 /* .line 131 */
	 /* .local v11, "keyLen":I */
	 /* const/16 v14, 0x1388 */
	 /* .line 132 */
	 /* .local v14, "rounds":I */
	 int v15 = 0; // const/4 v15, 0x0
	 /* .line 133 */
	 /* .local v15, "roundsCustom":Z */
	 /* if-nez p1, :cond_0 */
	 /* .line 134 */
	 /* new-instance v21, Ljava/lang/IllegalArgumentException; */
	 final String v22 = "Salt must not be null"; // const-string v22, "Salt must not be null"
	 /* invoke-direct/range {v21 ..v22}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v21 */
	 /* .line 137 */
} // :cond_0
v21 = org.apache.commons.codec.digest.Sha2Crypt.SALT_PATTERN;
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p1 */
(( java.util.regex.Pattern ) v0 ).matcher ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/* .line 138 */
/* .local v12, "m":Ljava/util/regex/Matcher; */
if ( v12 != null) { // if-eqz v12, :cond_1
	 v21 = 	 (( java.util.regex.Matcher ) v12 ).find ( ); // invoke-virtual {v12}, Ljava/util/regex/Matcher;->find()Z
	 /* if-nez v21, :cond_2 */
	 /* .line 139 */
} // :cond_1
/* new-instance v21, Ljava/lang/IllegalArgumentException; */
/* new-instance v22, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v22 ..v22}, Ljava/lang/StringBuilder;-><init>()V */
final String v23 = "Invalid salt value: "; // const-string v23, "Invalid salt value: "
/* invoke-virtual/range {v22 ..v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v22 */
/* move-object/from16 v1, p1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v22 ..v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-direct/range {v21 ..v22}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v21 */
/* .line 141 */
} // :cond_2
/* const/16 v21, 0x3 */
/* move/from16 v0, v21 */
(( java.util.regex.Matcher ) v12 ).group ( v0 ); // invoke-virtual {v12, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
if ( v21 != null) { // if-eqz v21, :cond_3
/* .line 142 */
/* const/16 v21, 0x3 */
/* move/from16 v0, v21 */
(( java.util.regex.Matcher ) v12 ).group ( v0 ); // invoke-virtual {v12, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
v14 = /* invoke-static/range {v21 ..v21}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I */
/* .line 143 */
/* const/16 v21, 0x3e8 */
/* const v22, 0x3b9ac9ff */
/* move/from16 v0, v22 */
v22 = java.lang.Math .min ( v0,v14 );
v14 = /* invoke-static/range {v21 ..v22}, Ljava/lang/Math;->max(II)I */
/* .line 144 */
int v15 = 1; // const/4 v15, 0x1
/* .line 146 */
} // :cond_3
/* const/16 v21, 0x4 */
/* move/from16 v0, v21 */
(( java.util.regex.Matcher ) v12 ).group ( v0 ); // invoke-virtual {v12, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
/* .line 147 */
/* .local v19, "saltString":Ljava/lang/String; */
v21 = org.apache.commons.codec.Charsets.UTF_8;
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v21 */
(( java.lang.String ) v0 ).getBytes ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
/* .line 148 */
/* .local v17, "saltBytes":[B */
/* move-object/from16 v0, v17 */
/* array-length v0, v0 */
/* move/from16 v18, v0 */
/* .line 152 */
/* .local v18, "saltLen":I */
/* invoke-static/range {p4 ..p4}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest; */
/* .line 158 */
/* .local v9, "ctx":Ljava/security/MessageDigest; */
/* move-object/from16 v0, p0 */
(( java.security.MessageDigest ) v9 ).update ( v0 ); // invoke-virtual {v9, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 173 */
/* move-object/from16 v0, v17 */
(( java.security.MessageDigest ) v9 ).update ( v0 ); // invoke-virtual {v9, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 180 */
/* invoke-static/range {p4 ..p4}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest; */
/* .line 186 */
/* .local v4, "altCtx":Ljava/security/MessageDigest; */
/* move-object/from16 v0, p0 */
(( java.security.MessageDigest ) v4 ).update ( v0 ); // invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 192 */
/* move-object/from16 v0, v17 */
(( java.security.MessageDigest ) v4 ).update ( v0 ); // invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 198 */
/* move-object/from16 v0, p0 */
(( java.security.MessageDigest ) v4 ).update ( v0 ); // invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 204 */
(( java.security.MessageDigest ) v4 ).digest ( ); // invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B
/* .line 214 */
/* .local v5, "altResult":[B */
/* move-object/from16 v0, p0 */
/* array-length v7, v0 */
/* .line 215 */
/* .local v7, "cnt":I */
} // :goto_0
/* move/from16 v0, p3 */
/* if-le v7, v0, :cond_4 */
/* .line 216 */
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
/* move/from16 v1, p3 */
(( java.security.MessageDigest ) v9 ).update ( v5, v0, v1 ); // invoke-virtual {v9, v5, v0, v1}, Ljava/security/MessageDigest;->update([BII)V
/* .line 217 */
/* sub-int v7, v7, p3 */
/* .line 222 */
} // :cond_4
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
(( java.security.MessageDigest ) v9 ).update ( v5, v0, v7 ); // invoke-virtual {v9, v5, v0, v7}, Ljava/security/MessageDigest;->update([BII)V
/* .line 238 */
/* move-object/from16 v0, p0 */
/* array-length v7, v0 */
/* .line 239 */
} // :goto_1
/* if-lez v7, :cond_6 */
/* .line 240 */
/* and-int/lit8 v21, v7, 0x1 */
if ( v21 != null) { // if-eqz v21, :cond_5
/* .line 241 */
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
/* move/from16 v1, p3 */
(( java.security.MessageDigest ) v9 ).update ( v5, v0, v1 ); // invoke-virtual {v9, v5, v0, v1}, Ljava/security/MessageDigest;->update([BII)V
/* .line 245 */
} // :goto_2
/* shr-int/lit8 v7, v7, 0x1 */
/* .line 243 */
} // :cond_5
/* move-object/from16 v0, p0 */
(( java.security.MessageDigest ) v9 ).update ( v0 ); // invoke-virtual {v9, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 252 */
} // :cond_6
(( java.security.MessageDigest ) v9 ).digest ( ); // invoke-virtual {v9}, Ljava/security/MessageDigest;->digest()[B
/* .line 258 */
/* invoke-static/range {p4 ..p4}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest; */
/* .line 267 */
int v10 = 1; // const/4 v10, 0x1
/* .local v10, "i":I */
} // :goto_3
/* if-gt v10, v11, :cond_7 */
/* .line 268 */
/* move-object/from16 v0, p0 */
(( java.security.MessageDigest ) v4 ).update ( v0 ); // invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 267 */
/* add-int/lit8 v10, v10, 0x1 */
/* .line 275 */
} // :cond_7
(( java.security.MessageDigest ) v4 ).digest ( ); // invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B
/* .line 287 */
/* .local v20, "tempResult":[B */
/* new-array v13, v11, [B */
/* .line 288 */
/* .local v13, "pBytes":[B */
int v8 = 0; // const/4 v8, 0x0
/* .line 289 */
/* .local v8, "cp":I */
} // :goto_4
/* sub-int v21, v11, p3 */
/* move/from16 v0, v21 */
/* if-ge v8, v0, :cond_8 */
/* .line 290 */
/* const/16 v21, 0x0 */
/* move-object/from16 v0, v20 */
/* move/from16 v1, v21 */
/* move/from16 v2, p3 */
java.lang.System .arraycopy ( v0,v1,v13,v8,v2 );
/* .line 291 */
/* add-int v8, v8, p3 */
/* .line 293 */
} // :cond_8
/* const/16 v21, 0x0 */
/* sub-int v22, v11, v8 */
/* move-object/from16 v0, v20 */
/* move/from16 v1, v21 */
/* move/from16 v2, v22 */
java.lang.System .arraycopy ( v0,v1,v13,v8,v2 );
/* .line 299 */
/* invoke-static/range {p4 ..p4}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest; */
/* .line 308 */
int v10 = 1; // const/4 v10, 0x1
} // :goto_5
/* const/16 v21, 0x0 */
/* aget-byte v21, v5, v21 */
/* move/from16 v0, v21 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v21, v0 */
/* add-int/lit8 v21, v21, 0x10 */
/* move/from16 v0, v21 */
/* if-gt v10, v0, :cond_9 */
/* .line 309 */
/* move-object/from16 v0, v17 */
(( java.security.MessageDigest ) v4 ).update ( v0 ); // invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 308 */
/* add-int/lit8 v10, v10, 0x1 */
/* .line 316 */
} // :cond_9
(( java.security.MessageDigest ) v4 ).digest ( ); // invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B
/* .line 329 */
/* move/from16 v0, v18 */
/* new-array v0, v0, [B */
/* move-object/from16 v16, v0 */
/* .line 330 */
/* .local v16, "sBytes":[B */
int v8 = 0; // const/4 v8, 0x0
/* .line 331 */
} // :goto_6
/* sub-int v21, v18, p3 */
/* move/from16 v0, v21 */
/* if-ge v8, v0, :cond_a */
/* .line 332 */
/* const/16 v21, 0x0 */
/* move-object/from16 v0, v20 */
/* move/from16 v1, v21 */
/* move-object/from16 v2, v16 */
/* move/from16 v3, p3 */
java.lang.System .arraycopy ( v0,v1,v2,v8,v3 );
/* .line 333 */
/* add-int v8, v8, p3 */
/* .line 335 */
} // :cond_a
/* const/16 v21, 0x0 */
/* sub-int v22, v18, v8 */
/* move-object/from16 v0, v20 */
/* move/from16 v1, v21 */
/* move-object/from16 v2, v16 */
/* move/from16 v3, v22 */
java.lang.System .arraycopy ( v0,v1,v2,v8,v3 );
/* .line 348 */
int v10 = 0; // const/4 v10, 0x0
} // :goto_7
/* add-int/lit8 v21, v14, -0x1 */
/* move/from16 v0, v21 */
/* if-gt v10, v0, :cond_f */
/* .line 353 */
/* invoke-static/range {p4 ..p4}, Lorg/apache/commons/codec/digest/DigestUtils;->getDigest(Ljava/lang/String;)Ljava/security/MessageDigest; */
/* .line 360 */
/* and-int/lit8 v21, v10, 0x1 */
if ( v21 != null) { // if-eqz v21, :cond_d
/* .line 361 */
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
(( java.security.MessageDigest ) v9 ).update ( v13, v0, v11 ); // invoke-virtual {v9, v13, v0, v11}, Ljava/security/MessageDigest;->update([BII)V
/* .line 370 */
} // :goto_8
/* rem-int/lit8 v21, v10, 0x3 */
if ( v21 != null) { // if-eqz v21, :cond_b
/* .line 371 */
/* const/16 v21, 0x0 */
/* move-object/from16 v0, v16 */
/* move/from16 v1, v21 */
/* move/from16 v2, v18 */
(( java.security.MessageDigest ) v9 ).update ( v0, v1, v2 ); // invoke-virtual {v9, v0, v1, v2}, Ljava/security/MessageDigest;->update([BII)V
/* .line 378 */
} // :cond_b
/* rem-int/lit8 v21, v10, 0x7 */
if ( v21 != null) { // if-eqz v21, :cond_c
/* .line 379 */
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
(( java.security.MessageDigest ) v9 ).update ( v13, v0, v11 ); // invoke-virtual {v9, v13, v0, v11}, Ljava/security/MessageDigest;->update([BII)V
/* .line 387 */
} // :cond_c
/* and-int/lit8 v21, v10, 0x1 */
if ( v21 != null) { // if-eqz v21, :cond_e
/* .line 388 */
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
/* move/from16 v1, p3 */
(( java.security.MessageDigest ) v9 ).update ( v5, v0, v1 ); // invoke-virtual {v9, v5, v0, v1}, Ljava/security/MessageDigest;->update([BII)V
/* .line 397 */
} // :goto_9
(( java.security.MessageDigest ) v9 ).digest ( ); // invoke-virtual {v9}, Ljava/security/MessageDigest;->digest()[B
/* .line 348 */
/* add-int/lit8 v10, v10, 0x1 */
/* .line 363 */
} // :cond_d
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
/* move/from16 v1, p3 */
(( java.security.MessageDigest ) v9 ).update ( v5, v0, v1 ); // invoke-virtual {v9, v5, v0, v1}, Ljava/security/MessageDigest;->update([BII)V
/* .line 390 */
} // :cond_e
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
(( java.security.MessageDigest ) v9 ).update ( v13, v0, v11 ); // invoke-virtual {v9, v13, v0, v11}, Ljava/security/MessageDigest;->update([BII)V
/* .line 415 */
} // :cond_f
/* new-instance v6, Ljava/lang/StringBuilder; */
/* move-object/from16 v0, p2 */
/* invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 416 */
/* .local v6, "buffer":Ljava/lang/StringBuilder; */
if ( v15 != null) { // if-eqz v15, :cond_10
/* .line 417 */
final String v21 = "rounds="; // const-string v21, "rounds="
/* move-object/from16 v0, v21 */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 418 */
(( java.lang.StringBuilder ) v6 ).append ( v14 ); // invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 419 */
final String v21 = "$"; // const-string v21, "$"
/* move-object/from16 v0, v21 */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 421 */
} // :cond_10
/* move-object/from16 v0, v19 */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 422 */
final String v21 = "$"; // const-string v21, "$"
/* move-object/from16 v0, v21 */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 448 */
/* const/16 v21, 0x20 */
/* move/from16 v0, p3 */
/* move/from16 v1, v21 */
/* if-ne v0, v1, :cond_11 */
/* .line 449 */
/* const/16 v21, 0x0 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0xa */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x14 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 450 */
/* const/16 v21, 0x15 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x1 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0xb */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 451 */
/* const/16 v21, 0xc */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x16 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x2 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 452 */
/* const/16 v21, 0x3 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0xd */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x17 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 453 */
/* const/16 v21, 0x18 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x4 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0xe */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 454 */
/* const/16 v21, 0xf */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x19 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x5 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 455 */
/* const/16 v21, 0x6 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x10 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x1a */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 456 */
/* const/16 v21, 0x1b */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x7 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x11 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 457 */
/* const/16 v21, 0x12 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x1c */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x8 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 458 */
/* const/16 v21, 0x9 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x13 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x1d */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 459 */
/* const/16 v21, 0x0 */
/* const/16 v22, 0x1f */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x1e */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x3 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 490 */
} // :goto_a
/* const/16 v21, 0x0 */
/* invoke-static/range {v20 ..v21}, Ljava/util/Arrays;->fill([BB)V */
/* .line 491 */
/* const/16 v21, 0x0 */
/* move/from16 v0, v21 */
java.util.Arrays .fill ( v13,v0 );
/* .line 492 */
/* const/16 v21, 0x0 */
/* move-object/from16 v0, v16 */
/* move/from16 v1, v21 */
java.util.Arrays .fill ( v0,v1 );
/* .line 493 */
(( java.security.MessageDigest ) v9 ).reset ( ); // invoke-virtual {v9}, Ljava/security/MessageDigest;->reset()V
/* .line 494 */
(( java.security.MessageDigest ) v4 ).reset ( ); // invoke-virtual {v4}, Ljava/security/MessageDigest;->reset()V
/* .line 495 */
/* const/16 v21, 0x0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
java.util.Arrays .fill ( v0,v1 );
/* .line 496 */
/* const/16 v21, 0x0 */
/* move-object/from16 v0, v17 */
/* move/from16 v1, v21 */
java.util.Arrays .fill ( v0,v1 );
/* .line 498 */
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 461 */
} // :cond_11
/* const/16 v21, 0x0 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x15 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x2a */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 462 */
/* const/16 v21, 0x16 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x2b */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x1 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 463 */
/* const/16 v21, 0x2c */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x2 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x17 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 464 */
/* const/16 v21, 0x3 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x18 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x2d */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 465 */
/* const/16 v21, 0x19 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x2e */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x4 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 466 */
/* const/16 v21, 0x2f */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x5 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x1a */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 467 */
/* const/16 v21, 0x6 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x1b */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x30 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 468 */
/* const/16 v21, 0x1c */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x31 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x7 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 469 */
/* const/16 v21, 0x32 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x8 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x1d */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 470 */
/* const/16 v21, 0x9 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x1e */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x33 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 471 */
/* const/16 v21, 0x1f */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x34 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0xa */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 472 */
/* const/16 v21, 0x35 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0xb */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x20 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 473 */
/* const/16 v21, 0xc */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x21 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x36 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 474 */
/* const/16 v21, 0x22 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x37 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0xd */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 475 */
/* const/16 v21, 0x38 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0xe */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x23 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 476 */
/* const/16 v21, 0xf */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x24 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x39 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 477 */
/* const/16 v21, 0x25 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x3a */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x10 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 478 */
/* const/16 v21, 0x3b */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x11 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x26 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 479 */
/* const/16 v21, 0x12 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x27 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x3c */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 480 */
/* const/16 v21, 0x28 */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x3d */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x13 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 481 */
/* const/16 v21, 0x3e */
/* aget-byte v21, v5, v21 */
/* const/16 v22, 0x14 */
/* aget-byte v22, v5, v22 */
/* const/16 v23, 0x29 */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x4 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* .line 482 */
/* const/16 v21, 0x0 */
/* const/16 v22, 0x0 */
/* const/16 v23, 0x3f */
/* aget-byte v23, v5, v23 */
/* const/16 v24, 0x2 */
/* move/from16 v0, v21 */
/* move/from16 v1, v22 */
/* move/from16 v2, v23 */
/* move/from16 v3, v24 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v0,v1,v2,v3,v6 );
/* goto/16 :goto_a */
} // .end method
public static java.lang.String sha512Crypt ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "keyBytes" # [B */
/* .prologue */
/* .line 510 */
int v0 = 0; // const/4 v0, 0x0
org.apache.commons.codec.digest.Sha2Crypt .sha512Crypt ( p0,v0 );
} // .end method
public static java.lang.String sha512Crypt ( Object[] p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p0, "keyBytes" # [B */
/* .param p1, "salt" # Ljava/lang/String; */
/* .prologue */
/* .line 524 */
/* if-nez p1, :cond_0 */
/* .line 525 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "$6$"; // const-string v1, "$6$"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x8 */
org.apache.commons.codec.digest.B64 .getRandomSalt ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 527 */
} // :cond_0
final String v0 = "$6$"; // const-string v0, "$6$"
/* const/16 v1, 0x40 */
final String v2 = "SHA-512"; // const-string v2, "SHA-512"
org.apache.commons.codec.digest.Sha2Crypt .sha2Crypt ( p0,p1,v0,v1,v2 );
} // .end method
