public class com.openfeint.api.resource.User extends com.openfeint.internal.resource.Resource {
	 /* .source "User.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/resource/User$DownloadProfilePictureCB;, */
	 /* Lcom/openfeint/api/resource/User$GetFriendsCB;, */
	 /* Lcom/openfeint/api/resource/User$FindCB;, */
	 /* Lcom/openfeint/api/resource/User$LoadCB; */
	 /* } */
} // .end annotation
/* # instance fields */
public Boolean followedByLocalUser;
public Boolean followsLocalUser;
public Integer gamerScore;
public java.lang.String lastPlayedGameId;
public java.lang.String lastPlayedGameName;
public Double latitude;
public Double longitude;
public java.lang.String name;
public Boolean online;
public java.lang.String profilePictureSource;
public java.lang.String profilePictureUrl;
public Boolean usesFacebookProfilePicture;
/* # direct methods */
public com.openfeint.api.resource.User ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 281 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
	 return;
} // .end method
public com.openfeint.api.resource.User ( ) {
	 /* .locals 0 */
	 /* .param p1, "resourceID" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 36 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
	 (( com.openfeint.api.resource.User ) p0 ).setResourceID ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/api/resource/User;->setResourceID(Ljava/lang/String;)V
	 return;
} // .end method
public static void findByID ( java.lang.String p0, com.openfeint.api.resource.User$FindCB p1 ) {
	 /* .locals 1 */
	 /* .param p0, "resourceID" # Ljava/lang/String; */
	 /* .param p1, "cb" # Lcom/openfeint/api/resource/User$FindCB; */
	 /* .prologue */
	 /* .line 169 */
	 /* new-instance v0, Lcom/openfeint/api/resource/User$3; */
	 /* invoke-direct {v0, p0, p1}, Lcom/openfeint/api/resource/User$3;-><init>(Ljava/lang/String;Lcom/openfeint/api/resource/User$FindCB;)V */
	 /* .line 186 */
	 /* .local v0, "req":Lcom/openfeint/internal/request/JSONRequest; */
	 (( com.openfeint.internal.request.JSONRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
	 /* .line 187 */
	 return;
} // .end method
public static void findByName ( java.lang.String p0, com.openfeint.api.resource.User$FindCB p1 ) {
	 /* .locals 1 */
	 /* .param p0, "name" # Ljava/lang/String; */
	 /* .param p1, "cb" # Lcom/openfeint/api/resource/User$FindCB; */
	 /* .prologue */
	 /* .line 141 */
	 /* new-instance v0, Lcom/openfeint/api/resource/User$2; */
	 /* invoke-direct {v0, p0, p1}, Lcom/openfeint/api/resource/User$2;-><init>(Ljava/lang/String;Lcom/openfeint/api/resource/User$FindCB;)V */
	 /* .line 158 */
	 /* .local v0, "req":Lcom/openfeint/internal/request/JSONRequest; */
	 (( com.openfeint.internal.request.JSONRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
	 /* .line 159 */
	 return;
} // .end method
public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 287 */
	 /* new-instance v0, Lcom/openfeint/api/resource/User$6; */
	 /* const-class v1, Lcom/openfeint/api/resource/User; */
	 final String v2 = "user"; // const-string v2, "user"
	 /* invoke-direct {v0, v1, v2}, Lcom/openfeint/api/resource/User$6;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
	 /* .line 289 */
	 /* .local v0, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
	 v1 = this.mProperties;
	 final String v2 = "name"; // const-string v2, "name"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$7; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$7;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 290 */
	 v1 = this.mProperties;
	 final String v2 = "profile_picture_url"; // const-string v2, "profile_picture_url"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$8; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$8;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 291 */
	 v1 = this.mProperties;
	 final String v2 = "profile_picture_source"; // const-string v2, "profile_picture_source"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$9; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$9;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 292 */
	 v1 = this.mProperties;
	 final String v2 = "uses_facebook_profile_picture"; // const-string v2, "uses_facebook_profile_picture"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$10; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$10;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 293 */
	 v1 = this.mProperties;
	 final String v2 = "last_played_game_id"; // const-string v2, "last_played_game_id"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$11; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$11;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 294 */
	 v1 = this.mProperties;
	 final String v2 = "last_played_game_name"; // const-string v2, "last_played_game_name"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$12; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$12;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 295 */
	 v1 = this.mProperties;
	 final String v2 = "gamer_score"; // const-string v2, "gamer_score"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$13; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$13;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 296 */
	 v1 = this.mProperties;
	 final String v2 = "following_local_user"; // const-string v2, "following_local_user"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$14; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$14;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 297 */
	 v1 = this.mProperties;
	 final String v2 = "followed_by_local_user"; // const-string v2, "followed_by_local_user"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$15; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$15;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 298 */
	 v1 = this.mProperties;
	 final String v2 = "online"; // const-string v2, "online"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$16; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$16;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 299 */
	 v1 = this.mProperties;
	 final String v2 = "lat"; // const-string v2, "lat"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$17; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$17;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 300 */
	 v1 = this.mProperties;
	 final String v2 = "lng"; // const-string v2, "lng"
	 /* new-instance v3, Lcom/openfeint/api/resource/User$18; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/User$18;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 302 */
} // .end method
/* # virtual methods */
public void downloadProfilePicture ( com.openfeint.api.resource.User$DownloadProfilePictureCB p0 ) {
	 /* .locals 2 */
	 /* .param p1, "cb" # Lcom/openfeint/api/resource/User$DownloadProfilePictureCB; */
	 /* .prologue */
	 /* .line 250 */
	 v1 = this.profilePictureUrl;
	 /* if-nez v1, :cond_1 */
	 /* .line 251 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 252 */
		 com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
		 (( com.openfeint.api.resource.User$DownloadProfilePictureCB ) p1 ).onFailure ( v1 ); // invoke-virtual {p1, v1}, Lcom/openfeint/api/resource/User$DownloadProfilePictureCB;->onFailure(Ljava/lang/String;)V
		 /* .line 276 */
	 } // :cond_0
} // :goto_0
return;
/* .line 257 */
} // :cond_1
/* new-instance v0, Lcom/openfeint/api/resource/User$5; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/api/resource/User$5;-><init>(Lcom/openfeint/api/resource/User;Lcom/openfeint/api/resource/User$DownloadProfilePictureCB;)V */
/* .line 275 */
/* .local v0, "req":Lcom/openfeint/internal/request/BitmapRequest; */
(( com.openfeint.internal.request.BitmapRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/BitmapRequest;->launch()V
} // .end method
public void getFriends ( com.openfeint.api.resource.User$GetFriendsCB p0 ) {
/* .locals 4 */
/* .param p1, "cb" # Lcom/openfeint/api/resource/User$GetFriendsCB; */
/* .prologue */
/* .line 205 */
/* new-instance v0, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v0}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 206 */
/* .local v0, "args":Lcom/openfeint/internal/request/OrderedArgList; */
final String v2 = "user_id"; // const-string v2, "user_id"
(( com.openfeint.api.resource.User ) p0 ).resourceID ( ); // invoke-virtual {p0}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
(( com.openfeint.internal.request.OrderedArgList ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 207 */
/* new-instance v1, Lcom/openfeint/api/resource/User$4; */
/* invoke-direct {v1, p0, v0, p1}, Lcom/openfeint/api/resource/User$4;-><init>(Lcom/openfeint/api/resource/User;Lcom/openfeint/internal/request/OrderedArgList;Lcom/openfeint/api/resource/User$GetFriendsCB;)V */
/* .line 230 */
/* .local v1, "req":Lcom/openfeint/internal/request/JSONRequest; */
(( com.openfeint.internal.request.JSONRequest ) v1 ).launch ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
/* .line 231 */
return;
} // .end method
public void load ( com.openfeint.api.resource.User$LoadCB p0 ) {
/* .locals 1 */
/* .param p1, "cb" # Lcom/openfeint/api/resource/User$LoadCB; */
/* .prologue */
/* .line 99 */
/* new-instance v0, Lcom/openfeint/api/resource/User$1; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/api/resource/User$1;-><init>(Lcom/openfeint/api/resource/User;Lcom/openfeint/api/resource/User$LoadCB;)V */
/* .line 119 */
/* .local v0, "req":Lcom/openfeint/internal/request/JSONRequest; */
(( com.openfeint.internal.request.JSONRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
/* .line 120 */
return;
} // .end method
public java.lang.String userID ( ) {
/* .locals 1 */
/* .prologue */
/* .line 45 */
(( com.openfeint.api.resource.User ) p0 ).resourceID ( ); // invoke-virtual {p0}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
} // .end method
