public class com.nobleempire.GunDisassembly2.Security {
	 /* .source "Security.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String KEY_FACTORY_ALGORITHM;
private static final java.security.SecureRandom RANDOM;
private static final java.lang.String SIGNATURE_ALGORITHM;
private static final java.lang.String TAG;
private static java.util.HashSet sKnownNonces;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashSet", */
/* "<", */
/* "Ljava/lang/Long;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.nobleempire.GunDisassembly2.Security ( ) {
/* .locals 1 */
/* .prologue */
/* .line 36 */
/* new-instance v0, Ljava/security/SecureRandom; */
/* invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V */
/* .line 40 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 32 */
return;
} // .end method
public com.nobleempire.GunDisassembly2.Security ( ) {
/* .locals 0 */
/* .prologue */
/* .line 32 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static Long generateNonce ( ) {
/* .locals 4 */
/* .prologue */
/* .line 61 */
v2 = com.nobleempire.GunDisassembly2.Security.RANDOM;
(( java.security.SecureRandom ) v2 ).nextLong ( ); // invoke-virtual {v2}, Ljava/security/SecureRandom;->nextLong()J
/* move-result-wide v0 */
/* .line 62 */
/* .local v0, "nonce":J */
v2 = com.nobleempire.GunDisassembly2.Security.sKnownNonces;
java.lang.Long .valueOf ( v0,v1 );
(( java.util.HashSet ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* .line 63 */
/* return-wide v0 */
} // .end method
public static java.security.PublicKey generatePublicKey ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "encodedPublicKey" # Ljava/lang/String; */
/* .prologue */
/* .line 153 */
try { // :try_start_0
com.nobleempire.GunDisassembly2.util.Base64 .decode ( p0 );
/* .line 154 */
/* .local v0, "decodedKey":[B */
final String v3 = "RSA"; // const-string v3, "RSA"
java.security.KeyFactory .getInstance ( v3 );
/* .line 155 */
/* .local v2, "keyFactory":Ljava/security/KeyFactory; */
/* new-instance v3, Ljava/security/spec/X509EncodedKeySpec; */
/* invoke-direct {v3, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V */
(( java.security.KeyFactory ) v2 ).generatePublic ( v3 ); // invoke-virtual {v2, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 156 */
} // .end local v0 # "decodedKey":[B
} // .end local v2 # "keyFactory":Ljava/security/KeyFactory;
/* :catch_0 */
/* move-exception v1 */
/* .line 157 */
/* .local v1, "e":Ljava/security/NoSuchAlgorithmException; */
/* new-instance v3, Ljava/lang/RuntimeException; */
/* invoke-direct {v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v3 */
/* .line 158 */
} // .end local v1 # "e":Ljava/security/NoSuchAlgorithmException;
/* :catch_1 */
/* move-exception v1 */
/* .line 159 */
/* .local v1, "e":Ljava/security/spec/InvalidKeySpecException; */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v4 = "~~Invalid key specification."; // const-string v4, "~~Invalid key specification."
android.util.Log .e ( v3,v4 );
/* .line 160 */
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
/* throw v3 */
/* .line 161 */
} // .end local v1 # "e":Ljava/security/spec/InvalidKeySpecException;
/* :catch_2 */
/* move-exception v1 */
/* .line 162 */
/* .local v1, "e":Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v4 = "~~Base64 decoding failed."; // const-string v4, "~~Base64 decoding failed."
android.util.Log .e ( v3,v4 );
/* .line 163 */
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
/* throw v3 */
} // .end method
public static Boolean isNonceKnown ( Long p0 ) {
/* .locals 2 */
/* .param p0, "nonce" # J */
/* .prologue */
/* .line 71 */
v0 = com.nobleempire.GunDisassembly2.Security.sKnownNonces;
java.lang.Long .valueOf ( p0,p1 );
v0 = (( java.util.HashSet ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
} // .end method
public static void removeNonce ( Long p0 ) {
/* .locals 2 */
/* .param p0, "nonce" # J */
/* .prologue */
/* .line 67 */
v0 = com.nobleempire.GunDisassembly2.Security.sKnownNonces;
java.lang.Long .valueOf ( p0,p1 );
(( java.util.HashSet ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
/* .line 68 */
return;
} // .end method
public static Boolean verify ( java.security.PublicKey p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 5 */
/* .param p0, "publicKey" # Ljava/security/PublicKey; */
/* .param p1, "signedData" # Ljava/lang/String; */
/* .param p2, "signature" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 176 */
try { // :try_start_0
final String v3 = "SHA1withRSA"; // const-string v3, "SHA1withRSA"
java.security.Signature .getInstance ( v3 );
/* .line 177 */
/* .local v1, "sig":Ljava/security/Signature; */
(( java.security.Signature ) v1 ).initVerify ( p0 ); // invoke-virtual {v1, p0}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
/* .line 178 */
(( java.lang.String ) p1 ).getBytes ( ); // invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
(( java.security.Signature ) v1 ).update ( v3 ); // invoke-virtual {v1, v3}, Ljava/security/Signature;->update([B)V
/* .line 179 */
com.nobleempire.GunDisassembly2.util.Base64 .decode ( p2 );
v3 = (( java.security.Signature ) v1 ).verify ( v3 ); // invoke-virtual {v1, v3}, Ljava/security/Signature;->verify([B)Z
/* if-nez v3, :cond_0 */
/* .line 180 */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v4 = "~~Signature verification failed."; // const-string v4, "~~Signature verification failed."
android.util.Log .e ( v3,v4 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/security/InvalidKeyException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/security/SignatureException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .line 189 */
} // .end local v1 # "sig":Ljava/security/Signature;
} // :goto_0
/* .line 183 */
/* .restart local v1 # "sig":Ljava/security/Signature; */
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
/* .line 184 */
} // .end local v1 # "sig":Ljava/security/Signature;
/* :catch_0 */
/* move-exception v0 */
/* .local v0, "e":Ljava/security/NoSuchAlgorithmException; */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v4 = "~~NoSuchAlgorithmException."; // const-string v4, "~~NoSuchAlgorithmException."
android.util.Log .e ( v3,v4 );
/* .line 185 */
} // .end local v0 # "e":Ljava/security/NoSuchAlgorithmException;
/* :catch_1 */
/* move-exception v0 */
/* .local v0, "e":Ljava/security/InvalidKeyException; */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v4 = "~~Invalid key specification."; // const-string v4, "~~Invalid key specification."
android.util.Log .e ( v3,v4 );
/* .line 186 */
} // .end local v0 # "e":Ljava/security/InvalidKeyException;
/* :catch_2 */
/* move-exception v0 */
/* .local v0, "e":Ljava/security/SignatureException; */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v4 = "~~Signature exception."; // const-string v4, "~~Signature exception."
android.util.Log .e ( v3,v4 );
/* .line 187 */
} // .end local v0 # "e":Ljava/security/SignatureException;
/* :catch_3 */
/* move-exception v0 */
/* .local v0, "e":Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v4 = "~~Base64 decoding failed."; // const-string v4, "~~Base64 decoding failed."
android.util.Log .e ( v3,v4 );
} // .end method
public static java.util.ArrayList verifyPurchase ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 27 */
/* .param p0, "signedData" # Ljava/lang/String; */
/* .param p1, "signature" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 80 */
/* if-nez p0, :cond_0 */
/* .line 81 */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v25 = "~~data is null"; // const-string v25, "~~data is null"
/* move-object/from16 v0, v25 */
android.util.Log .e ( v3,v0 );
/* .line 82 */
/* const/16 v22, 0x0 */
/* .line 145 */
} // :goto_0
/* .line 85 */
} // :cond_0
/* const/16 v24, 0x0 */
/* .line 86 */
/* .local v24, "verified":Z */
v3 = /* invoke-static/range {p1 ..p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z */
/* if-nez v3, :cond_1 */
/* .line 92 */
final String v11 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0czkvDYsL4DRHF2Sr1n/aEyHTc6VOhyGkZJw909Niu+1uKmSl2HlBmU4fwnRGNwxjhsMOwc4/TA4l+5XLPcW//jEzsdh0QO+JvJV86kSGJByZvY890gHR4NYitJqE1Zdcqkyk612tWsZz6eSct5M2VY0QWXjJqUvCfzIXHBPAizJjS6HC/voaThKtVm45hM4K3cGoHwGC1bGipQRVVgz176phXGdxT8VFuBHl2z//ns+itMJZmRqMjly416C3qG8G3uspHTVunygEq7W019KVsZsRe7Adq5JRIyF80oEofp5DyRHSBWIzS7YBVxlQ5Cf3Ihzcwyo3E3lSSAtAXfkOwIDAQAB"; // const-string v11, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0czkvDYsL4DRHF2Sr1n/aEyHTc6VOhyGkZJw909Niu+1uKmSl2HlBmU4fwnRGNwxjhsMOwc4/TA4l+5XLPcW//jEzsdh0QO+JvJV86kSGJByZvY890gHR4NYitJqE1Zdcqkyk612tWsZz6eSct5M2VY0QWXjJqUvCfzIXHBPAizJjS6HC/voaThKtVm45hM4K3cGoHwGC1bGipQRVVgz176phXGdxT8VFuBHl2z//ns+itMJZmRqMjly416C3qG8G3uspHTVunygEq7W019KVsZsRe7Adq5JRIyF80oEofp5DyRHSBWIzS7YBVxlQ5Cf3Ihzcwyo3E3lSSAtAXfkOwIDAQAB"
/* .line 93 */
/* .local v11, "base64EncodedPublicKey":Ljava/lang/String; */
com.nobleempire.GunDisassembly2.Security .generatePublicKey ( v11 );
/* .line 94 */
/* .local v17, "key":Ljava/security/PublicKey; */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
v24 = com.nobleempire.GunDisassembly2.Security .verify ( v0,v1,v2 );
/* .line 95 */
/* if-nez v24, :cond_1 */
/* .line 96 */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v25 = "~~signature does not match data."; // const-string v25, "~~signature does not match data."
/* move-object/from16 v0, v25 */
android.util.Log .w ( v3,v0 );
/* .line 97 */
/* const/16 v22, 0x0 */
/* .line 101 */
} // .end local v11 # "base64EncodedPublicKey":Ljava/lang/String;
} // .end local v17 # "key":Ljava/security/PublicKey;
} // :cond_1
/* const/16 v16, 0x0 */
/* .line 102 */
/* .local v16, "jTransactionsArray":Lorg/json/JSONArray; */
/* const/16 v20, 0x0 */
/* .line 103 */
/* .local v20, "numTransactions":I */
/* const-wide/16 v18, 0x0 */
/* .line 105 */
/* .local v18, "nonce":J */
try { // :try_start_0
/* new-instance v15, Lorg/json/JSONObject; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v15, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 107 */
/* .local v15, "jObject":Lorg/json/JSONObject; */
final String v3 = "nonce"; // const-string v3, "nonce"
(( org.json.JSONObject ) v15 ).optLong ( v3 ); // invoke-virtual {v15, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J
/* move-result-wide v18 */
/* .line 108 */
final String v3 = "orders"; // const-string v3, "orders"
(( org.json.JSONObject ) v15 ).optJSONArray ( v3 ); // invoke-virtual {v15, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 109 */
if ( v16 != null) { // if-eqz v16, :cond_2
/* .line 110 */
/* invoke-virtual/range {v16 ..v16}, Lorg/json/JSONArray;->length()I */
/* :try_end_0 */
v20 = /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 115 */
} // :cond_2
v3 = /* invoke-static/range {v18 ..v19}, Lcom/nobleempire/GunDisassembly2/Security;->isNonceKnown(J)Z */
/* if-nez v3, :cond_3 */
/* .line 116 */
final String v3 = "Security.java"; // const-string v3, "Security.java"
/* new-instance v25, Ljava/lang/StringBuilder; */
final String v26 = "~~Nonce not found: "; // const-string v26, "~~Nonce not found: "
/* invoke-direct/range {v25 ..v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v25 */
/* move-wide/from16 v1, v18 */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* move-object/from16 v0, v25 */
android.util.Log .w ( v3,v0 );
/* .line 117 */
/* const/16 v22, 0x0 */
/* .line 112 */
} // .end local v15 # "jObject":Lorg/json/JSONObject;
/* :catch_0 */
/* move-exception v12 */
/* .line 113 */
/* .local v12, "e":Lorg/json/JSONException; */
/* const/16 v22, 0x0 */
/* .line 119 */
} // .end local v12 # "e":Lorg/json/JSONException;
/* .restart local v15 # "jObject":Lorg/json/JSONObject; */
} // :cond_3
/* new-instance v22, Ljava/util/ArrayList; */
/* invoke-direct/range {v22 ..v22}, Ljava/util/ArrayList;-><init>()V */
/* .line 121 */
/* .local v22, "purchases":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase;>;" */
int v13 = 0; // const/4 v13, 0x0
/* .local v13, "i":I */
} // :goto_1
/* move/from16 v0, v20 */
/* if-lt v13, v0, :cond_4 */
/* .line 144 */
/* invoke-static/range {v18 ..v19}, Lcom/nobleempire/GunDisassembly2/Security;->removeNonce(J)V */
/* .line 122 */
} // :cond_4
try { // :try_start_1
/* move-object/from16 v0, v16 */
(( org.json.JSONArray ) v0 ).getJSONObject ( v13 ); // invoke-virtual {v0, v13}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
/* .line 123 */
/* .local v14, "jElement":Lorg/json/JSONObject; */
final String v3 = "purchaseState"; // const-string v3, "purchaseState"
v23 = (( org.json.JSONObject ) v14 ).getInt ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
/* .line 124 */
/* .local v23, "response":I */
/* invoke-static/range {v23 ..v23}, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;->valueOf(I)Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
/* .line 125 */
/* .local v4, "purchaseState":Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
final String v3 = "productId"; // const-string v3, "productId"
(( org.json.JSONObject ) v14 ).getString ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 126 */
/* .local v6, "productId":Ljava/lang/String; */
final String v3 = "packageName"; // const-string v3, "packageName"
(( org.json.JSONObject ) v14 ).getString ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 127 */
/* .local v21, "packageName":Ljava/lang/String; */
final String v3 = "purchaseTime"; // const-string v3, "purchaseTime"
(( org.json.JSONObject ) v14 ).getLong ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v8 */
/* .line 128 */
/* .local v8, "purchaseTime":J */
final String v3 = "orderId"; // const-string v3, "orderId"
final String v25 = ""; // const-string v25, ""
/* move-object/from16 v0, v25 */
(( org.json.JSONObject ) v14 ).optString ( v3, v0 ); // invoke-virtual {v14, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 129 */
/* .local v7, "orderId":Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
/* .line 130 */
/* .local v5, "notifyId":Ljava/lang/String; */
final String v3 = "notificationId"; // const-string v3, "notificationId"
v3 = (( org.json.JSONObject ) v14 ).has ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 131 */
final String v3 = "notificationId"; // const-string v3, "notificationId"
(( org.json.JSONObject ) v14 ).getString ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 133 */
} // :cond_5
final String v3 = "developerPayload"; // const-string v3, "developerPayload"
/* const/16 v25, 0x0 */
/* move-object/from16 v0, v25 */
(( org.json.JSONObject ) v14 ).optString ( v3, v0 ); // invoke-virtual {v14, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 135 */
/* .local v10, "developerPayload":Ljava/lang/String; */
v3 = com.nobleempire.GunDisassembly2.Consts$PurchaseState.PURCHASED;
/* if-ne v4, v3, :cond_6 */
/* if-nez v24, :cond_6 */
/* .line 121 */
} // :goto_2
/* add-int/lit8 v13, v13, 0x1 */
/* .line 138 */
} // :cond_6
/* new-instance v3, Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase; */
/* invoke-direct/range {v3 ..v10}, Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase;-><init>(Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V */
/* move-object/from16 v0, v22 */
(( java.util.ArrayList ) v0 ).add ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 140 */
} // .end local v4 # "purchaseState":Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;
} // .end local v5 # "notifyId":Ljava/lang/String;
} // .end local v6 # "productId":Ljava/lang/String;
} // .end local v7 # "orderId":Ljava/lang/String;
} // .end local v8 # "purchaseTime":J
} // .end local v10 # "developerPayload":Ljava/lang/String;
} // .end local v14 # "jElement":Lorg/json/JSONObject;
} // .end local v21 # "packageName":Ljava/lang/String;
} // .end local v23 # "response":I
/* :catch_1 */
/* move-exception v12 */
/* .line 141 */
/* .restart local v12 # "e":Lorg/json/JSONException; */
final String v3 = "Security.java"; // const-string v3, "Security.java"
final String v25 = "~~JSON exception: "; // const-string v25, "~~JSON exception: "
/* move-object/from16 v0, v25 */
android.util.Log .e ( v3,v0,v12 );
/* .line 142 */
/* const/16 v22, 0x0 */
/* goto/16 :goto_0 */
} // .end method
