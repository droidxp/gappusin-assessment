public class org.apache.commons.codec.digest.Md5Crypt {
	 /* .source "Md5Crypt.java" */
	 /* # static fields */
	 static final java.lang.String APR1_PREFIX;
	 private static final Integer BLOCKSIZE;
	 static final java.lang.String MD5_PREFIX;
	 private static final Integer ROUNDS;
	 /* # direct methods */
	 public org.apache.commons.codec.digest.Md5Crypt ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String apr1Crypt ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "keyBytes" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 95 */
		 v0 = org.apache.commons.codec.Charsets.UTF_8;
		 (( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
		 org.apache.commons.codec.digest.Md5Crypt .apr1Crypt ( v0 );
	 } // .end method
	 public static java.lang.String apr1Crypt ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "keyBytes" # Ljava/lang/String; */
		 /* .param p1, "salt" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 116 */
		 v0 = org.apache.commons.codec.Charsets.UTF_8;
		 (( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
		 org.apache.commons.codec.digest.Md5Crypt .apr1Crypt ( v0,p1 );
	 } // .end method
	 public static java.lang.String apr1Crypt ( Object[] p0 ) {
		 /* .locals 2 */
		 /* .param p0, "keyBytes" # [B */
		 /* .prologue */
		 /* .line 69 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "$apr1$"; // const-string v1, "$apr1$"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* const/16 v1, 0x8 */
		 org.apache.commons.codec.digest.B64 .getRandomSalt ( v1 );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 org.apache.commons.codec.digest.Md5Crypt .apr1Crypt ( p0,v0 );
	 } // .end method
	 public static java.lang.String apr1Crypt ( Object[] p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .param p0, "keyBytes" # [B */
		 /* .param p1, "salt" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 82 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 final String v0 = "$apr1$"; // const-string v0, "$apr1$"
			 v0 = 			 (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
			 /* if-nez v0, :cond_0 */
			 /* .line 83 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "$apr1$"; // const-string v1, "$apr1$"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 85 */
		 } // :cond_0
		 final String v0 = "$apr1$"; // const-string v0, "$apr1$"
		 org.apache.commons.codec.digest.Md5Crypt .md5Crypt ( p0,p1,v0 );
	 } // .end method
	 public static java.lang.String md5Crypt ( Object[] p0 ) {
		 /* .locals 2 */
		 /* .param p0, "keyBytes" # [B */
		 /* .prologue */
		 /* .line 128 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "$1$"; // const-string v1, "$1$"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* const/16 v1, 0x8 */
		 org.apache.commons.codec.digest.B64 .getRandomSalt ( v1 );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 org.apache.commons.codec.digest.Md5Crypt .md5Crypt ( p0,v0 );
	 } // .end method
	 public static java.lang.String md5Crypt ( Object[] p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "keyBytes" # [B */
		 /* .param p1, "salt" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 148 */
		 final String v0 = "$1$"; // const-string v0, "$1$"
		 org.apache.commons.codec.digest.Md5Crypt .md5Crypt ( p0,p1,v0 );
	 } // .end method
	 public static java.lang.String md5Crypt ( Object[] p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 17 */
		 /* .param p0, "keyBytes" # [B */
		 /* .param p1, "salt" # Ljava/lang/String; */
		 /* .param p2, "prefix" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 162 */
		 /* move-object/from16 v0, p0 */
		 /* array-length v7, v0 */
		 /* .line 166 */
		 /* .local v7, "keyLen":I */
		 /* if-nez p1, :cond_0 */
		 /* .line 167 */
		 /* const/16 v13, 0x8 */
		 org.apache.commons.codec.digest.B64 .getRandomSalt ( v13 );
		 /* .line 176 */
		 /* .local v12, "saltString":Ljava/lang/String; */
	 } // :goto_0
	 v13 = org.apache.commons.codec.Charsets.UTF_8;
	 (( java.lang.String ) v12 ).getBytes ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
	 /* .line 178 */
	 /* .local v11, "saltBytes":[B */
	 org.apache.commons.codec.digest.DigestUtils .getMd5Digest ( );
	 /* .line 183 */
	 /* .local v1, "ctx":Ljava/security/MessageDigest; */
	 /* move-object/from16 v0, p0 */
	 (( java.security.MessageDigest ) v1 ).update ( v0 ); // invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V
	 /* .line 188 */
	 v13 = org.apache.commons.codec.Charsets.UTF_8;
	 /* move-object/from16 v0, p2 */
	 (( java.lang.String ) v0 ).getBytes ( v13 ); // invoke-virtual {v0, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
	 (( java.security.MessageDigest ) v1 ).update ( v13 ); // invoke-virtual {v1, v13}, Ljava/security/MessageDigest;->update([B)V
	 /* .line 193 */
	 (( java.security.MessageDigest ) v1 ).update ( v11 ); // invoke-virtual {v1, v11}, Ljava/security/MessageDigest;->update([B)V
	 /* .line 198 */
	 org.apache.commons.codec.digest.DigestUtils .getMd5Digest ( );
	 /* .line 199 */
	 /* .local v2, "ctx1":Ljava/security/MessageDigest; */
	 /* move-object/from16 v0, p0 */
	 (( java.security.MessageDigest ) v2 ).update ( v0 ); // invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V
	 /* .line 200 */
	 (( java.security.MessageDigest ) v2 ).update ( v11 ); // invoke-virtual {v2, v11}, Ljava/security/MessageDigest;->update([B)V
	 /* .line 201 */
	 /* move-object/from16 v0, p0 */
	 (( java.security.MessageDigest ) v2 ).update ( v0 ); // invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V
	 /* .line 202 */
	 (( java.security.MessageDigest ) v2 ).digest ( ); // invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
	 /* .line 203 */
	 /* .local v3, "finalb":[B */
	 /* move v5, v7 */
	 /* .line 204 */
	 /* .local v5, "ii":I */
} // :goto_1
/* if-lez v5, :cond_4 */
/* .line 205 */
int v14 = 0; // const/4 v14, 0x0
/* const/16 v13, 0x10 */
/* if-le v5, v13, :cond_3 */
/* const/16 v13, 0x10 */
} // :goto_2
(( java.security.MessageDigest ) v1 ).update ( v3, v14, v13 ); // invoke-virtual {v1, v3, v14, v13}, Ljava/security/MessageDigest;->update([BII)V
/* .line 206 */
/* add-int/lit8 v5, v5, -0x10 */
/* .line 169 */
} // .end local v1 # "ctx":Ljava/security/MessageDigest;
} // .end local v2 # "ctx1":Ljava/security/MessageDigest;
} // .end local v3 # "finalb":[B
} // .end local v5 # "ii":I
} // .end local v11 # "saltBytes":[B
} // .end local v12 # "saltString":Ljava/lang/String;
} // :cond_0
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
final String v14 = "^"; // const-string v14, "^"
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v14 = "$"; // const-string v14, "$"
final String v15 = "\\$"; // const-string v15, "\\$"
/* move-object/from16 v0, p2 */
(( java.lang.String ) v0 ).replace ( v14, v15 ); // invoke-virtual {v0, v14, v15}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v14 = "([\\.\\/a-zA-Z0-9]{1,8}).*"; // const-string v14, "([\\.\\/a-zA-Z0-9]{1,8}).*"
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
java.util.regex.Pattern .compile ( v13 );
/* .line 170 */
/* .local v9, "p":Ljava/util/regex/Pattern; */
/* move-object/from16 v0, p1 */
(( java.util.regex.Pattern ) v9 ).matcher ( v0 ); // invoke-virtual {v9, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/* .line 171 */
/* .local v8, "m":Ljava/util/regex/Matcher; */
if ( v8 != null) { // if-eqz v8, :cond_1
v13 = (( java.util.regex.Matcher ) v8 ).find ( ); // invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z
/* if-nez v13, :cond_2 */
/* .line 172 */
} // :cond_1
/* new-instance v13, Ljava/lang/IllegalArgumentException; */
/* new-instance v14, Ljava/lang/StringBuilder; */
/* invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V */
final String v15 = "Invalid salt value: "; // const-string v15, "Invalid salt value: "
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v14 ).append ( v0 ); // invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v13, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v13 */
/* .line 174 */
} // :cond_2
int v13 = 1; // const/4 v13, 0x1
(( java.util.regex.Matcher ) v8 ).group ( v13 ); // invoke-virtual {v8, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
/* .restart local v12 # "saltString":Ljava/lang/String; */
/* goto/16 :goto_0 */
} // .end local v8 # "m":Ljava/util/regex/Matcher;
} // .end local v9 # "p":Ljava/util/regex/Pattern;
/* .restart local v1 # "ctx":Ljava/security/MessageDigest; */
/* .restart local v2 # "ctx1":Ljava/security/MessageDigest; */
/* .restart local v3 # "finalb":[B */
/* .restart local v5 # "ii":I */
/* .restart local v11 # "saltBytes":[B */
} // :cond_3
/* move v13, v5 */
/* .line 205 */
/* .line 212 */
} // :cond_4
int v13 = 0; // const/4 v13, 0x0
java.util.Arrays .fill ( v3,v13 );
/* .line 217 */
/* move v5, v7 */
/* .line 218 */
int v6 = 0; // const/4 v6, 0x0
/* .line 219 */
/* .local v6, "j":I */
} // :goto_3
/* if-lez v5, :cond_6 */
/* .line 220 */
/* and-int/lit8 v13, v5, 0x1 */
int v14 = 1; // const/4 v14, 0x1
/* if-ne v13, v14, :cond_5 */
/* .line 221 */
int v13 = 0; // const/4 v13, 0x0
/* aget-byte v13, v3, v13 */
(( java.security.MessageDigest ) v1 ).update ( v13 ); // invoke-virtual {v1, v13}, Ljava/security/MessageDigest;->update(B)V
/* .line 225 */
} // :goto_4
/* shr-int/lit8 v5, v5, 0x1 */
/* .line 223 */
} // :cond_5
int v13 = 0; // const/4 v13, 0x0
/* aget-byte v13, p0, v13 */
(( java.security.MessageDigest ) v1 ).update ( v13 ); // invoke-virtual {v1, v13}, Ljava/security/MessageDigest;->update(B)V
/* .line 231 */
} // :cond_6
/* new-instance v10, Ljava/lang/StringBuilder; */
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
/* move-object/from16 v0, p2 */
(( java.lang.StringBuilder ) v13 ).append ( v0 ); // invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).append ( v12 ); // invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v14 = "$"; // const-string v14, "$"
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 232 */
/* .local v10, "passwd":Ljava/lang/StringBuilder; */
(( java.security.MessageDigest ) v1 ).digest ( ); // invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
/* .line 238 */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i":I */
} // :goto_5
/* const/16 v13, 0x3e8 */
/* if-ge v4, v13, :cond_b */
/* .line 239 */
org.apache.commons.codec.digest.DigestUtils .getMd5Digest ( );
/* .line 240 */
/* and-int/lit8 v13, v4, 0x1 */
if ( v13 != null) { // if-eqz v13, :cond_9
/* .line 241 */
/* move-object/from16 v0, p0 */
(( java.security.MessageDigest ) v2 ).update ( v0 ); // invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 246 */
} // :goto_6
/* rem-int/lit8 v13, v4, 0x3 */
if ( v13 != null) { // if-eqz v13, :cond_7
/* .line 247 */
(( java.security.MessageDigest ) v2 ).update ( v11 ); // invoke-virtual {v2, v11}, Ljava/security/MessageDigest;->update([B)V
/* .line 250 */
} // :cond_7
/* rem-int/lit8 v13, v4, 0x7 */
if ( v13 != null) { // if-eqz v13, :cond_8
/* .line 251 */
/* move-object/from16 v0, p0 */
(( java.security.MessageDigest ) v2 ).update ( v0 ); // invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 254 */
} // :cond_8
/* and-int/lit8 v13, v4, 0x1 */
if ( v13 != null) { // if-eqz v13, :cond_a
/* .line 255 */
int v13 = 0; // const/4 v13, 0x0
/* const/16 v14, 0x10 */
(( java.security.MessageDigest ) v2 ).update ( v3, v13, v14 ); // invoke-virtual {v2, v3, v13, v14}, Ljava/security/MessageDigest;->update([BII)V
/* .line 259 */
} // :goto_7
(( java.security.MessageDigest ) v2 ).digest ( ); // invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
/* .line 238 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 243 */
} // :cond_9
int v13 = 0; // const/4 v13, 0x0
/* const/16 v14, 0x10 */
(( java.security.MessageDigest ) v2 ).update ( v3, v13, v14 ); // invoke-virtual {v2, v3, v13, v14}, Ljava/security/MessageDigest;->update([BII)V
/* .line 257 */
} // :cond_a
/* move-object/from16 v0, p0 */
(( java.security.MessageDigest ) v2 ).update ( v0 ); // invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 265 */
} // :cond_b
int v13 = 0; // const/4 v13, 0x0
/* aget-byte v13, v3, v13 */
int v14 = 6; // const/4 v14, 0x6
/* aget-byte v14, v3, v14 */
/* const/16 v15, 0xc */
/* aget-byte v15, v3, v15 */
/* const/16 v16, 0x4 */
/* move/from16 v0, v16 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v13,v14,v15,v0,v10 );
/* .line 266 */
int v13 = 1; // const/4 v13, 0x1
/* aget-byte v13, v3, v13 */
int v14 = 7; // const/4 v14, 0x7
/* aget-byte v14, v3, v14 */
/* const/16 v15, 0xd */
/* aget-byte v15, v3, v15 */
/* const/16 v16, 0x4 */
/* move/from16 v0, v16 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v13,v14,v15,v0,v10 );
/* .line 267 */
int v13 = 2; // const/4 v13, 0x2
/* aget-byte v13, v3, v13 */
/* const/16 v14, 0x8 */
/* aget-byte v14, v3, v14 */
/* const/16 v15, 0xe */
/* aget-byte v15, v3, v15 */
/* const/16 v16, 0x4 */
/* move/from16 v0, v16 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v13,v14,v15,v0,v10 );
/* .line 268 */
int v13 = 3; // const/4 v13, 0x3
/* aget-byte v13, v3, v13 */
/* const/16 v14, 0x9 */
/* aget-byte v14, v3, v14 */
/* const/16 v15, 0xf */
/* aget-byte v15, v3, v15 */
/* const/16 v16, 0x4 */
/* move/from16 v0, v16 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v13,v14,v15,v0,v10 );
/* .line 269 */
int v13 = 4; // const/4 v13, 0x4
/* aget-byte v13, v3, v13 */
/* const/16 v14, 0xa */
/* aget-byte v14, v3, v14 */
int v15 = 5; // const/4 v15, 0x5
/* aget-byte v15, v3, v15 */
/* const/16 v16, 0x4 */
/* move/from16 v0, v16 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v13,v14,v15,v0,v10 );
/* .line 270 */
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
/* const/16 v15, 0xb */
/* aget-byte v15, v3, v15 */
/* const/16 v16, 0x2 */
/* move/from16 v0, v16 */
org.apache.commons.codec.digest.B64 .b64from24bit ( v13,v14,v15,v0,v10 );
/* .line 276 */
(( java.security.MessageDigest ) v1 ).reset ( ); // invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V
/* .line 277 */
(( java.security.MessageDigest ) v2 ).reset ( ); // invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V
/* .line 278 */
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p0 */
java.util.Arrays .fill ( v0,v13 );
/* .line 279 */
int v13 = 0; // const/4 v13, 0x0
java.util.Arrays .fill ( v11,v13 );
/* .line 280 */
int v13 = 0; // const/4 v13, 0x0
java.util.Arrays .fill ( v3,v13 );
/* .line 282 */
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
