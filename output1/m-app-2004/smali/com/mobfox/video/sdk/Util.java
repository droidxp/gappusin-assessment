public class com.mobfox.video.sdk.Util {
	 /* .source "Util.java" */
	 /* # static fields */
	 private static Integer sFadeInAnimationId;
	 private static Integer sFadeOutAnimationId;
	 private static Integer sSlideInBottomAnimationId;
	 private static Integer sSlideInLeftAnimationId;
	 private static Integer sSlideInRightAnimationId;
	 private static Integer sSlideInTopAnimationId;
	 private static Integer sSlideOutBottomAnimationId;
	 private static Integer sSlideOutLeftAnimationId;
	 private static Integer sSlideOutRightAnimationId;
	 private static Integer sSlideOutTopAnimationId;
	 /* # direct methods */
	 static com.mobfox.video.sdk.Util ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 38 */
		 /* .line 39 */
		 /* .line 40 */
		 /* .line 41 */
		 /* .line 42 */
		 /* .line 43 */
		 /* .line 44 */
		 /* .line 45 */
		 /* .line 46 */
		 /* .line 47 */
		 /* .line 37 */
		 return;
	 } // .end method
	 public com.mobfox.video.sdk.Util ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.mobfox.video.sdk.RichMediaAdData buildTestAd ( Integer p0 ) {
		 /* .locals 14 */
		 /* .param p0, "type" # I */
		 /* .prologue */
		 int v10 = 5; // const/4 v10, 0x5
		 int v13 = 0; // const/4 v13, 0x0
		 int v12 = 0; // const/4 v12, 0x0
		 int v11 = 1; // const/4 v11, 0x1
		 /* .line 344 */
		 /* new-instance v0, Lcom/mobfox/video/sdk/RichMediaAdData; */
		 /* invoke-direct {v0}, Lcom/mobfox/video/sdk/RichMediaAdData;-><init>()V */
		 /* .line 345 */
		 /* .local v0, "ad":Lcom/mobfox/video/sdk/RichMediaAdData; */
		 (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).setType ( p0 ); // invoke-virtual {v0, p0}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
		 /* .line 346 */
		 (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).setAnimation ( v10 ); // invoke-virtual {v0, v10}, Lcom/mobfox/video/sdk/RichMediaAdData;->setAnimation(I)V
		 /* .line 347 */
		 /* new-instance v8, Lcom/mobfox/video/sdk/VideoData; */
		 /* invoke-direct {v8}, Lcom/mobfox/video/sdk/VideoData;-><init>()V */
		 /* .line 348 */
		 /* .local v8, "videoData":Lcom/mobfox/video/sdk/VideoData; */
		 /* iput-boolean v11, v8, Lcom/mobfox/video/sdk/VideoData;->allowTapNavigationBars:Z */
		 /* .line 349 */
		 /* iput-boolean v12, v8, Lcom/mobfox/video/sdk/VideoData;->showNavigationBars:Z */
		 /* .line 350 */
		 /* iput-boolean v11, v8, Lcom/mobfox/video/sdk/VideoData;->showTopNavigationBar:Z */
		 /* .line 351 */
		 /* iput-boolean v11, v8, Lcom/mobfox/video/sdk/VideoData;->showBottomNavigationBar:Z */
		 /* .line 352 */
		 /* const/16 v9, 0x190 */
		 /* iput v9, v8, Lcom/mobfox/video/sdk/VideoData;->bitrate:I */
		 /* .line 353 */
		 this.bottomNavigationBarBackground = v13;
		 /* .line 354 */
		 /* iput v11, v8, Lcom/mobfox/video/sdk/VideoData;->delivery:I */
		 /* .line 355 */
		 /* iput v12, v8, Lcom/mobfox/video/sdk/VideoData;->display:I */
		 /* .line 356 */
		 /* const/16 v9, 0x78 */
		 /* iput v9, v8, Lcom/mobfox/video/sdk/VideoData;->duration:I */
		 /* .line 357 */
		 /* iput v12, v8, Lcom/mobfox/video/sdk/VideoData;->height:I */
		 /* .line 358 */
		 /* iput v12, v8, Lcom/mobfox/video/sdk/VideoData;->width:I */
		 /* .line 359 */
		 final String v9 = "<html><body><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" height=\"100%\"><tr><td valign=\"middle\"><a href=\"mfox:replayvideo\" style=\"color:white\">Replay</a><br/><a href=\"mfox:skip\" style=\"color:white\">Skip</a><br/><a href=\"mfox:external:http://www.mobfox.com\" style=\"color:white\">External link</a><br/><a href=\"http://www.mobfox.com\"><img src=\"http://www.mobfox.com/mobfoxlogo.png\"></a></td></tr></table></body></html>"; // const-string v9, "<html><body><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" height=\"100%\"><tr><td valign=\"middle\"><a href=\"mfox:replayvideo\" style=\"color:white\">Replay</a><br/><a href=\"mfox:skip\" style=\"color:white\">Skip</a><br/><a href=\"mfox:external:http://www.mobfox.com\" style=\"color:white\">External link</a><br/><a href=\"http://www.mobfox.com\"><img src=\"http://www.mobfox.com/mobfoxlogo.png\"></a></td></tr></table></body></html>"
		 this.htmlOverlayMarkup = v9;
		 /* .line 360 */
		 /* iput v11, v8, Lcom/mobfox/video/sdk/VideoData;->htmlOverlayType:I */
		 /* .line 361 */
		 final String v9 = "http://www.google.com/"; // const-string v9, "http://www.google.com/"
		 this.htmlOverlayUrl = v9;
		 /* .line 362 */
		 /* new-instance v1, Lcom/mobfox/video/sdk/NavIconData; */
		 /* invoke-direct {v1}, Lcom/mobfox/video/sdk/NavIconData;-><init>()V */
		 /* .line 363 */
		 /* .local v1, "icon":Lcom/mobfox/video/sdk/NavIconData; */
		 final String v9 = "http://www.twitter.com"; // const-string v9, "http://www.twitter.com"
		 this.clickUrl = v9;
		 /* .line 364 */
		 final String v9 = "http://www.fairfield.edu/images/fairfieldlive/rss_icon.png"; // const-string v9, "http://www.fairfield.edu/images/fairfieldlive/rss_icon.png"
		 this.iconUrl = v9;
		 /* .line 365 */
		 /* iput v11, v1, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
		 /* .line 366 */
		 final String v9 = "Twitter"; // const-string v9, "Twitter"
		 this.title = v9;
		 /* .line 367 */
		 /* new-instance v2, Lcom/mobfox/video/sdk/NavIconData; */
		 /* invoke-direct {v2}, Lcom/mobfox/video/sdk/NavIconData;-><init>()V */
		 /* .line 368 */
		 /* .local v2, "icon1":Lcom/mobfox/video/sdk/NavIconData; */
		 final String v9 = "http://www.facebook.com"; // const-string v9, "http://www.facebook.com"
		 this.clickUrl = v9;
		 /* .line 369 */
		 final String v9 = "http://www.fairfield.edu/images/fairfieldlive/rss_icon.png"; // const-string v9, "http://www.fairfield.edu/images/fairfieldlive/rss_icon.png"
		 this.iconUrl = v9;
		 /* .line 370 */
		 /* iput v12, v2, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
		 /* .line 371 */
		 final String v9 = "Facebook"; // const-string v9, "Facebook"
		 this.title = v9;
		 /* .line 372 */
		 /* new-instance v3, Lcom/mobfox/video/sdk/NavIconData; */
		 /* invoke-direct {v3}, Lcom/mobfox/video/sdk/NavIconData;-><init>()V */
		 /* .line 373 */
		 /* .local v3, "icon2":Lcom/mobfox/video/sdk/NavIconData; */
		 final String v9 = "mfox:replayvideo"; // const-string v9, "mfox:replayvideo"
		 this.clickUrl = v9;
		 /* .line 374 */
		 final String v9 = "http://www.fairfield.edu/images/fairfieldlive/rss_icon.png"; // const-string v9, "http://www.fairfield.edu/images/fairfieldlive/rss_icon.png"
		 this.iconUrl = v9;
		 /* .line 375 */
		 /* iput v12, v3, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
		 /* .line 376 */
		 final String v9 = "Replay"; // const-string v9, "Replay"
		 this.title = v9;
		 /* .line 377 */
		 /* new-instance v4, Lcom/mobfox/video/sdk/NavIconData; */
		 /* invoke-direct {v4}, Lcom/mobfox/video/sdk/NavIconData;-><init>()V */
		 /* .line 378 */
		 /* .local v4, "icon3":Lcom/mobfox/video/sdk/NavIconData; */
		 final String v9 = "mfox:playvideo"; // const-string v9, "mfox:playvideo"
		 this.clickUrl = v9;
		 /* .line 379 */
		 final String v9 = "http://www.fairfield.edu/images/fairfieldlive/rss_icon.png"; // const-string v9, "http://www.fairfield.edu/images/fairfieldlive/rss_icon.png"
		 this.iconUrl = v9;
		 /* .line 380 */
		 /* iput v12, v4, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
		 /* .line 381 */
		 final String v9 = "Play Video"; // const-string v9, "Play Video"
		 this.title = v9;
		 /* .line 382 */
		 v9 = this.icons;
		 (( java.util.Vector ) v9 ).add ( v1 ); // invoke-virtual {v9, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 383 */
		 v9 = this.icons;
		 (( java.util.Vector ) v9 ).add ( v2 ); // invoke-virtual {v9, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 384 */
		 v9 = this.icons;
		 (( java.util.Vector ) v9 ).add ( v3 ); // invoke-virtual {v9, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 385 */
		 /* iput v12, v8, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
		 /* .line 386 */
		 /* iput-boolean v12, v8, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlay:Z */
		 /* .line 387 */
		 /* iput v10, v8, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlayAfter:I */
		 /* .line 388 */
		 /* iput-boolean v11, v8, Lcom/mobfox/video/sdk/VideoData;->showPauseButton:Z */
		 /* .line 389 */
		 this.pauseButtonImage = v13;
		 /* .line 390 */
		 this.playButtonImage = v13;
		 /* .line 391 */
		 /* iput-boolean v11, v8, Lcom/mobfox/video/sdk/VideoData;->showReplayButton:Z */
		 /* .line 392 */
		 final String v9 = "http://aux4.iconpedia.net/uploads/936945110906234984.png"; // const-string v9, "http://aux4.iconpedia.net/uploads/936945110906234984.png"
		 this.replayButtonImage = v9;
		 /* .line 393 */
		 /* iput-boolean v11, v8, Lcom/mobfox/video/sdk/VideoData;->showSkipButton:Z */
		 /* .line 394 */
		 this.skipButtonImage = v13;
		 /* .line 395 */
		 /* iput v12, v8, Lcom/mobfox/video/sdk/VideoData;->showSkipButtonAfter:I */
		 /* .line 396 */
		 /* iput-boolean v11, v8, Lcom/mobfox/video/sdk/VideoData;->showTimer:Z */
		 /* .line 397 */
		 v9 = this.completeEvents;
		 final String v10 = "http://www.google.com/"; // const-string v10, "http://www.google.com/"
		 (( java.util.Vector ) v9 ).add ( v10 ); // invoke-virtual {v9, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 398 */
		 v9 = this.muteEvents;
		 final String v10 = "http://www.google.com/"; // const-string v10, "http://www.google.com/"
		 (( java.util.Vector ) v9 ).add ( v10 ); // invoke-virtual {v9, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 399 */
		 v9 = this.unmuteEvents;
		 final String v10 = "http://www.google.com/"; // const-string v10, "http://www.google.com/"
		 (( java.util.Vector ) v9 ).add ( v10 ); // invoke-virtual {v9, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 400 */
		 v9 = this.pauseEvents;
		 final String v10 = "http://www.google.com/"; // const-string v10, "http://www.google.com/"
		 (( java.util.Vector ) v9 ).add ( v10 ); // invoke-virtual {v9, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 401 */
		 v9 = this.unpauseEvents;
		 final String v10 = "http://www.google.com/"; // const-string v10, "http://www.google.com/"
		 (( java.util.Vector ) v9 ).add ( v10 ); // invoke-virtual {v9, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 402 */
		 v9 = this.replayEvents;
		 final String v10 = "http://www.google.com/"; // const-string v10, "http://www.google.com/"
		 (( java.util.Vector ) v9 ).add ( v10 ); // invoke-virtual {v9, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 403 */
		 v9 = this.skipEvents;
		 final String v10 = "http://www.google.com/"; // const-string v10, "http://www.google.com/"
		 (( java.util.Vector ) v9 ).add ( v10 ); // invoke-virtual {v9, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 404 */
		 v9 = this.startEvents;
		 final String v10 = "http://www.google.com/"; // const-string v10, "http://www.google.com/"
		 (( java.util.Vector ) v9 ).add ( v10 ); // invoke-virtual {v9, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 405 */
		 /* new-instance v6, Ljava/util/Vector; */
		 /* invoke-direct {v6}, Ljava/util/Vector;-><init>()V */
		 /* .line 406 */
		 /* .local v6, "tr0":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;" */
		 final String v9 = "http://www.google.com/"; // const-string v9, "http://www.google.com/"
		 (( java.util.Vector ) v6 ).add ( v9 ); // invoke-virtual {v6, v9}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 407 */
		 v9 = this.timeTrackingEvents;
		 /* const/16 v10, 0x14 */
		 java.lang.Integer .valueOf ( v10 );
		 (( java.util.HashMap ) v9 ).put ( v10, v6 ); // invoke-virtual {v9, v10, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 408 */
		 /* new-instance v7, Ljava/util/Vector; */
		 /* invoke-direct {v7}, Ljava/util/Vector;-><init>()V */
		 /* .line 409 */
		 /* .local v7, "tr1":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;" */
		 final String v9 = "http://www.google.com/"; // const-string v9, "http://www.google.com/"
		 (( java.util.Vector ) v7 ).add ( v9 ); // invoke-virtual {v7, v9}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 410 */
		 v9 = this.timeTrackingEvents;
		 /* const/16 v10, 0x3c */
		 java.lang.Integer .valueOf ( v10 );
		 (( java.util.HashMap ) v9 ).put ( v10, v7 ); // invoke-virtual {v9, v10, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 411 */
		 this.topNavigationBarBackground = v13;
		 /* .line 412 */
		 final String v9 = "http://vdl.12dld.mobi/373566849nwwp/nwwp-Retail-Video.mp4"; // const-string v9, "http://vdl.12dld.mobi/373566849nwwp/nwwp-Retail-Video.mp4"
		 this.videoUrl = v9;
		 /* .line 417 */
		 (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).setVideo ( v8 ); // invoke-virtual {v0, v8}, Lcom/mobfox/video/sdk/RichMediaAdData;->setVideo(Lcom/mobfox/video/sdk/VideoData;)V
		 /* .line 418 */
		 /* new-instance v5, Lcom/mobfox/video/sdk/InterstitialData; */
		 /* invoke-direct {v5}, Lcom/mobfox/video/sdk/InterstitialData;-><init>()V */
		 /* .line 419 */
		 /* .local v5, "interstitialData":Lcom/mobfox/video/sdk/InterstitialData; */
		 /* iput-boolean v12, v5, Lcom/mobfox/video/sdk/InterstitialData;->allowTapNavigationBars:Z */
		 /* .line 420 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showNavigationBars:Z */
		 /* .line 421 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showTopNavigationBar:Z */
		 /* .line 422 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showBottomNavigationBar:Z */
		 /* .line 423 */
		 /* const/16 v9, 0x1e */
		 /* iput v9, v5, Lcom/mobfox/video/sdk/InterstitialData;->autoclose:I */
		 /* .line 424 */
		 this.bottomNavigationBarBackground = v13;
		 /* .line 425 */
		 v9 = this.icons;
		 (( java.util.Vector ) v9 ).add ( v1 ); // invoke-virtual {v9, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 426 */
		 v9 = this.icons;
		 (( java.util.Vector ) v9 ).add ( v2 ); // invoke-virtual {v9, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 427 */
		 v9 = this.icons;
		 (( java.util.Vector ) v9 ).add ( v4 ); // invoke-virtual {v9, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
		 /* .line 428 */
		 final String v9 = "<html><head><title>Title from markup</title></head><body bgcolor=\"#000000\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" height=\"100%\"><tr><td valign=\"middle\"><a href=\"mfox:replayvideo\" style=\"color:white\">Replay</a><br/><a href=\"mfox:playvideo\" style=\"color:white\">Play video</a><br/><a href=\"mfox:skip\" style=\"color:white\">Skip</a><br/><a href=\"mfox:external:http://www.mobfox.com\" style=\"color:white\">External link</a><br/><a href=\"http://www.mobfox.com\"><img src=\"http://www.mobfox.com/mobfoxlogo.png\"></a></td></tr></table></body></html>"; // const-string v9, "<html><head><title>Title from markup</title></head><body bgcolor=\"#000000\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" height=\"100%\"><tr><td valign=\"middle\"><a href=\"mfox:replayvideo\" style=\"color:white\">Replay</a><br/><a href=\"mfox:playvideo\" style=\"color:white\">Play video</a><br/><a href=\"mfox:skip\" style=\"color:white\">Skip</a><br/><a href=\"mfox:external:http://www.mobfox.com\" style=\"color:white\">External link</a><br/><a href=\"http://www.mobfox.com\"><img src=\"http://www.mobfox.com/mobfoxlogo.png\"></a></td></tr></table></body></html>"
		 this.interstitialMarkup = v9;
		 /* .line 429 */
		 /* iput v12, v5, Lcom/mobfox/video/sdk/InterstitialData;->interstitialType:I */
		 /* .line 430 */
		 final String v9 = "http://dev.mennerich.name/showroom/html5_video/"; // const-string v9, "http://dev.mennerich.name/showroom/html5_video/"
		 this.interstitialUrl = v9;
		 /* .line 431 */
		 /* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->orientation:I */
		 /* .line 432 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showBackButton:Z */
		 /* .line 433 */
		 this.backButtonImage = v13;
		 /* .line 434 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showExternalButton:Z */
		 /* .line 435 */
		 this.externalButtonImage = v13;
		 /* .line 436 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showForwardButton:Z */
		 /* .line 437 */
		 this.forwardButtonImage = v13;
		 /* .line 438 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showReloadButton:Z */
		 /* .line 439 */
		 this.reloadButtonImage = v13;
		 /* .line 440 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButton:Z */
		 /* .line 441 */
		 /* iput v12, v5, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButtonAfter:I */
		 /* .line 442 */
		 final String v9 = "http://files.softicons.com/download/system-icons/oxygen-icons-by-oxygen/png/64x64/actions/fileclose.png"; // const-string v9, "http://files.softicons.com/download/system-icons/oxygen-icons-by-oxygen/png/64x64/actions/fileclose.png"
		 this.skipButtonImage = v9;
		 /* .line 443 */
		 /* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showTimer:Z */
		 /* .line 444 */
		 this.topNavigationBarBackground = v13;
		 /* .line 445 */
		 final String v9 = "This is an interstitial ad"; // const-string v9, "This is an interstitial ad"
		 this.topNavigationBarTitle = v9;
		 /* .line 446 */
		 /* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->topNavigationBarTitleType:I */
		 /* .line 447 */
		 (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).setInterstitial ( v5 ); // invoke-virtual {v0, v5}, Lcom/mobfox/video/sdk/RichMediaAdData;->setInterstitial(Lcom/mobfox/video/sdk/InterstitialData;)V
		 /* .line 448 */
	 } // .end method
	 public static java.lang.String buildUserAgent ( ) {
		 /* .locals 11 */
		 /* .prologue */
		 /* .line 248 */
		 v1 = android.os.Build$VERSION.RELEASE;
		 /* .line 249 */
		 /* .local v1, "androidVersion":Ljava/lang/String; */
		 v6 = android.os.Build.MODEL;
		 /* .line 250 */
		 /* .local v6, "model":Ljava/lang/String; */
		 v0 = android.os.Build.ID;
		 /* .line 251 */
		 /* .local v0, "androidBuild":Ljava/lang/String; */
		 java.util.Locale .getDefault ( );
		 /* .line 252 */
		 /* .local v3, "l":Ljava/util/Locale; */
		 (( java.util.Locale ) v3 ).getLanguage ( ); // invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
		 /* .line 253 */
		 /* .local v4, "language":Ljava/lang/String; */
		 final String v5 = "en"; // const-string v5, "en"
		 /* .line 254 */
		 /* .local v5, "locale":Ljava/lang/String; */
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 255 */
			 (( java.lang.String ) v4 ).toLowerCase ( ); // invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
			 /* .line 256 */
			 (( java.util.Locale ) v3 ).getCountry ( ); // invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
			 /* .line 257 */
			 /* .local v2, "country":Ljava/lang/String; */
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* .line 258 */
				 /* new-instance v8, Ljava/lang/StringBuilder; */
				 java.lang.String .valueOf ( v5 );
				 /* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 final String v9 = "-"; // const-string v9, "-"
				 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.String ) v2 ).toLowerCase ( ); // invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* .line 262 */
			 } // .end local v2 # "country":Ljava/lang/String;
		 } // :cond_0
		 final String v8 = "Mozilla/5.0 (Linux; U; Android %1$s; %2$s; %3$s Build/%4$s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"; // const-string v8, "Mozilla/5.0 (Linux; U; Android %1$s; %2$s; %3$s Build/%4$s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"
		 int v9 = 4; // const/4 v9, 0x4
		 /* new-array v9, v9, [Ljava/lang/Object; */
		 int v10 = 0; // const/4 v10, 0x0
		 /* .line 263 */
		 /* aput-object v1, v9, v10 */
		 int v10 = 1; // const/4 v10, 0x1
		 /* aput-object v5, v9, v10 */
		 int v10 = 2; // const/4 v10, 0x2
		 /* aput-object v6, v9, v10 */
		 int v10 = 3; // const/4 v10, 0x3
		 /* aput-object v0, v9, v10 */
		 /* .line 262 */
		 java.lang.String .format ( v8,v9 );
		 /* .line 264 */
		 /* .local v7, "userAgent":Ljava/lang/String; */
	 } // .end method
	 public static java.lang.String getConnectionType ( android.content.Context p0 ) {
		 /* .locals 6 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 78 */
		 /* .line 79 */
		 final String v5 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v5, "android.permission.ACCESS_NETWORK_STATE"
		 v4 = 		 (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v5 ); // invoke-virtual {p0, v5}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
		 /* .line 81 */
		 /* .local v4, "networkStatePermission":I */
		 /* if-nez v4, :cond_4 */
		 /* .line 83 */
		 final String v5 = "connectivity"; // const-string v5, "connectivity"
		 (( android.content.Context ) p0 ).getSystemService ( v5 ); // invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* .line 82 */
		 /* check-cast v0, Landroid/net/ConnectivityManager; */
		 /* .line 84 */
		 /* .local v0, "cm":Landroid/net/ConnectivityManager; */
		 (( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
		 /* .line 85 */
		 /* .local v1, "info":Landroid/net/NetworkInfo; */
		 /* if-nez v1, :cond_0 */
		 /* .line 86 */
		 final String v5 = "UNKNOWN"; // const-string v5, "UNKNOWN"
		 /* .line 133 */
	 } // .end local v0 # "cm":Landroid/net/ConnectivityManager;
} // .end local v1 # "info":Landroid/net/NetworkInfo;
} // :goto_0
/* .line 88 */
/* .restart local v0 # "cm":Landroid/net/ConnectivityManager; */
/* .restart local v1 # "info":Landroid/net/NetworkInfo; */
} // :cond_0
v3 = (( android.net.NetworkInfo ) v1 ).getType ( ); // invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I
/* .line 89 */
/* .local v3, "netType":I */
v2 = (( android.net.NetworkInfo ) v1 ).getSubtype ( ); // invoke-virtual {v1}, Landroid/net/NetworkInfo;->getSubtype()I
/* .line 90 */
/* .local v2, "netSubtype":I */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v3, v5, :cond_1 */
/* .line 91 */
final String v5 = "WIFI"; // const-string v5, "WIFI"
/* .line 92 */
} // :cond_1
int v5 = 6; // const/4 v5, 0x6
/* if-ne v3, v5, :cond_2 */
/* .line 93 */
final String v5 = "WIMAX"; // const-string v5, "WIMAX"
/* .line 94 */
} // :cond_2
/* if-nez v3, :cond_3 */
/* .line 95 */
/* packed-switch v2, :pswitch_data_0 */
/* .line 127 */
final String v5 = "MOBILE"; // const-string v5, "MOBILE"
/* .line 97 */
/* :pswitch_0 */
final String v5 = "1xRTT"; // const-string v5, "1xRTT"
/* .line 99 */
/* :pswitch_1 */
final String v5 = "CDMA"; // const-string v5, "CDMA"
/* .line 101 */
/* :pswitch_2 */
final String v5 = "EDGE"; // const-string v5, "EDGE"
/* .line 103 */
/* :pswitch_3 */
final String v5 = "EVDO_0"; // const-string v5, "EVDO_0"
/* .line 105 */
/* :pswitch_4 */
final String v5 = "EVDO_A"; // const-string v5, "EVDO_A"
/* .line 107 */
/* :pswitch_5 */
final String v5 = "GPRS"; // const-string v5, "GPRS"
/* .line 109 */
/* :pswitch_6 */
final String v5 = "UMTS"; // const-string v5, "UMTS"
/* .line 111 */
/* :pswitch_7 */
final String v5 = "EHRPD"; // const-string v5, "EHRPD"
/* .line 113 */
/* :pswitch_8 */
final String v5 = "EVDO_B"; // const-string v5, "EVDO_B"
/* .line 115 */
/* :pswitch_9 */
final String v5 = "HSDPA"; // const-string v5, "HSDPA"
/* .line 117 */
/* :pswitch_a */
final String v5 = "HSPA"; // const-string v5, "HSPA"
/* .line 119 */
/* :pswitch_b */
final String v5 = "HSPAP"; // const-string v5, "HSPAP"
/* .line 121 */
/* :pswitch_c */
final String v5 = "HSUPA"; // const-string v5, "HSUPA"
/* .line 123 */
/* :pswitch_d */
final String v5 = "IDEN"; // const-string v5, "IDEN"
/* .line 125 */
/* :pswitch_e */
final String v5 = "LTE"; // const-string v5, "LTE"
/* .line 130 */
} // :cond_3
final String v5 = "UNKNOWN"; // const-string v5, "UNKNOWN"
/* .line 133 */
} // .end local v0 # "cm":Landroid/net/ConnectivityManager;
} // .end local v1 # "info":Landroid/net/NetworkInfo;
} // .end local v2 # "netSubtype":I
} // .end local v3 # "netType":I
} // :cond_4
final String v5 = "UNKNOWN"; // const-string v5, "UNKNOWN"
/* .line 95 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_5 */
/* :pswitch_2 */
/* :pswitch_6 */
/* :pswitch_1 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_0 */
/* :pswitch_9 */
/* :pswitch_c */
/* :pswitch_a */
/* :pswitch_d */
/* :pswitch_8 */
/* :pswitch_e */
/* :pswitch_7 */
/* :pswitch_b */
} // .end packed-switch
} // .end method
public static java.lang.String getDefaultUserAgentString ( android.content.Context p0 ) {
/* .locals 7 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 233 */
try { // :try_start_0
/* const-class v3, Landroid/webkit/WebSettings; */
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [Ljava/lang/Class; */
int v5 = 0; // const/4 v5, 0x0
/* .line 234 */
/* const-class v6, Landroid/content/Context; */
/* aput-object v6, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* const-class v6, Landroid/webkit/WebView; */
/* aput-object v6, v4, v5 */
(( java.lang.Class ) v3 ).getDeclaredConstructor ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* .line 235 */
/* .local v0, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Landroid/webkit/WebSettings;>;" */
int v3 = 1; // const/4 v3, 0x1
(( java.lang.reflect.Constructor ) v0 ).setAccessible ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 237 */
int v3 = 2; // const/4 v3, 0x2
try { // :try_start_1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object p0, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* aput-object v5, v3, v4 */
(( java.lang.reflect.Constructor ) v0 ).newInstance ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Landroid/webkit/WebSettings; */
/* .line 238 */
/* .local v2, "settings":Landroid/webkit/WebSettings; */
(( android.webkit.WebSettings ) v2 ).getUserAgentString ( ); // invoke-virtual {v2}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 240 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_2
(( java.lang.reflect.Constructor ) v0 ).setAccessible ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
/* .line 243 */
} // .end local v0 # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Landroid/webkit/WebSettings;>;"
} // .end local v2 # "settings":Landroid/webkit/WebSettings;
} // :goto_0
/* .line 239 */
/* .restart local v0 # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Landroid/webkit/WebSettings;>;" */
/* :catchall_0 */
/* move-exception v3 */
/* .line 240 */
int v4 = 0; // const/4 v4, 0x0
(( java.lang.reflect.Constructor ) v0 ).setAccessible ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
/* .line 241 */
/* throw v3 */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 242 */
} // .end local v0 # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<Landroid/webkit/WebSettings;>;"
/* :catch_0 */
/* move-exception v1 */
/* .line 243 */
/* .local v1, "e":Ljava/lang/Exception; */
/* new-instance v3, Landroid/webkit/WebView; */
/* invoke-direct {v3, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
(( android.webkit.WebView ) v3 ).getSettings ( ); // invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v3 ).getUserAgentString ( ); // invoke-virtual {v3}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
} // .end method
public static java.lang.String getDeviceId ( android.content.Context p0 ) {
/* .locals 11 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 169 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
/* .line 170 */
final String v6 = "android_id"; // const-string v6, "android_id"
/* .line 169 */
android.provider.Settings$Secure .getString ( v5,v6 );
/* .line 171 */
/* .local v0, "androidId":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v5 = "9774d56d682e549c"; // const-string v5, "9774d56d682e549c"
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v5, :cond_0 */
/* .line 172 */
final String v5 = "0000000000000000"; // const-string v5, "0000000000000000"
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 174 */
} // :cond_0
android.preference.PreferenceManager .getDefaultSharedPreferences ( p0 );
/* .line 175 */
/* .local v3, "prefs":Landroid/content/SharedPreferences; */
final String v5 = "mobfox_device_id"; // const-string v5, "mobfox_device_id"
int v6 = 0; // const/4 v6, 0x0
/* .line 176 */
/* if-nez v0, :cond_1 */
/* .line 178 */
try { // :try_start_0
java.util.UUID .randomUUID ( );
(( java.util.UUID ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;
/* .line 179 */
/* .local v4, "uuid":Ljava/lang/String; */
final String v5 = "MD5"; // const-string v5, "MD5"
java.security.MessageDigest .getInstance ( v5 );
/* .line 180 */
/* .local v1, "digest":Ljava/security/MessageDigest; */
(( java.lang.String ) v4 ).getBytes ( ); // invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
int v6 = 0; // const/4 v6, 0x0
v7 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
(( java.security.MessageDigest ) v1 ).update ( v5, v6, v7 ); // invoke-virtual {v1, v5, v6, v7}, Ljava/security/MessageDigest;->update([BII)V
/* .line 182 */
final String v5 = "%032X"; // const-string v5, "%032X"
/* .line 183 */
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Object; */
int v7 = 0; // const/4 v7, 0x0
/* new-instance v8, Ljava/math/BigInteger; */
int v9 = 1; // const/4 v9, 0x1
/* .line 184 */
(( java.security.MessageDigest ) v1 ).digest ( ); // invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
/* invoke-direct {v8, v9, v10}, Ljava/math/BigInteger;-><init>(I[B)V */
/* aput-object v8, v6, v7 */
/* .line 182 */
java.lang.String .format ( v5,v6 );
/* .line 184 */
int v6 = 0; // const/4 v6, 0x0
/* const/16 v7, 0x10 */
(( java.lang.String ) v5 ).substring ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 189 */
} // .end local v1 # "digest":Ljava/security/MessageDigest;
} // .end local v4 # "uuid":Ljava/lang/String;
} // :goto_0
final String v6 = "mobfox_device_id"; // const-string v6, "mobfox_device_id"
/* .line 191 */
} // :cond_1
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
int v6 = 3; // const/4 v6, 0x3
v5 = android.util.Log .isLoggable ( v5,v6 );
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 192 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "Unknown Android ID using pseudo unique id:"; // const-string v7, "Unknown Android ID using pseudo unique id:"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 193 */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 192 */
android.util.Log .d ( v5,v6 );
/* .line 196 */
} // .end local v3 # "prefs":Landroid/content/SharedPreferences;
} // :cond_2
/* .line 185 */
/* .restart local v3 # "prefs":Landroid/content/SharedPreferences; */
/* :catch_0 */
/* move-exception v2 */
/* .line 186 */
/* .local v2, "e":Ljava/lang/Exception; */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
final String v6 = "Could not generate pseudo unique id"; // const-string v6, "Could not generate pseudo unique id"
android.util.Log .d ( v5,v6,v2 );
/* .line 187 */
final String v0 = "9774d56d682e549c"; // const-string v0, "9774d56d682e549c"
} // .end method
public static Integer getEnterAnimation ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "animation" # I */
/* .prologue */
/* .line 305 */
/* packed-switch p0, :pswitch_data_0 */
/* .line 319 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 307 */
/* :pswitch_0 */
/* .line 309 */
/* :pswitch_1 */
/* .line 311 */
/* :pswitch_2 */
/* .line 313 */
/* :pswitch_3 */
/* .line 315 */
/* :pswitch_4 */
/* .line 317 */
/* :pswitch_5 */
/* .line 305 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_5 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public static Integer getExitAnimation ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "animation" # I */
/* .prologue */
/* .line 325 */
/* packed-switch p0, :pswitch_data_0 */
/* .line 339 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 327 */
/* :pswitch_0 */
/* .line 329 */
/* :pswitch_1 */
/* .line 331 */
/* :pswitch_2 */
/* .line 333 */
/* :pswitch_3 */
/* .line 335 */
/* :pswitch_4 */
/* .line 337 */
/* :pswitch_5 */
/* .line 325 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_5 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public static java.lang.String getLocalIpAddress ( ) {
/* .locals 7 */
/* .prologue */
/* .line 140 */
try { // :try_start_0
java.net.NetworkInterface .getNetworkInterfaces ( );
/* .local v0, "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/NetworkInterface;>;" */
v5 = } // :cond_0
/* .line 139 */
/* if-nez v5, :cond_1 */
/* .line 153 */
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* .line 141 */
} // :cond_1
/* check-cast v4, Ljava/net/NetworkInterface; */
/* .line 143 */
/* .local v4, "intf":Ljava/net/NetworkInterface; */
(( java.net.NetworkInterface ) v4 ).getInetAddresses ( ); // invoke-virtual {v4}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;
/* .local v1, "enumIpAddr":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/InetAddress;>;" */
v5 = } // :cond_2
/* .line 142 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 144 */
/* check-cast v3, Ljava/net/InetAddress; */
/* .line 145 */
/* .local v3, "inetAddress":Ljava/net/InetAddress; */
v5 = (( java.net.InetAddress ) v3 ).isLoopbackAddress ( ); // invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z
/* if-nez v5, :cond_2 */
/* .line 146 */
(( java.net.InetAddress ) v3 ).getHostAddress ( ); // invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
(( java.lang.String ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/net/SocketException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 150 */
} // .end local v1 # "enumIpAddr":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/InetAddress;>;"
} // .end local v3 # "inetAddress":Ljava/net/InetAddress;
} // .end local v4 # "intf":Ljava/net/NetworkInterface;
/* :catch_0 */
/* move-exception v2 */
/* .line 151 */
/* .local v2, "ex":Ljava/net/SocketException; */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
(( java.net.SocketException ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/net/SocketException;->toString()Ljava/lang/String;
android.util.Log .e ( v5,v6 );
} // .end method
public static android.location.Location getLocation ( android.content.Context p0 ) {
/* .locals 6 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 200 */
/* .line 201 */
final String v5 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v5, "android.permission.ACCESS_FINE_LOCATION"
v1 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v5 ); // invoke-virtual {p0, v5}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* .line 203 */
/* .local v1, "isAccessFineLocation":I */
final String v5 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v5, "android.permission.ACCESS_COARSE_LOCATION"
v0 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v5 ); // invoke-virtual {p0, v5}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* .line 204 */
/* .local v0, "isAccessCoarseLocation":I */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 205 */
/* if-nez v0, :cond_2 */
/* .line 207 */
} // :cond_0
final String v5 = "location"; // const-string v5, "location"
(( android.content.Context ) p0 ).getSystemService ( v5 ); // invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 206 */
/* check-cast v4, Landroid/location/LocationManager; */
/* .line 208 */
/* .local v4, "locationManager":Landroid/location/LocationManager; */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 209 */
/* if-nez v1, :cond_1 */
/* .line 211 */
final String v5 = "gps"; // const-string v5, "gps"
v2 = (( android.location.LocationManager ) v4 ).isProviderEnabled ( v5 ); // invoke-virtual {v4, v5}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z
/* .line 212 */
/* .local v2, "isGpsEnabled":Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 214 */
final String v5 = "gps"; // const-string v5, "gps"
(( android.location.LocationManager ) v4 ).getLastKnownLocation ( v5 ); // invoke-virtual {v4, v5}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* .line 228 */
} // .end local v2 # "isGpsEnabled":Z
} // .end local v4 # "locationManager":Landroid/location/LocationManager;
} // :goto_0
/* .line 217 */
/* .restart local v4 # "locationManager":Landroid/location/LocationManager; */
} // :cond_1
/* if-nez v0, :cond_2 */
/* .line 219 */
final String v5 = "network"; // const-string v5, "network"
v3 = (( android.location.LocationManager ) v4 ).isProviderEnabled ( v5 ); // invoke-virtual {v4, v5}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z
/* .line 221 */
/* .local v3, "isNetworkEnabled":Z */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 223 */
final String v5 = "network"; // const-string v5, "network"
(( android.location.LocationManager ) v4 ).getLastKnownLocation ( v5 ); // invoke-virtual {v4, v5}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* .line 228 */
} // .end local v3 # "isNetworkEnabled":Z
} // .end local v4 # "locationManager":Landroid/location/LocationManager;
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
} // .end method
public static Integer getMemoryClass ( android.content.Context p0 ) {
/* .locals 6 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 269 */
try { // :try_start_0
/* const-class v3, Landroid/app/ActivityManager; */
/* .line 270 */
final String v4 = "getMemoryClass"; // const-string v4, "getMemoryClass"
int v5 = 0; // const/4 v5, 0x0
/* new-array v5, v5, [Ljava/lang/Class; */
(( java.lang.Class ) v3 ).getMethod ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 272 */
/* .local v2, "getMemoryClassMethod":Ljava/lang/reflect/Method; */
final String v3 = "activity"; // const-string v3, "activity"
(( android.content.Context ) p0 ).getSystemService ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 271 */
/* check-cast v0, Landroid/app/ActivityManager; */
/* .line 273 */
/* .local v0, "ac":Landroid/app/ActivityManager; */
int v3 = 0; // const/4 v3, 0x0
/* new-array v3, v3, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v2 ).invoke ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Integer; */
(( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* :try_end_0 */
v3 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 275 */
} // .end local v0 # "ac":Landroid/app/ActivityManager;
} // .end local v2 # "getMemoryClassMethod":Ljava/lang/reflect/Method;
} // :goto_0
/* .line 274 */
/* :catch_0 */
/* move-exception v1 */
/* .line 275 */
/* .local v1, "ex":Ljava/lang/Exception; */
/* const/16 v3, 0x10 */
} // .end method
public static java.lang.String getTelephonyDeviceId ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 157 */
/* .line 158 */
final String v2 = "android.permission.READ_PHONE_STATE"; // const-string v2, "android.permission.READ_PHONE_STATE"
v0 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* .line 160 */
/* .local v0, "telephonyPermission":I */
/* if-nez v0, :cond_0 */
/* .line 162 */
final String v2 = "phone"; // const-string v2, "phone"
(( android.content.Context ) p0 ).getSystemService ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 161 */
/* check-cast v1, Landroid/telephony/TelephonyManager; */
/* .line 163 */
/* .local v1, "tm":Landroid/telephony/TelephonyManager; */
(( android.telephony.TelephonyManager ) v1 ).getDeviceId ( ); // invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
/* .line 165 */
} // .end local v1 # "tm":Landroid/telephony/TelephonyManager;
} // :goto_0
} // :cond_0
final String v2 = ""; // const-string v2, ""
} // .end method
public static void initializeAnimations ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 280 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 281 */
/* .local v0, "r":Landroid/content/res/Resources; */
final String v1 = "mobfox_fade_in"; // const-string v1, "mobfox_fade_in"
final String v2 = "anim"; // const-string v2, "anim"
/* .line 282 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 281 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 283 */
final String v1 = "mobfox_fade_out"; // const-string v1, "mobfox_fade_out"
final String v2 = "anim"; // const-string v2, "anim"
/* .line 284 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 283 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 285 */
final String v1 = "mobfox_slide_bottom_in"; // const-string v1, "mobfox_slide_bottom_in"
/* .line 286 */
final String v2 = "anim"; // const-string v2, "anim"
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 285 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 287 */
final String v1 = "mobfox_slide_bottom_out"; // const-string v1, "mobfox_slide_bottom_out"
/* .line 288 */
final String v2 = "anim"; // const-string v2, "anim"
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 287 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 289 */
final String v1 = "mobfox_slide_top_in"; // const-string v1, "mobfox_slide_top_in"
final String v2 = "anim"; // const-string v2, "anim"
/* .line 290 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 289 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 291 */
final String v1 = "mobfox_slide_top_out"; // const-string v1, "mobfox_slide_top_out"
/* .line 292 */
final String v2 = "anim"; // const-string v2, "anim"
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 291 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 293 */
final String v1 = "mobfox_slide_left_in"; // const-string v1, "mobfox_slide_left_in"
/* .line 294 */
final String v2 = "anim"; // const-string v2, "anim"
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 293 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 295 */
final String v1 = "mobfox_slide_left_out"; // const-string v1, "mobfox_slide_left_out"
/* .line 296 */
final String v2 = "anim"; // const-string v2, "anim"
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 295 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 297 */
final String v1 = "mobfox_slide_right_in"; // const-string v1, "mobfox_slide_right_in"
/* .line 298 */
final String v2 = "anim"; // const-string v2, "anim"
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 297 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 299 */
final String v1 = "mobfox_slide_right_out"; // const-string v1, "mobfox_slide_right_out"
/* .line 300 */
final String v2 = "anim"; // const-string v2, "anim"
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 299 */
v1 = (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 302 */
return;
} // .end method
public static Boolean isNetworkAvailable ( android.content.Context p0 ) {
/* .locals 7 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 50 */
/* .line 51 */
final String v6 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v6, "android.permission.ACCESS_NETWORK_STATE"
v3 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v6 ); // invoke-virtual {p0, v6}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* .line 53 */
/* .local v3, "networkStatePermission":I */
/* if-nez v3, :cond_3 */
/* .line 56 */
final String v6 = "connectivity"; // const-string v6, "connectivity"
(( android.content.Context ) p0 ).getSystemService ( v6 ); // invoke-virtual {p0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 55 */
/* check-cast v1, Landroid/net/ConnectivityManager; */
/* .line 59 */
/* .local v1, "mConnectivity":Landroid/net/ConnectivityManager; */
(( android.net.ConnectivityManager ) v1 ).getActiveNetworkInfo ( ); // invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
/* .line 60 */
/* .local v0, "info":Landroid/net/NetworkInfo; */
/* if-nez v0, :cond_1 */
/* .line 73 */
} // .end local v0 # "info":Landroid/net/NetworkInfo;
} // .end local v1 # "mConnectivity":Landroid/net/ConnectivityManager;
} // :cond_0
} // :goto_0
/* .line 64 */
/* .restart local v0 # "info":Landroid/net/NetworkInfo; */
/* .restart local v1 # "mConnectivity":Landroid/net/ConnectivityManager; */
} // :cond_1
v2 = (( android.net.NetworkInfo ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
/* .line 66 */
/* .local v2, "netType":I */
/* if-eq v2, v5, :cond_2 */
/* .line 67 */
/* if-nez v2, :cond_0 */
/* .line 68 */
} // :cond_2
v4 = (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
} // .end local v0 # "info":Landroid/net/NetworkInfo;
} // .end local v1 # "mConnectivity":Landroid/net/ConnectivityManager;
} // .end local v2 # "netType":I
} // :cond_3
/* move v4, v5 */
/* .line 73 */
} // .end method
