public class com.balloonisland.hfxw.StarGems$LISTENER_FacebookListener extends com.balloonisland.hfxw.BaseRequestListener {
	 /* .source "StarGems.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/balloonisland/hfxw/StarGems; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "LISTENER_FacebookListener" */
} // .end annotation
/* # instance fields */
final com.balloonisland.hfxw.StarGems this$0; //synthetic
/* # direct methods */
public com.balloonisland.hfxw.StarGems$LISTENER_FacebookListener ( ) {
/* .locals 0 */
/* .prologue */
/* .line 598 */
this.this$0 = p1;
/* invoke-direct {p0}, Lcom/balloonisland/hfxw/BaseRequestListener;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onComplete ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 14 */
/* .param p1, "response" # Ljava/lang/String; */
/* .param p2, "state" # Ljava/lang/Object; */
/* .prologue */
/* .line 602 */
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_GET_USER_SCORE;
/* if-ne v0, v1, :cond_6 */
/* .line 604 */
final String v0 = "LeaderBoard_Response"; // const-string v0, "LeaderBoard_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "FACEBOOK_GET_USER_SCORE: "; // const-string v3, "FACEBOOK_GET_USER_SCORE: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 605 */
v0 = this.this$0;
/* const-wide/16 v3, -0x1 */
com.balloonisland.hfxw.StarGems .access$1 ( v0,v3,v4 );
/* .line 608 */
try { // :try_start_0
	 /* new-instance v0, Lorg/json/JSONObject; */
	 /* invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
	 final String v1 = "data"; // const-string v1, "data"
	 (( org.json.JSONObject ) v0 ).getJSONArray ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
	 /* .line 609 */
	 /* .local v9, "jsonArray":Lorg/json/JSONArray; */
	 v0 = 	 (( org.json.JSONArray ) v9 ).length ( ); // invoke-virtual {v9}, Lorg/json/JSONArray;->length()I
	 /* if-lez v0, :cond_0 */
	 /* .line 611 */
	 int v8 = 0; // const/4 v8, 0x0
	 /* .local v8, "i":I */
} // :goto_0
v0 = (( org.json.JSONArray ) v9 ).length ( ); // invoke-virtual {v9}, Lorg/json/JSONArray;->length()I
/* if-lt v8, v0, :cond_2 */
/* .line 626 */
} // .end local v8 # "i":I
} // :cond_0
} // :goto_1
final String v0 = "Compare score:"; // const-string v0, "Compare score:"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "(x,y) "; // const-string v3, "(x,y) "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.this$0;
com.balloonisland.hfxw.StarGems .access$2 ( v3 );
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v1 ).append ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v3 = "<-->"; // const-string v3, "<-->"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.this$0;
com.balloonisland.hfxw.StarGems .access$3 ( v3 );
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v1 ).append ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 627 */
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$2 ( v0 );
/* move-result-wide v0 */
/* const-wide/16 v3, -0x1 */
/* cmp-long v0, v0, v3 */
/* if-nez v0, :cond_4 */
/* .line 631 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_GET_USER_UID;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 632 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
final String v1 = "me"; // const-string v1, "me"
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
v4 = this.this$0;
/* invoke-direct {v3, v4}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.AsyncFacebookRunner ) v0 ).request ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* .line 793 */
} // .end local v9 # "jsonArray":Lorg/json/JSONArray;
} // :cond_1
} // :goto_2
return;
/* .line 613 */
/* .restart local v8 # "i":I */
/* .restart local v9 # "jsonArray":Lorg/json/JSONArray; */
} // :cond_2
(( org.json.JSONArray ) v9 ).getJSONObject ( v8 ); // invoke-virtual {v9, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
/* .line 614 */
/* .local v10, "jsonObject":Lorg/json/JSONObject; */
final String v0 = "application"; // const-string v0, "application"
(( org.json.JSONObject ) v10 ).getJSONObject ( v0 ); // invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
final String v1 = "id"; // const-string v1, "id"
(( org.json.JSONObject ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 615 */
/* .local v12, "read_app_id":Ljava/lang/String; */
final String v0 = "appid compare"; // const-string v0, "appid compare"
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v12 );
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "<-->"; // const-string v3, "<-->"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "459943730685689"; // const-string v3, "459943730685689"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 616 */
final String v0 = "459943730685689"; // const-string v0, "459943730685689"
v0 = (( java.lang.String ) v12 ).contentEquals ( v0 ); // invoke-virtual {v12, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 618 */
v0 = this.this$0;
final String v1 = "score"; // const-string v1, "score"
(( org.json.JSONObject ) v10 ).getLong ( v1 ); // invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v3 */
com.balloonisland.hfxw.StarGems .access$1 ( v0,v3,v4 );
/* .line 619 */
final String v0 = "user"; // const-string v0, "user"
(( org.json.JSONObject ) v10 ).getJSONObject ( v0 ); // invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
final String v1 = "id"; // const-string v1, "id"
(( org.json.JSONObject ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 620 */
final String v0 = "same appid"; // const-string v0, "same appid"
/* new-instance v1, Ljava/lang/StringBuilder; */
v3 = com.balloonisland.hfxw.Utility.userUID;
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = " "; // const-string v3, " "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.this$0;
com.balloonisland.hfxw.StarGems .access$2 ( v3 );
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v1 ).append ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_1 */
/* .line 658 */
} // .end local v8 # "i":I
} // .end local v9 # "jsonArray":Lorg/json/JSONArray;
} // .end local v10 # "jsonObject":Lorg/json/JSONObject;
} // .end local v12 # "read_app_id":Ljava/lang/String;
/* :catch_0 */
/* move-exception v6 */
/* .line 660 */
/* .local v6, "e":Lorg/json/JSONException; */
(( org.json.JSONException ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V
/* .line 611 */
} // .end local v6 # "e":Lorg/json/JSONException;
/* .restart local v8 # "i":I */
/* .restart local v9 # "jsonArray":Lorg/json/JSONArray; */
/* .restart local v10 # "jsonObject":Lorg/json/JSONObject; */
/* .restart local v12 # "read_app_id":Ljava/lang/String; */
} // :cond_3
/* add-int/lit8 v8, v8, 0x1 */
/* goto/16 :goto_0 */
/* .line 634 */
} // .end local v8 # "i":I
} // .end local v10 # "jsonObject":Lorg/json/JSONObject;
} // .end local v12 # "read_app_id":Ljava/lang/String;
} // :cond_4
try { // :try_start_1
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$3 ( v0 );
/* move-result-wide v0 */
v3 = this.this$0;
com.balloonisland.hfxw.StarGems .access$2 ( v3 );
/* move-result-wide v3 */
/* cmp-long v0, v0, v3 */
/* if-lez v0, :cond_5 */
/* .line 637 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_POST_USER_SCORE;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 639 */
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 640 */
/* .local v2, "params":Landroid/os/Bundle; */
final String v0 = "score"; // const-string v0, "score"
/* new-instance v1, Ljava/lang/StringBuilder; */
v3 = this.this$0;
com.balloonisland.hfxw.StarGems .access$3 ( v3 );
/* move-result-wide v3 */
java.lang.String .valueOf ( v3,v4 );
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) v2 ).putString ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 641 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.Utility.mFacebook;
(( com.facebook.android.Facebook ) v1 ).getAccessToken ( ); // invoke-virtual {v1}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
com.balloonisland.hfxw.StarGems .access$5 ( v0,v1 );
/* .line 642 */
v0 = com.balloonisland.hfxw.Utility.mFacebook;
final String v1 = "459943730685689|jZVhfweTkO0PBAD05S7oRqaReAs"; // const-string v1, "459943730685689|jZVhfweTkO0PBAD05S7oRqaReAs"
(( com.facebook.android.Facebook ) v0 ).setAccessToken ( v1 ); // invoke-virtual {v0, v1}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 643 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
/* new-instance v1, Ljava/lang/StringBuilder; */
v3 = com.balloonisland.hfxw.Utility.userUID;
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "/scores"; // const-string v3, "/scores"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "POST"; // const-string v3, "POST"
/* new-instance v4, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
v5 = this.this$0;
/* invoke-direct {v4, v5}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
int v5 = 0; // const/4 v5, 0x0
/* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
/* goto/16 :goto_2 */
/* .line 647 */
} // .end local v2 # "params":Landroid/os/Bundle;
} // :cond_5
v0 = this.this$0;
v0 = com.balloonisland.hfxw.StarGems .access$6 ( v0 );
/* if-nez v0, :cond_1 */
/* .line 651 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_RANDOM_FRIEND;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 652 */
final String v11 = "select uid, name from user where uid in (select uid2 from friend where uid1=me() order by rand() limit 20)"; // const-string v11, "select uid, name from user where uid in (select uid2 from friend where uid1=me() order by rand() limit 20)"
/* .line 653 */
/* .local v11, "query":Ljava/lang/String; */
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 654 */
/* .restart local v2 # "params":Landroid/os/Bundle; */
final String v0 = "method"; // const-string v0, "method"
final String v1 = "fql.query"; // const-string v1, "fql.query"
(( android.os.Bundle ) v2 ).putString ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 655 */
final String v0 = "query"; // const-string v0, "query"
(( android.os.Bundle ) v2 ).putString ( v0, v11 ); // invoke-virtual {v2, v0, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 656 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
int v1 = 0; // const/4 v1, 0x0
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
v4 = this.this$0;
/* invoke-direct {v3, v4}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.AsyncFacebookRunner ) v0 ).request ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_2 */
/* .line 664 */
} // .end local v2 # "params":Landroid/os/Bundle;
} // .end local v9 # "jsonArray":Lorg/json/JSONArray;
} // .end local v11 # "query":Ljava/lang/String;
} // :cond_6
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_GET_USER_UID;
/* if-ne v0, v1, :cond_7 */
/* .line 666 */
final String v0 = "LeaderBoard_Response"; // const-string v0, "LeaderBoard_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "FACEBOOK_GET_USER_UID: "; // const-string v3, "FACEBOOK_GET_USER_UID: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 669 */
try { // :try_start_2
/* new-instance v10, Lorg/json/JSONObject; */
/* invoke-direct {v10, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 670 */
/* .restart local v10 # "jsonObject":Lorg/json/JSONObject; */
final String v0 = "id"; // const-string v0, "id"
(( org.json.JSONObject ) v10 ).getString ( v0 ); // invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* :try_end_2 */
/* .catch Lorg/json/JSONException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 676 */
} // .end local v10 # "jsonObject":Lorg/json/JSONObject;
} // :goto_3
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_POST_USER_SCORE;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 678 */
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 679 */
/* .restart local v2 # "params":Landroid/os/Bundle; */
final String v0 = "score"; // const-string v0, "score"
/* new-instance v1, Ljava/lang/StringBuilder; */
v3 = this.this$0;
com.balloonisland.hfxw.StarGems .access$3 ( v3 );
/* move-result-wide v3 */
java.lang.String .valueOf ( v3,v4 );
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) v2 ).putString ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 680 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.Utility.mFacebook;
(( com.facebook.android.Facebook ) v1 ).getAccessToken ( ); // invoke-virtual {v1}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
com.balloonisland.hfxw.StarGems .access$5 ( v0,v1 );
/* .line 681 */
v0 = com.balloonisland.hfxw.Utility.mFacebook;
final String v1 = "459943730685689|jZVhfweTkO0PBAD05S7oRqaReAs"; // const-string v1, "459943730685689|jZVhfweTkO0PBAD05S7oRqaReAs"
(( com.facebook.android.Facebook ) v0 ).setAccessToken ( v1 ); // invoke-virtual {v0, v1}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 682 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
/* new-instance v1, Ljava/lang/StringBuilder; */
v3 = com.balloonisland.hfxw.Utility.userUID;
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "/scores"; // const-string v3, "/scores"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "POST"; // const-string v3, "POST"
/* new-instance v4, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
v5 = this.this$0;
/* invoke-direct {v4, v5}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
int v5 = 0; // const/4 v5, 0x0
/* invoke-virtual/range {v0 ..v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */
/* goto/16 :goto_2 */
/* .line 671 */
} // .end local v2 # "params":Landroid/os/Bundle;
/* :catch_1 */
/* move-exception v6 */
/* .line 673 */
/* .restart local v6 # "e":Lorg/json/JSONException; */
(( org.json.JSONException ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V
/* .line 684 */
} // .end local v6 # "e":Lorg/json/JSONException;
} // :cond_7
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_POST_USER_SCORE;
/* if-ne v0, v1, :cond_8 */
/* .line 686 */
final String v0 = "LeaderBoard_Response"; // const-string v0, "LeaderBoard_Response"
final String v1 = "FACEBOOK_POST_USER_SCORE"; // const-string v1, "FACEBOOK_POST_USER_SCORE"
android.util.Log .i ( v0,v1 );
/* .line 687 */
v0 = com.balloonisland.hfxw.Utility.mFacebook;
v1 = this.this$0;
com.balloonisland.hfxw.StarGems .access$7 ( v1 );
(( com.facebook.android.Facebook ) v0 ).setAccessToken ( v1 ); // invoke-virtual {v0, v1}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 689 */
v0 = this.this$0;
v0 = com.balloonisland.hfxw.StarGems .access$6 ( v0 );
/* if-nez v0, :cond_1 */
/* .line 693 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_RANDOM_FRIEND;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 694 */
final String v11 = "select uid, name from user where uid in (select uid2 from friend where uid1=me() order by rand() limit 20)"; // const-string v11, "select uid, name from user where uid in (select uid2 from friend where uid1=me() order by rand() limit 20)"
/* .line 695 */
/* .restart local v11 # "query":Ljava/lang/String; */
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 696 */
/* .restart local v2 # "params":Landroid/os/Bundle; */
final String v0 = "method"; // const-string v0, "method"
final String v1 = "fql.query"; // const-string v1, "fql.query"
(( android.os.Bundle ) v2 ).putString ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 697 */
final String v0 = "query"; // const-string v0, "query"
(( android.os.Bundle ) v2 ).putString ( v0, v11 ); // invoke-virtual {v2, v0, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 698 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
int v1 = 0; // const/4 v1, 0x0
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
v4 = this.this$0;
/* invoke-direct {v3, v4}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.AsyncFacebookRunner ) v0 ).request ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* goto/16 :goto_2 */
/* .line 700 */
} // .end local v2 # "params":Landroid/os/Bundle;
} // .end local v11 # "query":Ljava/lang/String;
} // :cond_8
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_RANDOM_FRIEND;
/* if-ne v0, v1, :cond_9 */
/* .line 702 */
final String v0 = "LeaderBoard_Response"; // const-string v0, "LeaderBoard_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "FACEBOOK_RANDOM_FRIEND: "; // const-string v3, "FACEBOOK_RANDOM_FRIEND: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 704 */
com.balloonisland.hfxw.StarGems .access$8 ( p1 );
/* .line 707 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SHOW_REQUEST;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 708 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
final String v1 = "me/apprequests"; // const-string v1, "me/apprequests"
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
v4 = this.this$0;
/* invoke-direct {v3, v4}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.AsyncFacebookRunner ) v0 ).request ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* goto/16 :goto_2 */
/* .line 710 */
} // :cond_9
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_GET_ALL_SCORE;
/* if-ne v0, v1, :cond_a */
/* .line 712 */
final String v0 = "LeaderBoard_Response"; // const-string v0, "LeaderBoard_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "FACEBOOK_GET_ALL_SCORE: "; // const-string v3, "FACEBOOK_GET_ALL_SCORE: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 714 */
com.balloonisland.hfxw.StarGems .access$9 ( p1 );
/* goto/16 :goto_2 */
/* .line 716 */
} // :cond_a
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_GET_USER_GENDER;
/* if-ne v0, v1, :cond_d */
/* .line 718 */
final String v0 = "LeaderBoard_Response"; // const-string v0, "LeaderBoard_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "FACEBOOK_GET_USER_GENDER: "; // const-string v3, "FACEBOOK_GET_USER_GENDER: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 721 */
try { // :try_start_3
/* new-instance v10, Lorg/json/JSONObject; */
/* invoke-direct {v10, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 722 */
/* .restart local v10 # "jsonObject":Lorg/json/JSONObject; */
final String v0 = "gender"; // const-string v0, "gender"
(( org.json.JSONObject ) v10 ).getString ( v0 ); // invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 723 */
/* .local v7, "gender":Ljava/lang/String; */
final String v0 = "male"; // const-string v0, "male"
v0 = (( java.lang.String ) v7 ).contentEquals ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 724 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.balloonisland.hfxw.StarGems .access$10 ( v0,v1 );
/* .line 733 */
} // :goto_4
v0 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v0 ).saveUserGender ( ); // invoke-virtual {v0}, Lcom/balloonisland/hfxw/StarGems;->saveUserGender()Z
/* :try_end_3 */
/* .catch Lorg/json/JSONException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .line 741 */
} // .end local v7 # "gender":Ljava/lang/String;
} // .end local v10 # "jsonObject":Lorg/json/JSONObject;
} // :goto_5
final String v0 = "LeaderBoard"; // const-string v0, "LeaderBoard"
final String v1 = "me/scores"; // const-string v1, "me/scores"
android.util.Log .i ( v0,v1 );
/* .line 742 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_GET_USER_SCORE;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 743 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
final String v1 = "me/scores"; // const-string v1, "me/scores"
/* .line 744 */
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
v4 = this.this$0;
/* invoke-direct {v3, v4}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
/* .line 743 */
(( com.facebook.android.AsyncFacebookRunner ) v0 ).request ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* goto/16 :goto_2 */
/* .line 726 */
/* .restart local v7 # "gender":Ljava/lang/String; */
/* .restart local v10 # "jsonObject":Lorg/json/JSONObject; */
} // :cond_b
try { // :try_start_4
final String v0 = "female"; // const-string v0, "female"
v0 = (( java.lang.String ) v7 ).contentEquals ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 727 */
v0 = this.this$0;
int v1 = 2; // const/4 v1, 0x2
com.balloonisland.hfxw.StarGems .access$10 ( v0,v1 );
/* :try_end_4 */
/* .catch Lorg/json/JSONException; {:try_start_4 ..:try_end_4} :catch_2 */
/* .line 735 */
} // .end local v7 # "gender":Ljava/lang/String;
} // .end local v10 # "jsonObject":Lorg/json/JSONObject;
/* :catch_2 */
/* move-exception v6 */
/* .line 737 */
/* .restart local v6 # "e":Lorg/json/JSONException; */
(( org.json.JSONException ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V
/* .line 730 */
} // .end local v6 # "e":Lorg/json/JSONException;
/* .restart local v7 # "gender":Ljava/lang/String; */
/* .restart local v10 # "jsonObject":Lorg/json/JSONObject; */
} // :cond_c
try { // :try_start_5
v0 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
com.balloonisland.hfxw.StarGems .access$10 ( v0,v1 );
/* :try_end_5 */
/* .catch Lorg/json/JSONException; {:try_start_5 ..:try_end_5} :catch_2 */
/* .line 746 */
} // .end local v7 # "gender":Ljava/lang/String;
} // .end local v10 # "jsonObject":Lorg/json/JSONObject;
} // :cond_d
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SHOW_REQUEST;
/* if-ne v0, v1, :cond_e */
/* .line 748 */
final String v0 = "Request_Response"; // const-string v0, "Request_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "FACEBOOK_SHOW_REQUEST: "; // const-string v3, "FACEBOOK_SHOW_REQUEST: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 750 */
com.balloonisland.hfxw.StarGems .access$11 ( p1 );
/* .line 753 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_GET_ALL_SCORE;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 754 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
final String v1 = "459943730685689/scores"; // const-string v1, "459943730685689/scores"
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
v4 = this.this$0;
/* invoke-direct {v3, v4}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.AsyncFacebookRunner ) v0 ).request ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* goto/16 :goto_2 */
/* .line 756 */
} // :cond_e
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_DELETE_REQUEST;
/* if-ne v0, v1, :cond_f */
/* .line 758 */
final String v0 = "Request_Response"; // const-string v0, "Request_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "FACEBOOK_DELETE_REQUEST"; // const-string v3, "FACEBOOK_DELETE_REQUEST"
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 761 */
try { // :try_start_6
/* new-instance v9, Lorg/json/JSONArray; */
/* invoke-direct {v9, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V */
/* .line 762 */
/* .restart local v9 # "jsonArray":Lorg/json/JSONArray; */
v0 = (( org.json.JSONArray ) v9 ).length ( ); // invoke-virtual {v9}, Lorg/json/JSONArray;->length()I
/* if-lez v0, :cond_1 */
/* .line 764 */
int v8 = 0; // const/4 v8, 0x0
/* .restart local v8 # "i":I */
} // :goto_6
v0 = (( org.json.JSONArray ) v9 ).length ( ); // invoke-virtual {v9}, Lorg/json/JSONArray;->length()I
/* if-ge v8, v0, :cond_1 */
/* .line 766 */
(( org.json.JSONArray ) v9 ).getJSONObject ( v8 ); // invoke-virtual {v9, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
/* .line 767 */
/* .restart local v10 # "jsonObject":Lorg/json/JSONObject; */
final String v0 = "request_id"; // const-string v0, "request_id"
(( org.json.JSONObject ) v10 ).getString ( v0 ); // invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 768 */
/* .local v13, "request_id":Ljava/lang/String; */
final String v0 = "Request_Response"; // const-string v0, "Request_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "Request_id:"; // const-string v3, "Request_id:"
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v13 ); // invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 771 */
v0 = this.this$0;
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_DELETE_SINGLE_REQUEST;
com.balloonisland.hfxw.StarGems .access$4 ( v0,v1 );
/* .line 772 */
v0 = com.balloonisland.hfxw.Utility.mFacebook;
/* new-instance v1, Landroid/os/Bundle; */
/* invoke-direct {v1}, Landroid/os/Bundle;-><init>()V */
final String v3 = "DELETE"; // const-string v3, "DELETE"
(( com.facebook.android.Facebook ) v0 ).request ( v13, v1, v3 ); // invoke-virtual {v0, v13, v1, v3}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
/* :try_end_6 */
/* .catch Lorg/json/JSONException; {:try_start_6 ..:try_end_6} :catch_3 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_6 ..:try_end_6} :catch_4 */
/* .catch Ljava/net/MalformedURLException; {:try_start_6 ..:try_end_6} :catch_5 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_6 */
/* .line 764 */
/* add-int/lit8 v8, v8, 0x1 */
/* .line 775 */
} // .end local v8 # "i":I
} // .end local v9 # "jsonArray":Lorg/json/JSONArray;
} // .end local v10 # "jsonObject":Lorg/json/JSONObject;
} // .end local v13 # "request_id":Ljava/lang/String;
/* :catch_3 */
/* move-exception v6 */
/* .line 777 */
/* .restart local v6 # "e":Lorg/json/JSONException; */
(( org.json.JSONException ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V
/* goto/16 :goto_2 */
/* .line 778 */
} // .end local v6 # "e":Lorg/json/JSONException;
/* :catch_4 */
/* move-exception v6 */
/* .line 780 */
/* .local v6, "e":Ljava/io/FileNotFoundException; */
(( java.io.FileNotFoundException ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Ljava/io/FileNotFoundException;->printStackTrace()V
/* goto/16 :goto_2 */
/* .line 781 */
} // .end local v6 # "e":Ljava/io/FileNotFoundException;
/* :catch_5 */
/* move-exception v6 */
/* .line 783 */
/* .local v6, "e":Ljava/net/MalformedURLException; */
(( java.net.MalformedURLException ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Ljava/net/MalformedURLException;->printStackTrace()V
/* goto/16 :goto_2 */
/* .line 784 */
} // .end local v6 # "e":Ljava/net/MalformedURLException;
/* :catch_6 */
/* move-exception v6 */
/* .line 786 */
/* .local v6, "e":Ljava/io/IOException; */
(( java.io.IOException ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V
/* goto/16 :goto_2 */
/* .line 789 */
} // .end local v6 # "e":Ljava/io/IOException;
} // :cond_f
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_DELETE_SINGLE_REQUEST;
/* if-ne v0, v1, :cond_1 */
/* .line 791 */
final String v0 = "Request_Response"; // const-string v0, "Request_Response"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "FACEBOOK_DELETE_SINGLE_REQUEST"; // const-string v3, "FACEBOOK_DELETE_SINGLE_REQUEST"
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* goto/16 :goto_2 */
} // .end method
