public abstract class com.funbox.game.promote.GameAd {
	 /* .source "GameAd.java" */
	 /* # static fields */
	 private static final java.lang.String GAME_AD_FILE_INSTALL;
	 private static final java.lang.String GAME_AD_FILE_SHOW;
	 private static final java.lang.String GAME_AD_IMG_FILE_EXT;
	 private static final java.lang.String GAME_AD_IMG_TEMP_FILE;
	 private static final java.lang.String GAME_AD_PATH;
	 private static final java.lang.String GAME_IMG_URL_HEAD;
	 private static final java.lang.String GAME_LIST_URL;
	 public static final Integer MORE_GAME_ID_NO1;
	 public static final Integer MORE_GAME_ID_NO2;
	 private static final java.lang.String MORE_GAME_URL;
	 public static final Integer NONE_GAME_ID;
	 private static java.lang.String mClickGameIdList;
	 private static java.lang.String mGameAdPath;
	 private static java.lang.String mGameAdXml;
	 private static java.lang.String mInstallGameIdList;
	 private static Integer mLastShowGameId;
	 private static java.lang.String mLastShowGameUrl;
	 private static java.lang.String mMoreGameUrl;
	 private static java.lang.String mMoreGameUrl2;
	 /* # direct methods */
	 public com.funbox.game.promote.GameAd ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 56 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static Boolean access$0 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 168 */
		 v0 = 		 com.funbox.game.promote.GameAd .getGameAdList ( );
	 } // .end method
	 static Integer access$1 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 91 */
	 } // .end method
	 static Boolean access$2 ( Integer p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 617 */
		 v0 = 		 com.funbox.game.promote.GameAd .isGameIdClicked ( p0 );
	 } // .end method
	 static java.lang.String access$3 ( Integer p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 252 */
		 com.funbox.game.promote.GameAd .getGameUrlById ( p0 );
	 } // .end method
	 static void access$4 ( java.lang.String p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 92 */
		 return;
	 } // .end method
	 static void access$5 ( ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 212 */
		 com.funbox.game.promote.GameAd .getAndSetNextGameAd ( );
		 return;
	 } // .end method
	 private static Boolean addGameIdToClickList ( Integer p0 ) {
		 /* .locals 2 */
		 /* .param p0, "gameId" # I */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 628 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* if-ne p0, v0, :cond_0 */
		 /* move v0, v1 */
		 /* .line 639 */
	 } // :goto_0
	 /* .line 630 */
} // :cond_0
if ( p0 != null) { // if-eqz p0, :cond_1
	 /* .line 631 */
	 int v0 = -2; // const/4 v0, -0x2
	 /* if-ne p0, v0, :cond_2 */
} // :cond_1
/* move v0, v1 */
/* .line 632 */
/* .line 635 */
} // :cond_2
v0 = com.funbox.game.promote.GameAd .isGameIdClicked ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* move v0, v1 */
/* .line 636 */
/* .line 638 */
} // :cond_3
v0 = com.funbox.game.promote.GameAd.mClickGameIdList;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( p0 );
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 639 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
private static Boolean addGameIdToInstallList ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "gameId" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 658 */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p0, v0, :cond_0 */
/* move v0, v1 */
/* .line 669 */
} // :goto_0
/* .line 660 */
} // :cond_0
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 661 */
int v0 = -2; // const/4 v0, -0x2
/* if-ne p0, v0, :cond_2 */
} // :cond_1
/* move v0, v1 */
/* .line 662 */
/* .line 665 */
} // :cond_2
v0 = com.funbox.game.promote.GameAd .isGameIdInstalled ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* move v0, v1 */
/* .line 666 */
/* .line 668 */
} // :cond_3
v0 = com.funbox.game.promote.GameAd.mInstallGameIdList;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( p0 );
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 669 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
private static Boolean checkImgFileExistsById ( Integer p0 ) {
/* .locals 5 */
/* .param p0, "gameId" # I */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 284 */
com.funbox.game.promote.GameAd .getLocalImgFullNameById ( p0 );
/* .line 286 */
/* .local v2, "fullName":Ljava/lang/String; */
try { // :try_start_0
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 287 */
/* .local v1, "f":Ljava/io/File; */
(( java.io.File ) v1 ).isFile ( ); // invoke-virtual {v1}, Ljava/io/File;->isFile()Z
/* :try_end_0 */
v3 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v3, :cond_0 */
/* move v3, v4 */
/* .line 295 */
} // .end local v1 # "f":Ljava/io/File;
} // :goto_0
/* .line 291 */
/* :catch_0 */
/* move-exception v3 */
/* move-object v0, v3 */
/* .local v0, "e":Ljava/lang/Exception; */
/* move v3, v4 */
/* .line 292 */
/* .line 295 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* .restart local v1 # "f":Ljava/io/File; */
} // :cond_0
int v3 = 1; // const/4 v3, 0x1
} // .end method
public static Boolean checkShowGameAd ( ) {
/* .locals 4 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
final String v3 = "GameAd"; // const-string v3, "GameAd"
/* .line 576 */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* move v0, v2 */
/* .line 602 */
} // :goto_0
/* .line 579 */
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 580 */
int v1 = -2; // const/4 v1, -0x2
/* if-ne v0, v1, :cond_2 */
} // :cond_1
/* move v0, v2 */
/* .line 581 */
/* .line 585 */
} // :cond_2
v0 = com.funbox.game.promote.GameAd.mLastShowGameUrl;
final String v1 = ""; // const-string v1, ""
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 586 */
final String v0 = "GameAd"; // const-string v0, "GameAd"
final String v0 = "checkShowGameAd():getShowGameUrl() = false"; // const-string v0, "checkShowGameAd():getShowGameUrl() = false"
android.util.Log .v ( v3,v0 );
/* move v0, v2 */
/* .line 587 */
/* .line 591 */
} // :cond_3
v0 = com.funbox.game.promote.GameAd .checkImgFileExistsById ( v0 );
/* if-nez v0, :cond_4 */
/* move v0, v2 */
/* .line 592 */
/* .line 596 */
} // :cond_4
v0 = com.funbox.game.promote.GameAd .isGameIdClicked ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 597 */
final String v0 = "GameAd"; // const-string v0, "GameAd"
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "checkShowGameAd():mLastShowGameId ="; // const-string v1, "checkShowGameAd():mLastShowGameId ="
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v0 );
/* move v0, v2 */
/* .line 598 */
/* .line 600 */
} // :cond_5
final String v0 = "GameAd"; // const-string v0, "GameAd"
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "checkShowGameAd() OK!!, mLastShowGameId ="; // const-string v1, "checkShowGameAd() OK!!, mLastShowGameId ="
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "clickId="; // const-string v1, "clickId="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.funbox.game.promote.GameAd.mClickGameIdList;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v0 );
/* .line 602 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
private static void createPath ( ) {
/* .locals 5 */
/* .prologue */
final String v4 = "GameAd"; // const-string v4, "GameAd"
/* .line 562 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 563 */
/* .local v1, "sdPath":Ljava/lang/String; */
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = java.io.File.separator;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ".droidga"; // const-string v3, ".droidga"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = java.io.File.separator;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 564 */
final String v2 = "GameAd"; // const-string v2, "GameAd"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "createPath(): mGameAdPath="; // const-string v3, "createPath(): mGameAdPath="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = com.funbox.game.promote.GameAd.mGameAdPath;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v2 );
/* .line 566 */
/* new-instance v0, Ljava/io/File; */
v2 = com.funbox.game.promote.GameAd.mGameAdPath;
/* invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 567 */
/* .local v0, "dir":Ljava/io/File; */
v2 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v2, :cond_0 */
/* .line 568 */
v2 = (( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
/* if-nez v2, :cond_0 */
/* .line 569 */
final String v2 = "GameAd"; // const-string v2, "GameAd"
final String v2 = "dir.mkdirs() ....error!"; // const-string v2, "dir.mkdirs() ....error!"
android.util.Log .v ( v4,v2 );
/* .line 572 */
} // :cond_0
return;
} // .end method
public static void doGameAdClick ( ) {
/* .locals 2 */
/* .prologue */
/* .line 547 */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* .line 549 */
com.funbox.game.promote.GameAd .addGameIdToClickList ( v0 );
/* .line 551 */
} // :cond_0
com.funbox.game.promote.GameAd .saveShowParam ( );
/* .line 552 */
return;
} // .end method
private static Boolean downloadImgByGameId ( Integer p0 ) {
/* .locals 8 */
/* .param p0, "gameId" # I */
/* .prologue */
/* .line 358 */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p0, v0, :cond_0 */
/* .line 359 */
int p0 = 0; // const/4 p0, 0x0
/* .line 424 */
} // .end local p0 # "gameId":I
} // :goto_0
/* .line 361 */
/* .restart local p0 # "gameId":I */
} // :cond_0
com.funbox.game.promote.GameAd .getGameImgFileNameById ( p0 );
/* .line 362 */
/* .local v0, "imgFile":Ljava/lang/String; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "http://www.gamecenter.me/wbc_game_ad/funbox/"; // const-string v2, "http://www.gamecenter.me/wbc_game_ad/funbox/"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end local v0 # "imgFile":Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 367 */
/* .local v1, "url":Ljava/lang/String; */
/* new-instance v0, Lcom/funbox/game/promote/MyHttp; */
/* invoke-direct {v0}, Lcom/funbox/game/promote/MyHttp;-><init>()V */
/* .line 368 */
/* .local v0, "myHttp":Lcom/funbox/game/promote/MyHttp; */
int v2 = 0; // const/4 v2, 0x0
(( com.funbox.game.promote.MyHttp ) v0 ).doGet ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/funbox/game/promote/MyHttp;->doGet(Ljava/lang/String;Ljava/util/Map;)Ljava/io/InputStream;
/* .line 369 */
/* .local v2, "in":Ljava/io/InputStream; */
/* if-nez v2, :cond_1 */
/* .line 371 */
int p0 = 0; // const/4 p0, 0x0
/* .line 374 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 376 */
/* .local v0, "save":Ljava/io/FileOutputStream; */
/* new-instance v1, Ljava/lang/StringBuilder; */
} // .end local v1 # "url":Ljava/lang/String;
v3 = com.funbox.game.promote.GameAd.mGameAdPath;
java.lang.String .valueOf ( v3 );
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "_ad.p"; // const-string v3, "_ad.p"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 377 */
/* .local v1, "fullName":Ljava/lang/String; */
int v3 = 1; // const/4 v3, 0x1
/* .line 379 */
/* .local v3, "isOk":Z */
try { // :try_start_0
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 380 */
/* .local v4, "sb":Ljava/lang/StringBuffer; */
/* new-instance v5, Ljava/io/FileOutputStream; */
/* invoke-direct {v5, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 383 */
} // .end local v0 # "save":Ljava/io/FileOutputStream;
/* .local v5, "save":Ljava/io/FileOutputStream; */
/* const/16 v0, 0x2000 */
try { // :try_start_1
/* new-array v0, v0, [B */
/* .line 384 */
} // .end local v4 # "sb":Ljava/lang/StringBuffer;
/* .local v0, "buf":[B */
} // :goto_1
v4 = (( java.io.InputStream ) v2 ).read ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I
/* .local v4, "len":I */
int v6 = -1; // const/4 v6, -0x1
/* if-ne v4, v6, :cond_4 */
/* .line 393 */
(( java.io.FileOutputStream ) v5 ).flush ( ); // invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
/* .line 394 */
final String v0 = "GameAd"; // const-string v0, "GameAd"
} // .end local v0 # "buf":[B
final String v2 = "downloadImgFile()....ok"; // const-string v2, "downloadImgFile()....ok"
} // .end local v2 # "in":Ljava/io/InputStream;
android.util.Log .v ( v0,v2 );
/* :try_end_1 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_1 ..:try_end_1} :catch_8 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_7 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 402 */
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 404 */
try { // :try_start_2
(( java.io.FileOutputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_6 */
/* move v2, v3 */
} // .end local v3 # "isOk":Z
/* .local v2, "isOk":Z */
/* move-object v0, v5 */
/* .line 411 */
} // .end local v4 # "len":I
} // .end local v5 # "save":Ljava/io/FileOutputStream;
/* .local v0, "save":Ljava/io/FileOutputStream; */
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 413 */
com.funbox.game.promote.GameAd .getLocalImgFullNameById ( p0 );
/* .line 414 */
/* .local p0, "destName":Ljava/lang/String; */
/* new-instance v0, Ljava/io/File; */
} // .end local v0 # "save":Ljava/io/FileOutputStream;
/* invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 415 */
/* .local v0, "f":Ljava/io/File; */
v3 = (( java.io.File ) v0 ).isFile ( ); // invoke-virtual {v0}, Ljava/io/File;->isFile()Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 416 */
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
/* .line 419 */
} // :cond_2
/* new-instance v0, Ljava/io/File; */
} // .end local v0 # "f":Ljava/io/File;
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 420 */
/* .local v0, "f2":Ljava/io/File; */
v1 = (( java.io.File ) v0 ).isFile ( ); // invoke-virtual {v0}, Ljava/io/File;->isFile()Z
} // .end local v1 # "fullName":Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 421 */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v0 ).renameTo ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
} // .end local v0 # "f2":Ljava/io/File;
} // .end local p0 # "destName":Ljava/lang/String;
} // :cond_3
/* move p0, v2 */
/* .line 424 */
/* goto/16 :goto_0 */
/* .line 386 */
/* .local v0, "buf":[B */
/* .restart local v1 # "fullName":Ljava/lang/String; */
/* .local v2, "in":Ljava/io/InputStream; */
/* .restart local v3 # "isOk":Z */
/* .restart local v4 # "len":I */
/* .restart local v5 # "save":Ljava/io/FileOutputStream; */
/* .local p0, "gameId":I */
} // :cond_4
int v6 = 0; // const/4 v6, 0x0
try { // :try_start_3
(( java.io.FileOutputStream ) v5 ).write ( v0, v6, v4 ); // invoke-virtual {v5, v0, v6, v4}, Ljava/io/FileOutputStream;->write([BII)V
/* :try_end_3 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_3 ..:try_end_3} :catch_8 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_7 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* .line 388 */
/* const-wide/16 v6, 0x14 */
try { // :try_start_4
java.lang.Thread .sleep ( v6,v7 );
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_4 ..:try_end_4} :catch_8 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* .line 389 */
/* :catch_0 */
/* move-exception v4 */
/* .line 395 */
} // .end local v4 # "len":I
} // .end local v5 # "save":Ljava/io/FileOutputStream;
/* .local v0, "save":Ljava/io/FileOutputStream; */
/* :catch_1 */
/* move-exception v2 */
/* move-object v3, v0 */
} // .end local v0 # "save":Ljava/io/FileOutputStream;
/* .local v3, "save":Ljava/io/FileOutputStream; */
/* move-object v0, v2 */
/* .line 396 */
} // .end local v2 # "in":Ljava/io/InputStream;
/* .local v0, "e":Ljava/io/FileNotFoundException; */
} // :goto_3
int v2 = 0; // const/4 v2, 0x0
/* .line 397 */
/* .local v2, "isOk":Z */
try { // :try_start_5
(( java.io.FileNotFoundException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
/* .line 402 */
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 404 */
try { // :try_start_6
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_2 */
/* move-object v0, v3 */
} // .end local v3 # "save":Ljava/io/FileOutputStream;
/* .local v0, "save":Ljava/io/FileOutputStream; */
/* .line 405 */
/* .local v0, "e":Ljava/io/FileNotFoundException; */
/* .restart local v3 # "save":Ljava/io/FileOutputStream; */
/* :catch_2 */
/* move-exception v0 */
/* .line 406 */
/* .local v0, "e":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* move-object v0, v3 */
} // .end local v3 # "save":Ljava/io/FileOutputStream;
/* .local v0, "save":Ljava/io/FileOutputStream; */
/* .line 398 */
/* .local v2, "in":Ljava/io/InputStream; */
/* .local v3, "isOk":Z */
/* :catch_3 */
/* move-exception v2 */
/* move-object v3, v0 */
} // .end local v0 # "save":Ljava/io/FileOutputStream;
/* .local v3, "save":Ljava/io/FileOutputStream; */
/* move-object v0, v2 */
/* .line 399 */
} // .end local v2 # "in":Ljava/io/InputStream;
/* .local v0, "e":Ljava/lang/Exception; */
} // :goto_4
int v2 = 0; // const/4 v2, 0x0
/* .line 400 */
/* .local v2, "isOk":Z */
try { // :try_start_7
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_2 */
/* .line 402 */
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 404 */
try { // :try_start_8
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* :try_end_8 */
/* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_4 */
/* move-object v0, v3 */
} // .end local v3 # "save":Ljava/io/FileOutputStream;
/* .local v0, "save":Ljava/io/FileOutputStream; */
/* .line 405 */
/* .local v0, "e":Ljava/lang/Exception; */
/* .restart local v3 # "save":Ljava/io/FileOutputStream; */
/* :catch_4 */
/* move-exception v0 */
/* .line 406 */
/* .local v0, "e":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* move-object v0, v3 */
} // .end local v3 # "save":Ljava/io/FileOutputStream;
/* .local v0, "save":Ljava/io/FileOutputStream; */
/* .line 401 */
/* .local v2, "in":Ljava/io/InputStream; */
/* .local v3, "isOk":Z */
/* :catchall_0 */
/* move-exception p0 */
/* move-object v1, p0 */
/* move p0, v3 */
/* .line 402 */
} // .end local v1 # "fullName":Ljava/lang/String;
} // .end local v2 # "in":Ljava/io/InputStream;
} // .end local v3 # "isOk":Z
/* .local p0, "isOk":Z */
} // :goto_5
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 404 */
try { // :try_start_9
(( java.io.FileOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_5 */
/* .line 409 */
} // .end local p0 # "isOk":Z
} // :cond_5
} // :goto_6
/* throw v1 */
/* .line 405 */
/* .restart local p0 # "isOk":Z */
/* :catch_5 */
/* move-exception p0 */
/* .line 406 */
/* .local p0, "e":Ljava/io/IOException; */
(( java.io.IOException ) p0 ).printStackTrace ( ); // invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V
/* .line 405 */
} // .end local v0 # "save":Ljava/io/FileOutputStream;
/* .restart local v1 # "fullName":Ljava/lang/String; */
/* .restart local v3 # "isOk":Z */
/* .restart local v4 # "len":I */
/* .restart local v5 # "save":Ljava/io/FileOutputStream; */
/* .local p0, "gameId":I */
/* :catch_6 */
/* move-exception v0 */
/* .line 406 */
/* .local v0, "e":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
} // .end local v0 # "e":Ljava/io/IOException;
} // :cond_6
/* move v2, v3 */
} // .end local v3 # "isOk":Z
/* .local v2, "isOk":Z */
/* move-object v0, v5 */
} // .end local v5 # "save":Ljava/io/FileOutputStream;
/* .local v0, "save":Ljava/io/FileOutputStream; */
/* .line 401 */
} // .end local v0 # "save":Ljava/io/FileOutputStream;
} // .end local v2 # "isOk":Z
} // .end local v4 # "len":I
/* .restart local v3 # "isOk":Z */
/* .restart local v5 # "save":Ljava/io/FileOutputStream; */
/* :catchall_1 */
/* move-exception p0 */
/* move-object v1, p0 */
/* move-object v0, v5 */
} // .end local v5 # "save":Ljava/io/FileOutputStream;
/* .restart local v0 # "save":Ljava/io/FileOutputStream; */
/* move p0, v3 */
} // .end local v3 # "isOk":Z
/* .local p0, "isOk":Z */
} // .end local v0 # "save":Ljava/io/FileOutputStream;
/* .restart local v2 # "isOk":Z */
/* .local v3, "save":Ljava/io/FileOutputStream; */
/* .local p0, "gameId":I */
/* :catchall_2 */
/* move-exception p0 */
/* move-object v1, p0 */
/* move-object v0, v3 */
} // .end local v3 # "save":Ljava/io/FileOutputStream;
/* .restart local v0 # "save":Ljava/io/FileOutputStream; */
/* move p0, v2 */
} // .end local v2 # "isOk":Z
/* .local p0, "isOk":Z */
/* .line 398 */
} // .end local v0 # "save":Ljava/io/FileOutputStream;
/* .local v3, "isOk":Z */
/* .restart local v5 # "save":Ljava/io/FileOutputStream; */
/* .local p0, "gameId":I */
/* :catch_7 */
/* move-exception v0 */
/* move-object v3, v5 */
} // .end local v5 # "save":Ljava/io/FileOutputStream;
/* .local v3, "save":Ljava/io/FileOutputStream; */
/* .line 395 */
/* .local v3, "isOk":Z */
/* .restart local v5 # "save":Ljava/io/FileOutputStream; */
/* :catch_8 */
/* move-exception v0 */
/* move-object v3, v5 */
} // .end local v5 # "save":Ljava/io/FileOutputStream;
/* .local v3, "save":Ljava/io/FileOutputStream; */
/* .restart local v2 # "isOk":Z */
} // :cond_7
/* move-object v0, v3 */
} // .end local v3 # "save":Ljava/io/FileOutputStream;
/* .restart local v0 # "save":Ljava/io/FileOutputStream; */
/* goto/16 :goto_2 */
} // .end method
public static void end ( ) {
/* .locals 0 */
/* .prologue */
/* .line 128 */
return;
} // .end method
private static void getAndSetNextGameAd ( ) {
/* .locals 8 */
/* .prologue */
int v6 = -1; // const/4 v6, -0x1
final String v7 = ""; // const-string v7, ""
/* .line 213 */
v0 = com.funbox.game.promote.GameAd .getNextGameId ( );
/* .line 214 */
/* .local v0, "gameId":I */
final String v3 = "GameAd"; // const-string v3, "GameAd"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "work():gameId="; // const-string v5, "work():gameId="
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 215 */
/* if-ne v0, v6, :cond_0 */
/* .line 217 */
/* .line 218 */
final String v3 = ""; // const-string v3, ""
/* .line 220 */
com.funbox.game.promote.GameAd .saveShowParam ( );
/* .line 227 */
} // :cond_0
com.funbox.game.promote.GameAd .getGameUrlById ( v0 );
/* .line 228 */
/* .local v1, "gameUrl":Ljava/lang/String; */
final String v3 = ""; // const-string v3, ""
v3 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 248 */
} // :cond_1
} // :goto_0
return;
/* .line 231 */
} // :cond_2
/* .line 232 */
/* .line 235 */
v3 = com.funbox.game.promote.GameAd .checkImgFileExistsById ( v0 );
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 237 */
com.funbox.game.promote.GameAd .saveShowParam ( );
/* .line 243 */
} // :cond_3
v2 = com.funbox.game.promote.GameAd .downloadImgByGameId ( v0 );
/* .line 244 */
/* .local v2, "isOk":Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 246 */
com.funbox.game.promote.GameAd .saveShowParam ( );
} // .end method
private static Boolean getGameAdList ( ) {
/* .locals 12 */
/* .prologue */
int v9 = 0; // const/4 v9, 0x0
final String v11 = ""; // const-string v11, ""
final String v10 = "GameAd"; // const-string v10, "GameAd"
/* .line 172 */
/* new-instance v5, Lcom/funbox/game/promote/MyHttp; */
/* invoke-direct {v5}, Lcom/funbox/game/promote/MyHttp;-><init>()V */
/* .line 173 */
/* .local v5, "myHttp":Lcom/funbox/game/promote/MyHttp; */
final String v7 = "http://www.gamecenter.me/wbc_game_ad/funbox/game_list.txt"; // const-string v7, "http://www.gamecenter.me/wbc_game_ad/funbox/game_list.txt"
int v8 = 0; // const/4 v8, 0x0
(( com.funbox.game.promote.MyHttp ) v5 ).doGet ( v7, v8 ); // invoke-virtual {v5, v7, v8}, Lcom/funbox/game/promote/MyHttp;->doGet(Ljava/lang/String;Ljava/util/Map;)Ljava/io/InputStream;
/* .line 174 */
/* .local v2, "in":Ljava/io/InputStream; */
/* if-nez v2, :cond_0 */
/* .line 175 */
final String v7 = "GameAd"; // const-string v7, "GameAd"
final String v7 = "work(): in = null"; // const-string v7, "work(): in = null"
android.util.Log .v ( v10,v7 );
/* move v7, v9 */
/* .line 209 */
} // :goto_0
/* .line 181 */
} // :cond_0
/* const/16 v7, 0x200 */
try { // :try_start_0
/* new-array v0, v7, [B */
/* .line 184 */
/* .local v0, "buf":[B */
} // :goto_1
(( java.io.InputStream ) v2 ).read ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I
/* :try_end_0 */
v3 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .local v3, "len":I */
int v7 = -1; // const/4 v7, -0x1
/* if-ne v3, v7, :cond_3 */
/* .line 194 */
v7 = com.funbox.game.promote.GameAd.mGameAdXml;
com.funbox.game.promote.GameAd .removeEnter ( v7 );
/* .line 195 */
final String v7 = "GameAd"; // const-string v7, "GameAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "work():GameAdXml="; // const-string v8, "work():GameAdXml="
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v8 = com.funbox.game.promote.GameAd.mGameAdXml;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v10,v7 );
/* .line 199 */
com.funbox.game.promote.GameAd .getGameUrlById ( v9 );
/* .line 200 */
/* .local v4, "moreUrl":Ljava/lang/String; */
final String v7 = ""; // const-string v7, ""
v7 = (( java.lang.String ) v4 ).equals ( v11 ); // invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_1 */
/* .line 201 */
/* .line 204 */
} // :cond_1
int v7 = -2; // const/4 v7, -0x2
com.funbox.game.promote.GameAd .getGameUrlById ( v7 );
/* .line 205 */
final String v7 = ""; // const-string v7, ""
v7 = (( java.lang.String ) v4 ).equals ( v11 ); // invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_2 */
/* .line 206 */
/* .line 209 */
} // :cond_2
int v7 = 1; // const/4 v7, 0x1
/* .line 185 */
} // .end local v4 # "moreUrl":Ljava/lang/String;
} // :cond_3
try { // :try_start_1
/* new-instance v6, Ljava/lang/String; */
/* invoke-direct {v6, v0}, Ljava/lang/String;-><init>([B)V */
/* .line 186 */
/* .local v6, "temp":Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
(( java.lang.String ) v6 ).substring ( v7, v3 ); // invoke-virtual {v6, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 187 */
v7 = com.funbox.game.promote.GameAd.mGameAdXml;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 189 */
} // .end local v0 # "buf":[B
} // .end local v3 # "len":I
} // .end local v6 # "temp":Ljava/lang/String;
/* :catch_0 */
/* move-exception v7 */
/* move-object v1, v7 */
/* .line 190 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v7 = "GameAd"; // const-string v7, "GameAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "work(): exception:"; // const-string v8, "work(): exception:"
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v10,v7 );
/* move v7, v9 */
/* .line 191 */
/* goto/16 :goto_0 */
} // .end method
private static java.lang.String getGameImgFileNameById ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "gameId" # I */
/* .prologue */
/* .line 274 */
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.Integer .toString ( p0 );
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = ".jpg"; // const-string v1, ".jpg"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
private static java.lang.String getGameUrlById ( Integer p0 ) {
/* .locals 7 */
/* .param p0, "gameId" # I */
/* .prologue */
final String v6 = "#"; // const-string v6, "#"
/* .line 257 */
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "#"; // const-string v5, "#"
/* invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( p0 );
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "#"; // const-string v5, "#"
(( java.lang.StringBuilder ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 258 */
/* .local v1, "findKey":Ljava/lang/String; */
v4 = com.funbox.game.promote.GameAd.mGameAdXml;
v2 = (( java.lang.String ) v4 ).indexOf ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 259 */
/* .local v2, "start":I */
/* if-gez v2, :cond_0 */
/* .line 261 */
final String v4 = ""; // const-string v4, ""
/* .line 270 */
} // :goto_0
/* .line 264 */
} // :cond_0
v4 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/2addr v2, v4 */
/* .line 265 */
v4 = com.funbox.game.promote.GameAd.mGameAdXml;
final String v5 = "\n"; // const-string v5, "\n"
v0 = (( java.lang.String ) v4 ).indexOf ( v5, v2 ); // invoke-virtual {v4, v5, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
/* .line 266 */
/* .local v0, "end":I */
/* if-gtz v0, :cond_1 */
/* .line 267 */
v4 = com.funbox.game.promote.GameAd.mGameAdXml;
v0 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* .line 268 */
} // :cond_1
v4 = com.funbox.game.promote.GameAd.mGameAdXml;
(( java.lang.String ) v4 ).substring ( v2, v0 ); // invoke-virtual {v4, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .local v3, "url":Ljava/lang/String; */
/* move-object v4, v3 */
/* .line 270 */
} // .end method
public static java.lang.String getLocalImgFullNameById ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "gameId" # I */
/* .prologue */
/* .line 279 */
/* new-instance v1, Ljava/lang/StringBuilder; */
v2 = com.funbox.game.promote.GameAd.mGameAdPath;
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( p0 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ".p"; // const-string v2, ".p"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 280 */
/* .local v0, "fullName":Ljava/lang/String; */
} // .end method
public static java.lang.String getMoreGameUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 131 */
v0 = com.funbox.game.promote.GameAd.mMoreGameUrl;
} // .end method
public static java.lang.String getMoreGameUrl2 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 134 */
v0 = com.funbox.game.promote.GameAd.mMoreGameUrl2;
} // .end method
private static Integer getNextGameId ( ) {
/* .locals 8 */
/* .prologue */
final String v7 = "GameAd"; // const-string v7, "GameAd"
/* .line 308 */
v5 = com.funbox.game.promote.GameAd.mGameAdXml;
final String v6 = "\n"; // const-string v6, "\n"
v0 = (( java.lang.String ) v5 ).indexOf ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 309 */
/* .local v0, "end":I */
/* if-gtz v0, :cond_0 */
/* .line 310 */
int v5 = -1; // const/4 v5, -0x1
/* .line 345 */
} // :goto_0
/* .line 312 */
} // :cond_0
v5 = com.funbox.game.promote.GameAd.mGameAdXml;
int v6 = 0; // const/4 v6, 0x0
(( java.lang.String ) v5 ).substring ( v6, v0 ); // invoke-virtual {v5, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 313 */
/* .local v2, "line":Ljava/lang/String; */
final String v5 = "GameAd"; // const-string v5, "GameAd"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "getNextGameId():line="; // const-string v6, "getNextGameId():line="
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v7,v5 );
/* .line 316 */
int v1 = -1; // const/4 v1, -0x1
/* .line 317 */
/* .local v1, "id":I */
int v4 = 0; // const/4 v4, 0x0
/* .line 319 */
/* .local v4, "start":I */
} // :goto_1
final String v5 = ","; // const-string v5, ","
v0 = (( java.lang.String ) v2 ).indexOf ( v5, v4 ); // invoke-virtual {v2, v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
/* .line 322 */
/* if-gtz v0, :cond_2 */
/* .line 323 */
int v1 = -1; // const/4 v1, -0x1
} // :cond_1
} // :goto_2
/* move v5, v1 */
/* .line 345 */
/* .line 327 */
} // :cond_2
(( java.lang.String ) v2 ).substring ( v4, v0 ); // invoke-virtual {v2, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 328 */
/* .local v3, "sGameId":Ljava/lang/String; */
final String v5 = "GameAd"; // const-string v5, "GameAd"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "getNextGameId(): gameId="; // const-string v6, "getNextGameId(): gameId="
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v7,v5 );
/* .line 329 */
final String v5 = ""; // const-string v5, ""
v5 = (( java.lang.String ) v3 ).equals ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 330 */
int v1 = -1; // const/4 v1, -0x1
/* .line 331 */
/* .line 334 */
} // :cond_3
v1 = com.funbox.game.promote.GameAd .strToGameId ( v3 );
/* .line 335 */
v5 = com.funbox.game.promote.GameAd .isGameIdInstalled ( v1 );
/* if-nez v5, :cond_4 */
v5 = com.funbox.game.promote.GameAd .isGameIdClicked ( v1 );
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 339 */
} // :cond_4
/* add-int/lit8 v4, v0, 0x1 */
/* .line 318 */
} // .end method
public static Integer getShowGameId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 558 */
} // .end method
public static java.lang.String getShowGameUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 555 */
v0 = com.funbox.game.promote.GameAd.mLastShowGameUrl;
} // .end method
public static void init ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "curGameId" # I */
/* .prologue */
final String v3 = "market://search?q=pub:\"FunBox\""; // const-string v3, "market://search?q=pub:\"FunBox\""
final String v2 = ""; // const-string v2, ""
/* .line 100 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 101 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 102 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 104 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 105 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 106 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 107 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 110 */
com.funbox.game.promote.GameAd .createPath ( );
/* .line 112 */
com.funbox.game.promote.GameAd .loadShowParam ( );
/* .line 113 */
com.funbox.game.promote.GameAd .loadInstallParam ( );
/* .line 115 */
final String v0 = "market://search?q=pub:\"FunBox\""; // const-string v0, "market://search?q=pub:\"FunBox\""
/* .line 116 */
final String v0 = "market://search?q=pub:\"FunBox\""; // const-string v0, "market://search?q=pub:\"FunBox\""
/* .line 117 */
v0 = com.funbox.game.promote.GameAd .isGameIdInstalled ( p0 );
/* if-nez v0, :cond_0 */
/* .line 118 */
com.funbox.game.promote.GameAd .addGameIdToInstallList ( p0 );
/* .line 119 */
com.funbox.game.promote.GameAd .saveInstallParam ( );
/* .line 122 */
} // :cond_0
com.funbox.game.promote.GameAd .work ( );
/* .line 123 */
final String v0 = "GameAd"; // const-string v0, "GameAd"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "init(): lastShowGameId="; // const-string v2, "init(): lastShowGameId="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ",clickId="; // const-string v2, ",clickId="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = com.funbox.game.promote.GameAd.mClickGameIdList;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 124 */
return;
} // .end method
private static Boolean isGameIdClicked ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "gameId" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 618 */
int v1 = -1; // const/4 v1, -0x1
/* if-ne p0, v1, :cond_0 */
/* move v1, v3 */
/* .line 625 */
} // :goto_0
/* .line 621 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.Integer .toString ( p0 );
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = ","; // const-string v2, ","
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 622 */
/* .local v0, "str":Ljava/lang/String; */
v1 = com.funbox.game.promote.GameAd.mClickGameIdList;
v1 = (( java.lang.String ) v1 ).indexOf ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* if-ltz v1, :cond_1 */
/* .line 623 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
/* move v1, v3 */
/* .line 625 */
} // .end method
private static Boolean isGameIdInstalled ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "gameId" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 644 */
int v1 = -1; // const/4 v1, -0x1
/* if-ne p0, v1, :cond_0 */
/* move v1, v3 */
/* .line 655 */
} // :goto_0
/* .line 646 */
} // :cond_0
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 647 */
int v1 = -2; // const/4 v1, -0x2
/* if-ne p0, v1, :cond_2 */
} // :cond_1
/* move v1, v3 */
/* .line 648 */
/* .line 651 */
} // :cond_2
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.Integer .toString ( p0 );
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = ","; // const-string v2, ","
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 652 */
/* .local v0, "str":Ljava/lang/String; */
v1 = com.funbox.game.promote.GameAd.mInstallGameIdList;
v1 = (( java.lang.String ) v1 ).indexOf ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* if-ltz v1, :cond_3 */
/* .line 653 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
/* move v1, v3 */
/* .line 655 */
} // .end method
private static void loadInstallParam ( ) {
/* .locals 6 */
/* .prologue */
final String v5 = ""; // const-string v5, ""
/* .line 478 */
final String v4 = ""; // const-string v4, ""
/* .line 480 */
try { // :try_start_0
/* new-instance v2, Ljava/io/File; */
/* new-instance v4, Ljava/lang/StringBuilder; */
v5 = com.funbox.game.promote.GameAd.mGameAdPath;
java.lang.String .valueOf ( v5 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = "gad_install"; // const-string v5, "gad_install"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 481 */
/* .local v2, "readFile":Ljava/io/File; */
/* new-instance v0, Ljava/io/BufferedReader; */
/* .line 482 */
/* new-instance v4, Ljava/io/FileReader; */
/* invoke-direct {v4, v2}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V */
/* .line 481 */
/* invoke-direct {v0, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
/* .line 484 */
/* .local v0, "br":Ljava/io/BufferedReader; */
final String v3 = ""; // const-string v3, ""
/* .line 485 */
/* .local v3, "txt":Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .line 486 */
/* .local v1, "lineIdx":I */
} // :goto_0
(( java.io.BufferedReader ) v0 ).readLine ( ); // invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* if-nez v3, :cond_1 */
/* .line 496 */
} // :cond_0
(( java.io.BufferedReader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
/* .line 503 */
} // .end local v0 # "br":Ljava/io/BufferedReader;
} // .end local v1 # "lineIdx":I
} // .end local v2 # "readFile":Ljava/io/File;
} // .end local v3 # "txt":Ljava/lang/String;
} // :goto_1
return;
/* .line 487 */
/* .restart local v0 # "br":Ljava/io/BufferedReader; */
/* .restart local v1 # "lineIdx":I */
/* .restart local v2 # "readFile":Ljava/io/File; */
/* .restart local v3 # "txt":Ljava/lang/String; */
} // :cond_1
com.funbox.game.promote.GameAd .removeEnter ( v3 );
/* .line 488 */
/* if-nez v1, :cond_0 */
/* .line 489 */
final String v4 = "\n"; // const-string v4, "\n"
final String v5 = ""; // const-string v5, ""
(( java.lang.String ) v3 ).replace ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 494 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 500 */
} // .end local v0 # "br":Ljava/io/BufferedReader;
} // .end local v1 # "lineIdx":I
} // .end local v2 # "readFile":Ljava/io/File;
} // .end local v3 # "txt":Ljava/lang/String;
/* :catchall_0 */
/* move-exception v4 */
/* .line 502 */
/* throw v4 */
/* .line 498 */
/* :catch_0 */
/* move-exception v4 */
} // .end method
private static void loadShowParam ( ) {
/* .locals 7 */
/* .prologue */
final String v5 = ""; // const-string v5, ""
/* .line 434 */
int v4 = -1; // const/4 v4, -0x1
/* .line 435 */
final String v4 = ""; // const-string v4, ""
/* .line 437 */
try { // :try_start_0
/* new-instance v2, Ljava/io/File; */
/* new-instance v4, Ljava/lang/StringBuilder; */
v5 = com.funbox.game.promote.GameAd.mGameAdPath;
java.lang.String .valueOf ( v5 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = "gad_funbox"; // const-string v5, "gad_funbox"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 438 */
/* .local v2, "readFile":Ljava/io/File; */
/* new-instance v0, Ljava/io/BufferedReader; */
/* .line 439 */
/* new-instance v4, Ljava/io/FileReader; */
/* invoke-direct {v4, v2}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V */
/* .line 438 */
/* invoke-direct {v0, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
/* .line 441 */
/* .local v0, "br":Ljava/io/BufferedReader; */
final String v3 = ""; // const-string v3, ""
/* .line 442 */
/* .local v3, "txt":Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .line 443 */
/* .local v1, "lineIdx":I */
} // :goto_0
(( java.io.BufferedReader ) v0 ).readLine ( ); // invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* if-nez v3, :cond_1 */
/* .line 463 */
} // :cond_0
(( java.io.BufferedReader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 471 */
} // .end local v0 # "br":Ljava/io/BufferedReader;
} // .end local v1 # "lineIdx":I
} // .end local v2 # "readFile":Ljava/io/File;
} // .end local v3 # "txt":Ljava/lang/String;
} // :goto_1
final String v4 = "GameAd"; // const-string v4, "GameAd"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "showId="; // const-string v6, "showId="
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v6 = ",clickId="; // const-string v6, ",clickId="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = com.funbox.game.promote.GameAd.mClickGameIdList;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v5 );
/* .line 472 */
return;
/* .line 444 */
/* .restart local v0 # "br":Ljava/io/BufferedReader; */
/* .restart local v1 # "lineIdx":I */
/* .restart local v2 # "readFile":Ljava/io/File; */
/* .restart local v3 # "txt":Ljava/lang/String; */
} // :cond_1
try { // :try_start_1
com.funbox.game.promote.GameAd .removeEnter ( v3 );
/* .line 445 */
/* if-nez v1, :cond_2 */
/* .line 446 */
v4 = com.funbox.game.promote.GameAd .strToGameId ( v3 );
/* .line 461 */
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 447 */
} // :cond_2
int v4 = 1; // const/4 v4, 0x1
/* if-ne v1, v4, :cond_0 */
/* .line 448 */
final String v4 = "\n"; // const-string v4, "\n"
final String v5 = ""; // const-string v5, ""
(( java.lang.String ) v3 ).replace ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 465 */
} // .end local v0 # "br":Ljava/io/BufferedReader;
} // .end local v1 # "lineIdx":I
} // .end local v2 # "readFile":Ljava/io/File;
} // .end local v3 # "txt":Ljava/lang/String;
/* :catch_0 */
/* move-exception v4 */
/* .line 467 */
/* :catchall_0 */
/* move-exception v4 */
/* .line 469 */
/* throw v4 */
} // .end method
private static java.lang.String removeEnter ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 350 */
final String v1 = "\r\n"; // const-string v1, "\r\n"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) p0 ).replace ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 351 */
/* .local v0, "temp":Ljava/lang/String; */
} // .end method
private static void saveInstallParam ( ) {
/* .locals 7 */
/* .prologue */
final String v3 = "\n"; // const-string v3, "\n"
/* .line 509 */
try { // :try_start_0
/* new-instance v2, Ljava/io/File; */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.funbox.game.promote.GameAd.mGameAdPath;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "gad_install"; // const-string v4, "gad_install"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 510 */
/* .local v2, "writeFile":Ljava/io/File; */
/* new-instance v0, Ljava/io/BufferedWriter; */
/* .line 511 */
/* new-instance v3, Ljava/io/FileWriter; */
/* invoke-direct {v3, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V */
/* .line 510 */
/* invoke-direct {v0, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V */
/* .line 515 */
/* .local v0, "bw":Ljava/io/BufferedWriter; */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.funbox.game.promote.GameAd.mInstallGameIdList;
final String v5 = "\n"; // const-string v5, "\n"
final String v6 = ""; // const-string v6, ""
(( java.lang.String ) v4 ).replace ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "\n"; // const-string v4, "\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 516 */
/* .local v1, "temp":Ljava/lang/String; */
(( java.io.BufferedWriter ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 517 */
(( java.io.BufferedWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 522 */
} // .end local v0 # "bw":Ljava/io/BufferedWriter;
} // .end local v1 # "temp":Ljava/lang/String;
} // .end local v2 # "writeFile":Ljava/io/File;
} // :goto_0
return;
/* .line 518 */
/* :catch_0 */
/* move-exception v3 */
} // .end method
private static void saveShowParam ( ) {
/* .locals 7 */
/* .prologue */
final String v3 = "\n"; // const-string v3, "\n"
/* .line 528 */
try { // :try_start_0
/* new-instance v2, Ljava/io/File; */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.funbox.game.promote.GameAd.mGameAdPath;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "gad_funbox"; // const-string v4, "gad_funbox"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 529 */
/* .local v2, "writeFile":Ljava/io/File; */
/* new-instance v0, Ljava/io/BufferedWriter; */
/* .line 530 */
/* new-instance v3, Ljava/io/FileWriter; */
/* invoke-direct {v3, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V */
/* .line 529 */
/* invoke-direct {v0, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V */
/* .line 534 */
/* .local v0, "bw":Ljava/io/BufferedWriter; */
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.Integer .toString ( v4 );
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "\n"; // const-string v4, "\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 535 */
/* .local v1, "temp":Ljava/lang/String; */
(( java.io.BufferedWriter ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 537 */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.funbox.game.promote.GameAd.mClickGameIdList;
final String v5 = "\n"; // const-string v5, "\n"
final String v6 = ""; // const-string v6, ""
(( java.lang.String ) v4 ).replace ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "\n"; // const-string v4, "\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 538 */
(( java.io.BufferedWriter ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 539 */
(( java.io.BufferedWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 544 */
} // .end local v0 # "bw":Ljava/io/BufferedWriter;
} // .end local v1 # "temp":Ljava/lang/String;
} // .end local v2 # "writeFile":Ljava/io/File;
} // :goto_0
return;
/* .line 540 */
/* :catch_0 */
/* move-exception v3 */
} // .end method
private static Integer strToGameId ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 608 */
try { // :try_start_0
java.lang.Integer .parseInt ( p0 );
/* :try_end_0 */
v1 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 613 */
/* .local v1, "gameId":I */
} // :goto_0
/* .line 609 */
} // .end local v1 # "gameId":I
/* :catch_0 */
/* move-exception v0 */
/* .line 610 */
/* .local v0, "e":Ljava/lang/Exception; */
int v1 = -1; // const/4 v1, -0x1
/* .restart local v1 # "gameId":I */
} // .end method
private static void work ( ) {
/* .locals 1 */
/* .prologue */
/* .line 139 */
/* new-instance v0, Lcom/funbox/game/promote/GameAd$1; */
/* invoke-direct {v0}, Lcom/funbox/game/promote/GameAd$1;-><init>()V */
/* .line 164 */
(( com.funbox.game.promote.GameAd$1 ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/funbox/game/promote/GameAd$1;->start()V
/* .line 165 */
return;
} // .end method
