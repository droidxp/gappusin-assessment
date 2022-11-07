public class com.balloonisland.hfxw.StarGems extends org.cocos2dx.lib.Cocos2dxActivity {
	 /* .source "StarGems.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/balloonisland/hfxw/StarGems$FACEBOOK_ACTION_TYPE;, */
	 /* Lcom/balloonisland/hfxw/StarGems$FbAPIsAuthListener;, */
	 /* Lcom/balloonisland/hfxw/StarGems$FbAPIsLogoutListener;, */
	 /* Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;, */
	 /* Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;, */
	 /* Lcom/balloonisland/hfxw/StarGems$PostDialogListener; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String ANDROID_APP_URL;
public static final java.lang.String APP_ID;
public static final java.lang.String APP_TOKEN;
public static final java.lang.String BALLOONISLAND_URL;
protected static final Integer Fb_deleteRequestHandler;
protected static final Integer Fb_postScoreHandler;
protected static final Integer Fb_postToWallHandler;
protected static final Integer Fb_sendGiftHandler;
protected static final Integer Fb_showLeaderBoardsHandler;
protected static final Integer Fb_showRequestHandler;
public static final java.lang.String Mediation_ID;
private static android.os.Handler OFHandler;
private static java.lang.String deleteRequest_uid;
private static java.lang.String friendlist_response;
private static java.lang.String leaderboard_response;
protected static final Integer openURLHandler;
protected static final Integer rateAppHandler;
private static java.lang.String request_response;
private static java.lang.String sendGift_uid;
/* # instance fields */
private com.google.ads.AdRequest adRequest;
private com.google.ads.AdView adView;
private java.lang.String current_login_token;
private com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE fb_action;
private Long fb_highest_scores;
private Integer gametype;
private Long highest_scores;
private org.fmod.FMODAudioDevice mFMODAudioDevice;
private org.cocos2dx.lib.Cocos2dxGLSurfaceView mGLView;
java.lang.String permissions;
private Boolean sendScoreOnly;
private Integer user_gender;
/* # direct methods */
static com.balloonisland.hfxw.StarGems ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 117 */
	 final String v0 = ""; // const-string v0, ""
	 /* .line 118 */
	 final String v0 = ""; // const-string v0, ""
	 /* .line 119 */
	 final String v0 = ""; // const-string v0, ""
	 /* .line 120 */
	 final String v0 = ""; // const-string v0, ""
	 /* .line 121 */
	 final String v0 = ""; // const-string v0, ""
	 /* .line 822 */
	 final String v0 = "fmodex"; // const-string v0, "fmodex"
	 java.lang.System .loadLibrary ( v0 );
	 /* .line 823 */
	 final String v0 = "cocosdenshion"; // const-string v0, "cocosdenshion"
	 java.lang.System .loadLibrary ( v0 );
	 /* .line 824 */
	 final String v0 = "game"; // const-string v0, "game"
	 java.lang.System .loadLibrary ( v0 );
	 /* .line 66 */
	 return;
} // .end method
public com.balloonisland.hfxw.StarGems ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 66 */
	 /* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;-><init>()V */
	 /* .line 72 */
	 /* new-instance v0, Lorg/fmod/FMODAudioDevice; */
	 /* invoke-direct {v0}, Lorg/fmod/FMODAudioDevice;-><init>()V */
	 this.mFMODAudioDevice = v0;
	 /* .line 81 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* new-array v0, v0, [Ljava/lang/String; */
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "offline_access"; // const-string v2, "offline_access"
	 /* aput-object v2, v0, v1 */
	 int v1 = 1; // const/4 v1, 0x1
	 final String v2 = "publish_stream"; // const-string v2, "publish_stream"
	 /* aput-object v2, v0, v1 */
	 int v1 = 2; // const/4 v1, 0x2
	 final String v2 = "publish_actions"; // const-string v2, "publish_actions"
	 /* aput-object v2, v0, v1 */
	 this.permissions = v0;
	 /* .line 66 */
	 return;
} // .end method
static com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE access$0 ( com.balloonisland.hfxw.StarGems p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 111 */
	 v0 = this.fb_action;
} // .end method
static void access$1 ( com.balloonisland.hfxw.StarGems p0, Long p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 104 */
	 /* iput-wide p1, p0, Lcom/balloonisland/hfxw/StarGems;->fb_highest_scores:J */
	 return;
} // .end method
static void access$10 ( com.balloonisland.hfxw.StarGems p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 109 */
	 /* iput p1, p0, Lcom/balloonisland/hfxw/StarGems;->user_gender:I */
	 return;
} // .end method
static void access$11 ( java.lang.String p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 119 */
	 return;
} // .end method
static void access$12 ( com.balloonisland.hfxw.StarGems p0, Long p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 103 */
	 /* iput-wide p1, p0, Lcom/balloonisland/hfxw/StarGems;->highest_scores:J */
	 return;
} // .end method
static void access$13 ( com.balloonisland.hfxw.StarGems p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 106 */
	 /* iput-boolean p1, p0, Lcom/balloonisland/hfxw/StarGems;->sendScoreOnly:Z */
	 return;
} // .end method
static void access$14 ( com.balloonisland.hfxw.StarGems p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 105 */
	 /* iput p1, p0, Lcom/balloonisland/hfxw/StarGems;->gametype:I */
	 return;
} // .end method
static void access$15 ( com.balloonisland.hfxw.StarGems p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 175 */
	 /* invoke-direct {p0}, Lcom/balloonisland/hfxw/StarGems;->appRated()V */
	 return;
} // .end method
static Long access$2 ( com.balloonisland.hfxw.StarGems p0 ) { //synthethic
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 104 */
	 /* iget-wide v0, p0, Lcom/balloonisland/hfxw/StarGems;->fb_highest_scores:J */
	 /* return-wide v0 */
} // .end method
static Long access$3 ( com.balloonisland.hfxw.StarGems p0 ) { //synthethic
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 103 */
	 /* iget-wide v0, p0, Lcom/balloonisland/hfxw/StarGems;->highest_scores:J */
	 /* return-wide v0 */
} // .end method
static void access$4 ( com.balloonisland.hfxw.StarGems p0, com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 111 */
	 this.fb_action = p1;
	 return;
} // .end method
static void access$5 ( com.balloonisland.hfxw.StarGems p0, java.lang.String p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 114 */
	 this.current_login_token = p1;
	 return;
} // .end method
static Boolean access$6 ( com.balloonisland.hfxw.StarGems p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 106 */
	 /* iget-boolean v0, p0, Lcom/balloonisland/hfxw/StarGems;->sendScoreOnly:Z */
} // .end method
static java.lang.String access$7 ( com.balloonisland.hfxw.StarGems p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 114 */
	 v0 = this.current_login_token;
} // .end method
static void access$8 ( java.lang.String p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 118 */
	 return;
} // .end method
static void access$9 ( java.lang.String p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 117 */
	 return;
} // .end method
private native void appRated ( ) {
} // .end method
public static Boolean facebook_IsSessionValid ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 137 */
	 final String v0 = "facebook_IsSessionValid"; // const-string v0, "facebook_IsSessionValid"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Result:"; // const-string v2, "Result:"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v2 = com.balloonisland.hfxw.Utility.mFacebook;
	 v2 = 	 (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .i ( v0,v1 );
	 /* .line 138 */
	 v0 = com.balloonisland.hfxw.Utility.mFacebook;
	 v0 = 	 (( com.facebook.android.Facebook ) v0 ).isSessionValid ( ); // invoke-virtual {v0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 139 */
		 final String v0 = "return"; // const-string v0, "return"
		 final String v1 = "true"; // const-string v1, "true"
		 android.util.Log .i ( v0,v1 );
		 /* .line 140 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 143 */
	 } // :goto_0
	 /* .line 142 */
} // :cond_0
final String v0 = "return"; // const-string v0, "return"
final String v1 = "false"; // const-string v1, "false"
android.util.Log .i ( v0,v1 );
/* .line 143 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void facebook_deleteRequest ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "uid" # Ljava/lang/String; */
/* .prologue */
/* .line 192 */
final String v1 = "facebook_deleteRequest"; // const-string v1, "facebook_deleteRequest"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "id="; // const-string v3, "id="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 193 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 194 */
/* .local v0, "message":Landroid/os/Message; */
/* const/16 v1, 0x106 */
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 195 */
/* .line 196 */
v1 = com.balloonisland.hfxw.StarGems.OFHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 197 */
return;
} // .end method
public static java.lang.String facebook_getCurrentUserUID ( ) {
/* .locals 1 */
/* .prologue */
/* .line 133 */
v0 = com.balloonisland.hfxw.Utility.userUID;
} // .end method
public static java.lang.String facebook_getFriendListResponse ( ) {
/* .locals 1 */
/* .prologue */
/* .line 127 */
v0 = com.balloonisland.hfxw.StarGems.friendlist_response;
} // .end method
public static java.lang.String facebook_getLeaderBoardResponse ( ) {
/* .locals 1 */
/* .prologue */
/* .line 124 */
v0 = com.balloonisland.hfxw.StarGems.leaderboard_response;
} // .end method
public static java.lang.String facebook_getRequestResponse ( ) {
/* .locals 1 */
/* .prologue */
/* .line 130 */
v0 = com.balloonisland.hfxw.StarGems.request_response;
} // .end method
public static void facebook_postScore ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "highest_scores" # I */
/* .prologue */
/* .line 207 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 208 */
/* .local v0, "message":Landroid/os/Message; */
/* const/16 v1, 0x108 */
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 209 */
/* iput p0, v0, Landroid/os/Message;->arg1:I */
/* .line 210 */
v1 = com.balloonisland.hfxw.StarGems.OFHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 211 */
return;
} // .end method
public static void facebook_postToWall ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p0, "highest_scores" # I */
/* .param p1, "gametype" # I */
/* .prologue */
/* .line 178 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 179 */
/* .local v0, "message":Landroid/os/Message; */
/* const/16 v1, 0x103 */
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 180 */
/* iput p0, v0, Landroid/os/Message;->arg1:I */
/* .line 181 */
/* iput p1, v0, Landroid/os/Message;->arg2:I */
/* .line 182 */
v1 = com.balloonisland.hfxw.StarGems.OFHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 183 */
return;
} // .end method
public static void facebook_sendGift ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "uid" # Ljava/lang/String; */
/* .prologue */
/* .line 200 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 201 */
/* .local v0, "message":Landroid/os/Message; */
/* const/16 v1, 0x107 */
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 202 */
/* .line 203 */
v1 = com.balloonisland.hfxw.StarGems.OFHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 204 */
return;
} // .end method
public static void facebook_showLeaderBoard ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "highest_scores" # I */
/* .prologue */
/* .line 157 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 158 */
/* .local v0, "message":Landroid/os/Message; */
/* const/16 v1, 0x101 */
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 159 */
/* iput p0, v0, Landroid/os/Message;->arg1:I */
/* .line 160 */
v1 = com.balloonisland.hfxw.StarGems.OFHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 161 */
return;
} // .end method
public static void facebook_showRequest ( ) {
/* .locals 2 */
/* .prologue */
/* .line 186 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 187 */
/* .local v0, "message":Landroid/os/Message; */
/* const/16 v1, 0x105 */
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 188 */
v1 = com.balloonisland.hfxw.StarGems.OFHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 189 */
return;
} // .end method
public static void openURL ( ) {
/* .locals 2 */
/* .prologue */
/* .line 164 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 165 */
/* .local v0, "message":Landroid/os/Message; */
/* const/16 v1, 0x102 */
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 166 */
v1 = com.balloonisland.hfxw.StarGems.OFHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 167 */
return;
} // .end method
public static void rateApp ( ) {
/* .locals 2 */
/* .prologue */
/* .line 170 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 171 */
/* .local v0, "message":Landroid/os/Message; */
/* const/16 v1, 0x104 */
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 172 */
v1 = com.balloonisland.hfxw.StarGems.OFHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 173 */
return;
} // .end method
/* # virtual methods */
public void adWhirlGeneric ( ) {
/* .locals 0 */
/* .prologue */
/* .line 440 */
return;
} // .end method
public void deleteRequest ( ) {
/* .locals 5 */
/* .prologue */
/* .line 565 */
final String v2 = "deleteRequest"; // const-string v2, "deleteRequest"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Deleteing requests: "; // const-string v4, "Deleteing requests: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = com.balloonisland.hfxw.StarGems.deleteRequest_uid;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v2,v3 );
/* .line 566 */
v2 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_DELETE_REQUEST;
this.fb_action = v2;
/* .line 567 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "SELECT request_id FROM apprequest WHERE recipient_uid=me() AND app_id=459943730685689 AND sender_uid="; // const-string v3, "SELECT request_id FROM apprequest WHERE recipient_uid=me() AND app_id=459943730685689 AND sender_uid="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.balloonisland.hfxw.StarGems.deleteRequest_uid;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 568 */
/* .local v1, "query":Ljava/lang/String; */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 569 */
/* .local v0, "params":Landroid/os/Bundle; */
final String v2 = "method"; // const-string v2, "method"
final String v3 = "fql.query"; // const-string v3, "fql.query"
(( android.os.Bundle ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 570 */
final String v2 = "query"; // const-string v2, "query"
(( android.os.Bundle ) v0 ).putString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 571 */
v2 = com.balloonisland.hfxw.Utility.mAsyncRunner;
int v3 = 0; // const/4 v3, 0x0
/* new-instance v4, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
/* invoke-direct {v4, p0}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.AsyncFacebookRunner ) v2 ).request ( v3, v0, v4 ); // invoke-virtual {v2, v3, v0, v4}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* .line 572 */
return;
} // .end method
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* .param p1, "requestCode" # I */
/* .param p2, "resultCode" # I */
/* .param p3, "data" # Landroid/content/Intent; */
/* .prologue */
/* .line 428 */
/* invoke-super {p0, p1, p2, p3}, Lorg/cocos2dx/lib/Cocos2dxActivity;->onActivityResult(IILandroid/content/Intent;)V */
/* .line 432 */
try { // :try_start_0
	 v0 = com.balloonisland.hfxw.Utility.mFacebook;
	 (( com.facebook.android.Facebook ) v0 ).authorizeCallback ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/android/Facebook;->authorizeCallback(IILandroid/content/Intent;)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 436 */
} // :goto_0
return;
/* .line 433 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 8 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
int v6 = -2; // const/4 v6, -0x2
/* .line 214 */
/* invoke-super {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxActivity;->onCreate(Landroid/os/Bundle;)V */
/* .line 217 */
(( com.balloonisland.hfxw.StarGems ) p0 ).getApplication ( ); // invoke-virtual {p0}, Lcom/balloonisland/hfxw/StarGems;->getApplication()Landroid/app/Application;
(( android.app.Application ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/app/Application;->getPackageName()Ljava/lang/String;
/* .line 218 */
/* .local v2, "packageName":Ljava/lang/String; */
/* invoke-super {p0, v2}, Lorg/cocos2dx/lib/Cocos2dxActivity;->setPackageName(Ljava/lang/String;)V */
/* .line 220 */
/* const/high16 v3, 0x7f030000 */
(( com.balloonisland.hfxw.StarGems ) p0 ).setContentView ( v3 ); // invoke-virtual {p0, v3}, Lcom/balloonisland/hfxw/StarGems;->setContentView(I)V
/* .line 221 */
/* const/high16 v3, 0x7f050000 */
(( com.balloonisland.hfxw.StarGems ) p0 ).findViewById ( v3 ); // invoke-virtual {p0, v3}, Lcom/balloonisland/hfxw/StarGems;->findViewById(I)Landroid/view/View;
/* check-cast v3, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView; */
this.mGLView = v3;
/* .line 225 */
int v3 = 3; // const/4 v3, 0x3
(( com.balloonisland.hfxw.StarGems ) p0 ).setVolumeControlStream ( v3 ); // invoke-virtual {p0, v3}, Lcom/balloonisland/hfxw/StarGems;->setVolumeControlStream(I)V
/* .line 229 */
/* .line 243 */
(( com.balloonisland.hfxw.StarGems ) p0 ).restoreUserGender ( ); // invoke-virtual {p0}, Lcom/balloonisland/hfxw/StarGems;->restoreUserGender()V
/* .line 244 */
/* iget v3, p0, Lcom/balloonisland/hfxw/StarGems;->user_gender:I */
/* if-ne v3, v7, :cond_1 */
/* .line 245 */
/* .line 249 */
/* .line 253 */
} // :cond_0
} // :goto_0
/* new-instance v3, Lcom/facebook/android/Facebook; */
final String v4 = "459943730685689"; // const-string v4, "459943730685689"
/* invoke-direct {v3, v4}, Lcom/facebook/android/Facebook;-><init>(Ljava/lang/String;)V */
/* .line 255 */
/* new-instance v3, Lcom/facebook/android/AsyncFacebookRunner; */
v4 = com.balloonisland.hfxw.Utility.mFacebook;
/* invoke-direct {v3, v4}, Lcom/facebook/android/AsyncFacebookRunner;-><init>(Lcom/facebook/android/Facebook;)V */
/* .line 257 */
v3 = com.balloonisland.hfxw.Utility.mFacebook;
com.balloonisland.hfxw.SessionStore .restore ( v3,p0 );
/* .line 258 */
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$FbAPIsAuthListener; */
/* invoke-direct {v3, p0}, Lcom/balloonisland/hfxw/StarGems$FbAPIsAuthListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
com.balloonisland.hfxw.SessionEvents .addAuthListener ( v3 );
/* .line 259 */
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$FbAPIsLogoutListener; */
/* invoke-direct {v3, p0}, Lcom/balloonisland/hfxw/StarGems$FbAPIsLogoutListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
com.balloonisland.hfxw.SessionEvents .addLogoutListener ( v3 );
/* .line 263 */
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$1; */
/* invoke-direct {v3, p0}, Lcom/balloonisland/hfxw/StarGems$1;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
/* .line 396 */
return;
/* .line 246 */
} // :cond_1
/* iget v3, p0, Lcom/balloonisland/hfxw/StarGems;->user_gender:I */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v3, v4, :cond_0 */
/* .line 247 */
} // .end method
public void onDestroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 400 */
/* invoke-super {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;->onDestroy()V */
/* .line 404 */
return;
} // .end method
protected void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 408 */
/* invoke-super {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;->onPause()V */
/* .line 409 */
v0 = this.mGLView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).onPause ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->onPause()V
/* .line 410 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 414 */
/* invoke-super {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;->onResume()V */
/* .line 415 */
v0 = this.mGLView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).onResume ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->onResume()V
/* .line 417 */
v0 = com.balloonisland.hfxw.Utility.mFacebook;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 418 */
v0 = com.balloonisland.hfxw.Utility.mFacebook;
v0 = (( com.facebook.android.Facebook ) v0 ).isSessionValid ( ); // invoke-virtual {v0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 420 */
v0 = com.balloonisland.hfxw.Utility.mFacebook;
int v1 = 0; // const/4 v1, 0x0
(( com.facebook.android.Facebook ) v0 ).extendAccessTokenIfNeeded ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lcom/facebook/android/Facebook;->extendAccessTokenIfNeeded(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z
/* .line 424 */
} // :cond_0
return;
} // .end method
public void onStart ( ) {
/* .locals 1 */
/* .prologue */
/* .line 810 */
/* invoke-super {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;->onStart()V */
/* .line 811 */
v0 = this.mFMODAudioDevice;
(( org.fmod.FMODAudioDevice ) v0 ).start ( ); // invoke-virtual {v0}, Lorg/fmod/FMODAudioDevice;->start()V
/* .line 812 */
return;
} // .end method
public void onStop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 817 */
v0 = this.mFMODAudioDevice;
(( org.fmod.FMODAudioDevice ) v0 ).stop ( ); // invoke-virtual {v0}, Lorg/fmod/FMODAudioDevice;->stop()V
/* .line 818 */
/* invoke-super {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;->onStop()V */
/* .line 819 */
return;
} // .end method
public void postToWall ( ) {
/* .locals 6 */
/* .prologue */
/* .line 542 */
/* new-instance v1, Landroid/os/Bundle; */
/* invoke-direct {v1}, Landroid/os/Bundle;-><init>()V */
/* .line 543 */
/* .local v1, "params":Landroid/os/Bundle; */
final String v2 = "app_id"; // const-string v2, "app_id"
final String v3 = "459943730685689"; // const-string v3, "459943730685689"
(( android.os.Bundle ) v1 ).putString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 544 */
final String v2 = "link"; // const-string v2, "link"
final String v3 = "http://theballoonisland.com"; // const-string v3, "http://theballoonisland.com"
(( android.os.Bundle ) v1 ).putString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 545 */
final String v2 = "picture"; // const-string v2, "picture"
final String v3 = "http://theballoonisland.com/StarGems/Icon90.png"; // const-string v3, "http://theballoonisland.com/StarGems/Icon90.png"
(( android.os.Bundle ) v1 ).putString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 546 */
/* new-instance v0, Ljava/text/DecimalFormat; */
final String v2 = "###,###,###"; // const-string v2, "###,###,###"
/* invoke-direct {v0, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
/* .line 547 */
/* .local v0, "df":Ljava/text/DecimalFormat; */
/* iget v2, p0, Lcom/balloonisland/hfxw/StarGems;->gametype:I */
/* if-nez v2, :cond_0 */
/* .line 548 */
final String v2 = "name"; // const-string v2, "name"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "I\'ve scored "; // const-string v4, "I\'ve scored "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget-wide v4, p0, Lcom/balloonisland/hfxw/StarGems;->highest_scores:J */
(( java.text.DecimalFormat ) v0 ).format ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " in Star Gems."; // const-string v4, " in Star Gems."
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) v1 ).putString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 552 */
} // :goto_0
final String v2 = "caption"; // const-string v2, "caption"
final String v3 = "Star Gems for iOS/Android"; // const-string v3, "Star Gems for iOS/Android"
(( android.os.Bundle ) v1 ).putString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 553 */
final String v2 = "description"; // const-string v2, "description"
final String v3 = "Blast aliens before they get into outer space! Star Gems is no like other star popping games.It is a brain teaser that requires fast reaction and strategic thinking."; // const-string v3, "Blast aliens before they get into outer space! Star Gems is no like other star popping games.It is a brain teaser that requires fast reaction and strategic thinking."
(( android.os.Bundle ) v1 ).putString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 554 */
final String v2 = "message"; // const-string v2, "message"
final String v3 = "Try this amusing game.You will like it too!"; // const-string v3, "Try this amusing game.You will like it too!"
(( android.os.Bundle ) v1 ).putString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 556 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
final String v3 = "feed"; // const-string v3, "feed"
/* new-instance v4, Lcom/balloonisland/hfxw/StarGems$PostDialogListener; */
/* invoke-direct {v4, p0}, Lcom/balloonisland/hfxw/StarGems$PostDialogListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.Facebook ) v2 ).dialog ( p0, v3, v1, v4 ); // invoke-virtual {v2, p0, v3, v1, v4}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
/* .line 557 */
return;
/* .line 550 */
} // :cond_0
final String v2 = "name"; // const-string v2, "name"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "I\'ve scored "; // const-string v4, "I\'ve scored "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget-wide v4, p0, Lcom/balloonisland/hfxw/StarGems;->highest_scores:J */
(( java.text.DecimalFormat ) v0 ).format ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " in Star Gems."; // const-string v4, " in Star Gems."
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.os.Bundle ) v1 ).putString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
} // .end method
public void restoreUserGender ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 803 */
final String v1 = "facebook-userdetail"; // const-string v1, "facebook-userdetail"
(( com.balloonisland.hfxw.StarGems ) p0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/balloonisland/hfxw/StarGems;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 804 */
/* .local v0, "savedSession":Landroid/content/SharedPreferences; */
v1 = final String v1 = "gender"; // const-string v1, "gender"
/* iput v1, p0, Lcom/balloonisland/hfxw/StarGems;->user_gender:I */
/* .line 805 */
return;
} // .end method
public Boolean saveUserGender ( ) {
/* .locals 3 */
/* .prologue */
/* .line 798 */
final String v1 = "facebook-userdetail"; // const-string v1, "facebook-userdetail"
int v2 = 0; // const/4 v2, 0x0
(( com.balloonisland.hfxw.StarGems ) p0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/balloonisland/hfxw/StarGems;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 799 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
final String v1 = "gender"; // const-string v1, "gender"
/* iget v2, p0, Lcom/balloonisland/hfxw/StarGems;->user_gender:I */
v1 = /* .line 800 */
} // .end method
public void sendGift ( ) {
/* .locals 4 */
/* .prologue */
/* .line 575 */
final String v1 = "sendGift"; // const-string v1, "sendGift"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Sending gift: "; // const-string v3, "Sending gift: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.balloonisland.hfxw.StarGems.sendGift_uid;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 576 */
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SEND_GIFT;
this.fb_action = v1;
/* .line 578 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 579 */
/* .local v0, "params":Landroid/os/Bundle; */
final String v1 = "app_id"; // const-string v1, "app_id"
final String v2 = "459943730685689"; // const-string v2, "459943730685689"
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 580 */
final String v1 = "message"; // const-string v1, "message"
final String v2 = "Laser gun for you.Can you send me back?"; // const-string v2, "Laser gun for you.Can you send me back?"
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 581 */
final String v1 = "to"; // const-string v1, "to"
v2 = com.balloonisland.hfxw.StarGems.sendGift_uid;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 582 */
final String v1 = "frictionless"; // const-string v1, "frictionless"
final String v2 = "1"; // const-string v2, "1"
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 584 */
v1 = com.balloonisland.hfxw.Utility.mFacebook;
final String v2 = "apprequests"; // const-string v2, "apprequests"
/* new-instance v3, Lcom/balloonisland/hfxw/StarGems$PostDialogListener; */
/* invoke-direct {v3, p0}, Lcom/balloonisland/hfxw/StarGems$PostDialogListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.Facebook ) v1 ).dialog ( p0, v2, v0, v3 ); // invoke-virtual {v1, p0, v2, v0, v3}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
/* .line 586 */
return;
} // .end method
public void showLeaderBoard ( ) {
/* .locals 3 */
/* .prologue */
/* .line 530 */
v0 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_GET_USER_GENDER;
this.fb_action = v0;
/* .line 531 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
final String v1 = "me"; // const-string v1, "me"
/* new-instance v2, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
/* invoke-direct {v2, p0}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.AsyncFacebookRunner ) v0 ).request ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* .line 538 */
return;
} // .end method
public void showRequest ( ) {
/* .locals 3 */
/* .prologue */
/* .line 560 */
v0 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SHOW_REQUEST;
this.fb_action = v0;
/* .line 561 */
v0 = com.balloonisland.hfxw.Utility.mAsyncRunner;
final String v1 = "me/apprequests"; // const-string v1, "me/apprequests"
/* new-instance v2, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener; */
/* invoke-direct {v2, p0}, Lcom/balloonisland/hfxw/StarGems$LISTENER_FacebookListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
(( com.facebook.android.AsyncFacebookRunner ) v0 ).request ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V
/* .line 562 */
return;
} // .end method
