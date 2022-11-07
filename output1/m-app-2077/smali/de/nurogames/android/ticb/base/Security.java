public class de.nurogames.android.ticb.base.Security {
	 /* .source "Security.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/Security$VerifiedPurchase; */
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
static de.nurogames.android.ticb.base.Security ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
/* new-instance v0, Ljava/security/SecureRandom; */
/* invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V */
/* .line 53 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
return;
} // .end method
public de.nurogames.android.ticb.base.Security ( ) {
/* .locals 0 */
/* .prologue */
/* .line 37 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static Long generateNonce ( ) {
/* .locals 4 */
/* .prologue */
/* .line 79 */
v2 = de.nurogames.android.ticb.base.Security.RANDOM;
(( java.security.SecureRandom ) v2 ).nextLong ( ); // invoke-virtual {v2}, Ljava/security/SecureRandom;->nextLong()J
/* move-result-wide v0 */
/* .line 80 */
/* .local v0, "nonce":J */
v2 = de.nurogames.android.ticb.base.Security.sKnownNonces;
java.lang.Long .valueOf ( v0,v1 );
(( java.util.HashSet ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* .line 81 */
/* return-wide v0 */
} // .end method
public static java.security.PublicKey generatePublicKey ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "encodedPublicKey" # Ljava/lang/String; */
/* .prologue */
/* .line 199 */
try { // :try_start_0
de.nurogames.android.ticb.base.core.Base64 .decode ( p0 );
/* .line 200 */
/* .local v0, "decodedKey":[B */
final String v3 = "RSA"; // const-string v3, "RSA"
java.security.KeyFactory .getInstance ( v3 );
/* .line 201 */
/* .local v2, "keyFactory":Ljava/security/KeyFactory; */
/* new-instance v3, Ljava/security/spec/X509EncodedKeySpec; */
/* invoke-direct {v3, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V */
(( java.security.KeyFactory ) v2 ).generatePublic ( v3 ); // invoke-virtual {v2, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lde/nurogames/android/ticb/base/core/Base64DecoderException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 202 */
} // .end local v0 # "decodedKey":[B
} // .end local v2 # "keyFactory":Ljava/security/KeyFactory;
/* :catch_0 */
/* move-exception v1 */
/* .line 203 */
/* .local v1, "e":Ljava/security/NoSuchAlgorithmException; */
/* new-instance v3, Ljava/lang/RuntimeException; */
/* invoke-direct {v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v3 */
/* .line 204 */
} // .end local v1 # "e":Ljava/security/NoSuchAlgorithmException;
/* :catch_1 */
/* move-exception v1 */
/* .line 205 */
/* .local v1, "e":Ljava/security/spec/InvalidKeySpecException; */
final String v3 = "Security"; // const-string v3, "Security"
final String v4 = "Invalid key specification."; // const-string v4, "Invalid key specification."
android.util.Log .e ( v3,v4 );
/* .line 206 */
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
/* throw v3 */
/* .line 207 */
} // .end local v1 # "e":Ljava/security/spec/InvalidKeySpecException;
/* :catch_2 */
/* move-exception v1 */
/* .line 208 */
/* .local v1, "e":Lde/nurogames/android/ticb/base/core/Base64DecoderException; */
final String v3 = "Security"; // const-string v3, "Security"
final String v4 = "Base64 decoding failed."; // const-string v4, "Base64 decoding failed."
android.util.Log .e ( v3,v4 );
/* .line 209 */
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
/* throw v3 */
} // .end method
public static Boolean isNonceKnown ( Long p0 ) {
/* .locals 2 */
/* .param p0, "nonce" # J */
/* .prologue */
/* .line 89 */
v0 = de.nurogames.android.ticb.base.Security.sKnownNonces;
java.lang.Long .valueOf ( p0,p1 );
v0 = (( java.util.HashSet ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
} // .end method
public static void removeNonce ( Long p0 ) {
/* .locals 2 */
/* .param p0, "nonce" # J */
/* .prologue */
/* .line 85 */
v0 = de.nurogames.android.ticb.base.Security.sKnownNonces;
java.lang.Long .valueOf ( p0,p1 );
(( java.util.HashSet ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
/* .line 86 */
return;
} // .end method
public static Boolean verify ( java.security.PublicKey p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 5 */
/* .param p0, "publicKey" # Ljava/security/PublicKey; */
/* .param p1, "signedData" # Ljava/lang/String; */
/* .param p2, "signature" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 228 */
try { // :try_start_0
final String v3 = "SHA1withRSA"; // const-string v3, "SHA1withRSA"
java.security.Signature .getInstance ( v3 );
/* .line 229 */
/* .local v1, "sig":Ljava/security/Signature; */
(( java.security.Signature ) v1 ).initVerify ( p0 ); // invoke-virtual {v1, p0}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
/* .line 230 */
(( java.lang.String ) p1 ).getBytes ( ); // invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
(( java.security.Signature ) v1 ).update ( v3 ); // invoke-virtual {v1, v3}, Ljava/security/Signature;->update([B)V
/* .line 231 */
de.nurogames.android.ticb.base.core.Base64 .decode ( p2 );
v3 = (( java.security.Signature ) v1 ).verify ( v3 ); // invoke-virtual {v1, v3}, Ljava/security/Signature;->verify([B)Z
/* if-nez v3, :cond_0 */
/* .line 232 */
final String v3 = "Security"; // const-string v3, "Security"
final String v4 = "Signature verification failed."; // const-string v4, "Signature verification failed."
android.util.Log .e ( v3,v4 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/security/InvalidKeyException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/security/SignatureException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Lde/nurogames/android/ticb/base/core/Base64DecoderException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .line 245 */
} // .end local v1 # "sig":Ljava/security/Signature;
} // :goto_0
/* .line 235 */
/* .restart local v1 # "sig":Ljava/security/Signature; */
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
/* .line 236 */
} // .end local v1 # "sig":Ljava/security/Signature;
/* :catch_0 */
/* move-exception v0 */
/* .line 237 */
/* .local v0, "e":Ljava/security/NoSuchAlgorithmException; */
final String v3 = "Security"; // const-string v3, "Security"
final String v4 = "NoSuchAlgorithmException."; // const-string v4, "NoSuchAlgorithmException."
android.util.Log .e ( v3,v4 );
/* .line 238 */
} // .end local v0 # "e":Ljava/security/NoSuchAlgorithmException;
/* :catch_1 */
/* move-exception v0 */
/* .line 239 */
/* .local v0, "e":Ljava/security/InvalidKeyException; */
final String v3 = "Security"; // const-string v3, "Security"
final String v4 = "Invalid key specification."; // const-string v4, "Invalid key specification."
android.util.Log .e ( v3,v4 );
/* .line 240 */
} // .end local v0 # "e":Ljava/security/InvalidKeyException;
/* :catch_2 */
/* move-exception v0 */
/* .line 241 */
/* .local v0, "e":Ljava/security/SignatureException; */
final String v3 = "Security"; // const-string v3, "Security"
final String v4 = "Signature exception."; // const-string v4, "Signature exception."
android.util.Log .e ( v3,v4 );
/* .line 242 */
} // .end local v0 # "e":Ljava/security/SignatureException;
/* :catch_3 */
/* move-exception v0 */
/* .line 243 */
/* .local v0, "e":Lde/nurogames/android/ticb/base/core/Base64DecoderException; */
final String v3 = "Security"; // const-string v3, "Security"
final String v4 = "Base64 decoding failed."; // const-string v4, "Base64 decoding failed."
android.util.Log .e ( v3,v4 );
} // .end method
public static java.util.ArrayList verifyPurchase ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 26 */
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
/* "Lde/nurogames/android/ticb/base/Security$VerifiedPurchase;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 105 */
/* if-nez p0, :cond_0 */
/* .line 106 */
final String v3 = "Security"; // const-string v3, "Security"
final String v24 = "data is null"; // const-string v24, "data is null"
/* move-object/from16 v0, v24 */
android.util.Log .e ( v3,v0 );
/* .line 107 */
/* const/16 v21, 0x0 */
/* .line 187 */
} // :goto_0
/* .line 112 */
} // :cond_0
/* const/16 v23, 0x0 */
/* .line 113 */
/* .local v23, "verified":Z */
v3 = /* invoke-static/range {p1 ..p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z */
/* if-nez v3, :cond_1 */
/* .line 127 */
final String v11 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApzIvrSP8EfYJY/dMV1MaEhEvLA0tTrROi6hKcAFvw9XJmZOOg0kY1U3JyA5CnDdYbf/Tmis67I2wFW3gEFJBELO2f/rDy7VxGAeMRrOUeOLSs1S23ND9B2oCdJlWkQOE6xrWfIbMwV83UstP6+7jzMPWt+fATQnRL2GRpQvGVHls4qr+K1cSq+1RA3uZEoz7smOVQ56xJmwYnt7qYfYXKXH/Z/1VsdeHeRfVThTAXvVywSEPW/HEy+qwiJjBDESYH0XrdDMNzufWSiOF69o3xQ7Do9vYnka5QAXplbRzROsk2mGmLUTZLaV7sTxNfH+UDPfhGwjAY7xIBzczEPjoXwIDAQAB"; // const-string v11, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApzIvrSP8EfYJY/dMV1MaEhEvLA0tTrROi6hKcAFvw9XJmZOOg0kY1U3JyA5CnDdYbf/Tmis67I2wFW3gEFJBELO2f/rDy7VxGAeMRrOUeOLSs1S23ND9B2oCdJlWkQOE6xrWfIbMwV83UstP6+7jzMPWt+fATQnRL2GRpQvGVHls4qr+K1cSq+1RA3uZEoz7smOVQ56xJmwYnt7qYfYXKXH/Z/1VsdeHeRfVThTAXvVywSEPW/HEy+qwiJjBDESYH0XrdDMNzufWSiOF69o3xQ7Do9vYnka5QAXplbRzROsk2mGmLUTZLaV7sTxNfH+UDPfhGwjAY7xIBzczEPjoXwIDAQAB"
/* .line 128 */
/* .local v11, "base64EncodedPublicKey":Ljava/lang/String; */
de.nurogames.android.ticb.base.Security .generatePublicKey ( v11 );
/* .line 129 */
/* .local v17, "key":Ljava/security/PublicKey; */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
v23 = de.nurogames.android.ticb.base.Security .verify ( v0,v1,v2 );
/* .line 130 */
/* if-nez v23, :cond_1 */
/* .line 131 */
final String v3 = "Security"; // const-string v3, "Security"
final String v24 = "signature does not match data."; // const-string v24, "signature does not match data."
/* move-object/from16 v0, v24 */
android.util.Log .w ( v3,v0 );
/* .line 132 */
/* const/16 v21, 0x0 */
/* .line 137 */
} // .end local v11 # "base64EncodedPublicKey":Ljava/lang/String;
} // .end local v17 # "key":Ljava/security/PublicKey;
} // :cond_1
/* const/16 v16, 0x0 */
/* .line 138 */
/* .local v16, "jTransactionsArray":Lorg/json/JSONArray; */
/* const/16 v20, 0x0 */
/* .line 139 */
/* .local v20, "numTransactions":I */
/* const-wide/16 v18, 0x0 */
/* .line 141 */
/* .local v18, "nonce":J */
try { // :try_start_0
/* new-instance v15, Lorg/json/JSONObject; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v15, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 144 */
/* .local v15, "jObject":Lorg/json/JSONObject; */
final String v3 = "nonce"; // const-string v3, "nonce"
(( org.json.JSONObject ) v15 ).optLong ( v3 ); // invoke-virtual {v15, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J
/* move-result-wide v18 */
/* .line 145 */
final String v3 = "orders"; // const-string v3, "orders"
(( org.json.JSONObject ) v15 ).optJSONArray ( v3 ); // invoke-virtual {v15, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 146 */
if ( v16 != null) { // if-eqz v16, :cond_2
/* .line 147 */
/* invoke-virtual/range {v16 ..v16}, Lorg/json/JSONArray;->length()I */
/* :try_end_0 */
v20 = /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 153 */
} // :cond_2
v3 = /* invoke-static/range {v18 ..v19}, Lde/nurogames/android/ticb/base/Security;->isNonceKnown(J)Z */
/* if-nez v3, :cond_3 */
/* .line 154 */
final String v3 = "Security"; // const-string v3, "Security"
/* new-instance v24, Ljava/lang/StringBuilder; */
final String v25 = "Nonce not found: "; // const-string v25, "Nonce not found: "
/* invoke-direct/range {v24 ..v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v24 */
/* move-wide/from16 v1, v18 */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v24 ..v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* move-object/from16 v0, v24 */
android.util.Log .w ( v3,v0 );
/* .line 155 */
/* const/16 v21, 0x0 */
/* .line 149 */
} // .end local v15 # "jObject":Lorg/json/JSONObject;
/* :catch_0 */
/* move-exception v12 */
/* .line 150 */
/* .local v12, "e":Lorg/json/JSONException; */
/* const/16 v21, 0x0 */
/* .line 158 */
} // .end local v12 # "e":Lorg/json/JSONException;
/* .restart local v15 # "jObject":Lorg/json/JSONObject; */
} // :cond_3
/* new-instance v21, Ljava/util/ArrayList; */
/* invoke-direct/range {v21 ..v21}, Ljava/util/ArrayList;-><init>()V */
/* .line 160 */
/* .local v21, "purchases":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lde/nurogames/android/ticb/base/Security$VerifiedPurchase;>;" */
int v13 = 0; // const/4 v13, 0x0
/* .local v13, "i":I */
} // :goto_1
/* move/from16 v0, v20 */
/* if-lt v13, v0, :cond_4 */
/* .line 186 */
/* invoke-static/range {v18 ..v19}, Lde/nurogames/android/ticb/base/Security;->removeNonce(J)V */
/* .line 161 */
} // :cond_4
try { // :try_start_1
/* move-object/from16 v0, v16 */
(( org.json.JSONArray ) v0 ).getJSONObject ( v13 ); // invoke-virtual {v0, v13}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
/* .line 162 */
/* .local v14, "jElement":Lorg/json/JSONObject; */
final String v3 = "purchaseState"; // const-string v3, "purchaseState"
v22 = (( org.json.JSONObject ) v14 ).getInt ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
/* .line 163 */
/* .local v22, "response":I */
/* invoke-static/range {v22 ..v22}, Lde/nurogames/android/ticb/base/Consts$PurchaseState;->valueOf(I)Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
/* .line 164 */
/* .local v4, "purchaseState":Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
final String v3 = "productId"; // const-string v3, "productId"
(( org.json.JSONObject ) v14 ).getString ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 166 */
/* .local v6, "productId":Ljava/lang/String; */
final String v3 = "purchaseTime"; // const-string v3, "purchaseTime"
(( org.json.JSONObject ) v14 ).getLong ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v8 */
/* .line 167 */
/* .local v8, "purchaseTime":J */
final String v3 = "orderId"; // const-string v3, "orderId"
final String v24 = ""; // const-string v24, ""
/* move-object/from16 v0, v24 */
(( org.json.JSONObject ) v14 ).optString ( v3, v0 ); // invoke-virtual {v14, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 168 */
/* .local v7, "orderId":Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
/* .line 169 */
/* .local v5, "notifyId":Ljava/lang/String; */
final String v3 = "notificationId"; // const-string v3, "notificationId"
v3 = (( org.json.JSONObject ) v14 ).has ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 170 */
final String v3 = "notificationId"; // const-string v3, "notificationId"
(( org.json.JSONObject ) v14 ).getString ( v3 ); // invoke-virtual {v14, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 172 */
} // :cond_5
final String v3 = "developerPayload"; // const-string v3, "developerPayload"
/* const/16 v24, 0x0 */
/* move-object/from16 v0, v24 */
(( org.json.JSONObject ) v14 ).optString ( v3, v0 ); // invoke-virtual {v14, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 176 */
/* .local v10, "developerPayload":Ljava/lang/String; */
v3 = de.nurogames.android.ticb.base.Consts$PurchaseState.PURCHASED;
/* if-ne v4, v3, :cond_6 */
/* if-nez v23, :cond_6 */
/* .line 160 */
} // :goto_2
/* add-int/lit8 v13, v13, 0x1 */
/* .line 179 */
} // :cond_6
/* new-instance v3, Lde/nurogames/android/ticb/base/Security$VerifiedPurchase; */
/* .line 180 */
/* invoke-direct/range {v3 ..v10}, Lde/nurogames/android/ticb/base/Security$VerifiedPurchase;-><init>(Lde/nurogames/android/ticb/base/Consts$PurchaseState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V */
/* .line 179 */
/* move-object/from16 v0, v21 */
(( java.util.ArrayList ) v0 ).add ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 182 */
} // .end local v4 # "purchaseState":Lde/nurogames/android/ticb/base/Consts$PurchaseState;
} // .end local v5 # "notifyId":Ljava/lang/String;
} // .end local v6 # "productId":Ljava/lang/String;
} // .end local v7 # "orderId":Ljava/lang/String;
} // .end local v8 # "purchaseTime":J
} // .end local v10 # "developerPayload":Ljava/lang/String;
} // .end local v14 # "jElement":Lorg/json/JSONObject;
} // .end local v22 # "response":I
/* :catch_1 */
/* move-exception v12 */
/* .line 183 */
/* .restart local v12 # "e":Lorg/json/JSONException; */
final String v3 = "Security"; // const-string v3, "Security"
final String v24 = "JSON exception: "; // const-string v24, "JSON exception: "
/* move-object/from16 v0, v24 */
android.util.Log .e ( v3,v0,v12 );
/* .line 184 */
/* const/16 v21, 0x0 */
/* goto/16 :goto_0 */
} // .end method
