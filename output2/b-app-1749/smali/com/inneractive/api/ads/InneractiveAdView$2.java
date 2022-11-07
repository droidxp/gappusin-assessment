class com.inneractive.api.ads.InneractiveAdView$2 extends java.lang.Thread {
	 /* .source "InneractiveAdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/inneractive/api/ads/InneractiveAdView;->requestAd()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.inneractive.api.ads.InneractiveAdView this$0; //synthetic
/* # direct methods */
 com.inneractive.api.ads.InneractiveAdView$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 613 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 18 */
/* .prologue */
/* .line 616 */
final String v9 = ""; // const-string v9, ""
/* .line 617 */
/* .local v9, "data":Ljava/lang/String; */
final String v6 = ""; // const-string v6, ""
/* .line 618 */
/* .local v6, "contentEncoding":Ljava/lang/String; */
final String v5 = ""; // const-string v5, ""
/* .line 620 */
/* .local v5, "contentType":Ljava/lang/String; */
int v11 = 0; // const/4 v11, 0x0
/* .line 624 */
/* .local v11, "httpConnection":Ljava/net/HttpURLConnection; */
try { // :try_start_0
	 /* new-instance v15, Ljava/net/URL; */
	 /* move-object/from16 v0, p0 */
	 v2 = this.this$0;
	 com.inneractive.api.ads.InneractiveAdView .access$15 ( v2 );
	 /* invoke-direct {v15, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
	 /* .line 625 */
	 /* .local v15, "url":Ljava/net/URL; */
	 (( java.net.URL ) v15 ).openConnection ( ); // invoke-virtual {v15}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
	 /* move-object v0, v2 */
	 /* check-cast v0, Ljava/net/HttpURLConnection; */
	 /* move-object v11, v0 */
	 /* .line 626 */
	 final String v2 = "User-Agent"; // const-string v2, "User-Agent"
	 com.inneractive.api.ads.InneractiveAdView .access$16 ( );
	 (( java.net.HttpURLConnection ) v11 ).setRequestProperty ( v2, v3 ); // invoke-virtual {v11, v2, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 627 */
	 /* const/16 v2, 0x3a98 */
	 (( java.net.HttpURLConnection ) v11 ).setConnectTimeout ( v2 ); // invoke-virtual {v11, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
	 /* .line 629 */
	 (( java.net.HttpURLConnection ) v11 ).connect ( ); // invoke-virtual {v11}, Ljava/net/HttpURLConnection;->connect()V
	 /* .line 630 */
	 v14 = 	 (( java.net.HttpURLConnection ) v11 ).getResponseCode ( ); // invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getResponseCode()I
	 /* .line 633 */
	 /* .local v14, "responseCode":I */
	 /* const/16 v2, 0xc8 */
	 /* if-ne v14, v2, :cond_8 */
	 /* .line 636 */
	 (( java.net.HttpURLConnection ) v11 ).getContentEncoding ( ); // invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;
	 /* .line 637 */
	 /* if-nez v6, :cond_0 */
	 /* .line 638 */
	 final String v6 = "utf-8"; // const-string v6, "utf-8"
	 /* .line 642 */
} // :cond_0
final String v5 = "text/html"; // const-string v5, "text/html"
/* .line 644 */
com.inneractive.api.ads.InneractiveAdView .getData ( v11 );
/* .line 647 */
/* .local v8, "buffer":[B */
/* new-instance v4, Ljava/lang/String; */
/* invoke-direct {v4, v8, v6}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_4 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 651 */
} // .end local v9 # "data":Ljava/lang/String;
/* .local v4, "data":Ljava/lang/String; */
try { // :try_start_1
/* move-object/from16 v0, p0 */
v2 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$17 ( v2 );
/* move-object/from16 v0, p0 */
v3 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$17 ( v3 );
int v7 = 3; // const/4 v7, 0x3
(( android.os.Handler ) v3 ).obtainMessage ( v7 ); // invoke-virtual {v3, v7}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
/* const-wide/16 v16, 0x0 */
/* move-wide/from16 v0, v16 */
(( android.os.Handler ) v2 ).sendMessageDelayed ( v3, v0, v1 ); // invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 655 */
/* const-wide/16 v2, 0x1f4 */
try { // :try_start_2
	 com.inneractive.api.ads.InneractiveAdView$2 .sleep ( v2,v3 );
	 /* :try_end_2 */
	 /* .catch Ljava/lang/InterruptedException; {:try_start_2 ..:try_end_2} :catch_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
	 /* .line 662 */
} // :goto_0
try { // :try_start_3
	 /* move-object/from16 v0, p0 */
	 v2 = this.this$0;
	 final String v3 = ""; // const-string v3, ""
	 int v7 = 0; // const/4 v7, 0x0
	 /* invoke-virtual/range {v2 ..v7}, Lcom/inneractive/api/ads/InneractiveAdView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 664 */
	 /* move-object/from16 v0, p0 */
	 v2 = this.this$0;
	 com.inneractive.api.ads.InneractiveAdView .access$7 ( v2 );
	 /* :try_end_3 */
	 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 668 */
		 try { // :try_start_4
			 /* move-object/from16 v0, p0 */
			 v2 = this.this$0;
			 com.inneractive.api.ads.InneractiveAdView .access$7 ( v2 );
			 /* move-object/from16 v0, p0 */
			 v3 = this.this$0;
			 /* .line 669 */
			 final String v2 = "inneractive"; // const-string v2, "inneractive"
			 final String v3 = "onReceiveAd"; // const-string v3, "onReceiveAd"
			 android.util.Log .i ( v2,v3 );
			 /* :try_end_4 */
			 /* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_2 */
			 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
			 /* .line 696 */
		 } // .end local v8 # "buffer":[B
	 } // :cond_1
} // :goto_1
if ( v11 != null) { // if-eqz v11, :cond_2
	 /* .line 697 */
	 (( java.net.HttpURLConnection ) v11 ).disconnect ( ); // invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V
	 /* .line 700 */
} // :cond_2
/* move-object/from16 v0, p0 */
v2 = this.this$0;
v2 = com.inneractive.api.ads.InneractiveAdView .access$13 ( v2 );
int v3 = 2; // const/4 v3, 0x2
/* if-eq v2, v3, :cond_3 */
/* .line 701 */
com.inneractive.api.ads.InneractiveAdViewScheduler .getInstance ( );
/* new-instance v3, Lcom/inneractive/api/ads/InneractiveRefreshTask; */
/* move-object/from16 v0, p0 */
v7 = this.this$0;
/* invoke-direct {v3, v7}, Lcom/inneractive/api/ads/InneractiveRefreshTask;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
/* move-object/from16 v0, p0 */
v7 = this.this$0;
v7 = com.inneractive.api.ads.InneractiveAdView .access$14 ( v7 );
(( com.inneractive.api.ads.InneractiveAdViewScheduler ) v2 ).scheduleTask ( v3, v7 ); // invoke-virtual {v2, v3, v7}, Lcom/inneractive/api/ads/InneractiveAdViewScheduler;->scheduleTask(Ljava/util/TimerTask;I)V
/* .line 704 */
} // .end local v14 # "responseCode":I
} // .end local v15 # "url":Ljava/net/URL;
} // :cond_3
} // :goto_2
return;
/* .line 657 */
/* .restart local v8 # "buffer":[B */
/* .restart local v14 # "responseCode":I */
/* .restart local v15 # "url":Ljava/net/URL; */
/* :catch_0 */
/* move-exception v12 */
/* .line 658 */
/* .local v12, "ie":Ljava/lang/InterruptedException; */
try { // :try_start_5
(( java.lang.InterruptedException ) v12 ).printStackTrace ( ); // invoke-virtual {v12}, Ljava/lang/InterruptedException;->printStackTrace()V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_1 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 678 */
} // .end local v12 # "ie":Ljava/lang/InterruptedException;
/* :catch_1 */
/* move-exception v13 */
/* .line 679 */
} // .end local v8 # "buffer":[B
} // .end local v14 # "responseCode":I
} // .end local v15 # "url":Ljava/net/URL;
/* .local v13, "ioe":Ljava/lang/Exception; */
} // :goto_3
try { // :try_start_6
final String v2 = "inneractive"; // const-string v2, "inneractive"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v7 = "error: "; // const-string v7, "error: "
/* invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v13 ); // invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v2,v3 );
/* .line 681 */
/* move-object/from16 v0, p0 */
v2 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v2 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 685 */
try { // :try_start_7
/* move-object/from16 v0, p0 */
v2 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v2 );
/* move-object/from16 v0, p0 */
v3 = this.this$0;
/* .line 686 */
final String v2 = "inneractive"; // const-string v2, "inneractive"
final String v3 = "onFailedToReceiveAd"; // const-string v3, "onFailedToReceiveAd"
android.util.Log .i ( v2,v3 );
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_3 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* .line 696 */
} // :cond_4
} // :goto_4
if ( v11 != null) { // if-eqz v11, :cond_5
/* .line 697 */
(( java.net.HttpURLConnection ) v11 ).disconnect ( ); // invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 700 */
} // :cond_5
/* move-object/from16 v0, p0 */
v2 = this.this$0;
v2 = com.inneractive.api.ads.InneractiveAdView .access$13 ( v2 );
int v3 = 2; // const/4 v3, 0x2
/* if-eq v2, v3, :cond_3 */
/* .line 701 */
com.inneractive.api.ads.InneractiveAdViewScheduler .getInstance ( );
/* new-instance v3, Lcom/inneractive/api/ads/InneractiveRefreshTask; */
/* move-object/from16 v0, p0 */
v7 = this.this$0;
/* invoke-direct {v3, v7}, Lcom/inneractive/api/ads/InneractiveRefreshTask;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
/* move-object/from16 v0, p0 */
v7 = this.this$0;
v7 = com.inneractive.api.ads.InneractiveAdView .access$14 ( v7 );
(( com.inneractive.api.ads.InneractiveAdViewScheduler ) v2 ).scheduleTask ( v3, v7 ); // invoke-virtual {v2, v3, v7}, Lcom/inneractive/api/ads/InneractiveAdViewScheduler;->scheduleTask(Ljava/util/TimerTask;I)V
/* .line 671 */
} // .end local v13 # "ioe":Ljava/lang/Exception;
/* .restart local v8 # "buffer":[B */
/* .restart local v14 # "responseCode":I */
/* .restart local v15 # "url":Ljava/net/URL; */
/* :catch_2 */
/* move-exception v10 */
/* .line 673 */
/* .local v10, "e":Ljava/lang/Exception; */
try { // :try_start_8
final String v2 = "inneractive"; // const-string v2, "inneractive"
final String v3 = "onReceiveAd - catch"; // const-string v3, "onReceiveAd - catch"
android.util.Log .w ( v2,v3,v10 );
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_1 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* goto/16 :goto_1 */
/* .line 695 */
} // .end local v8 # "buffer":[B
} // .end local v10 # "e":Ljava/lang/Exception;
} // .end local v14 # "responseCode":I
} // .end local v15 # "url":Ljava/net/URL;
/* :catchall_0 */
/* move-exception v2 */
/* .line 696 */
} // :goto_5
if ( v11 != null) { // if-eqz v11, :cond_6
/* .line 697 */
(( java.net.HttpURLConnection ) v11 ).disconnect ( ); // invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 700 */
} // :cond_6
/* move-object/from16 v0, p0 */
v3 = this.this$0;
v3 = com.inneractive.api.ads.InneractiveAdView .access$13 ( v3 );
int v7 = 2; // const/4 v7, 0x2
/* if-eq v3, v7, :cond_7 */
/* .line 701 */
com.inneractive.api.ads.InneractiveAdViewScheduler .getInstance ( );
/* new-instance v7, Lcom/inneractive/api/ads/InneractiveRefreshTask; */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v16, v0 */
/* move-object/from16 v0, v16 */
/* invoke-direct {v7, v0}, Lcom/inneractive/api/ads/InneractiveRefreshTask;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v16, v0 */
v16 = /* invoke-static/range {v16 ..v16}, Lcom/inneractive/api/ads/InneractiveAdView;->access$14(Lcom/inneractive/api/ads/InneractiveAdView;)I */
/* move/from16 v0, v16 */
(( com.inneractive.api.ads.InneractiveAdViewScheduler ) v3 ).scheduleTask ( v7, v0 ); // invoke-virtual {v3, v7, v0}, Lcom/inneractive/api/ads/InneractiveAdViewScheduler;->scheduleTask(Ljava/util/TimerTask;I)V
/* .line 703 */
} // :cond_7
/* throw v2 */
/* .line 688 */
/* .restart local v13 # "ioe":Ljava/lang/Exception; */
/* :catch_3 */
/* move-exception v10 */
/* .line 690 */
/* .restart local v10 # "e":Ljava/lang/Exception; */
try { // :try_start_9
final String v2 = "inneractive"; // const-string v2, "inneractive"
final String v3 = "onFailedToReceiveAd - catch"; // const-string v3, "onFailedToReceiveAd - catch"
android.util.Log .w ( v2,v3,v10 );
/* :try_end_9 */
/* .catchall {:try_start_9 ..:try_end_9} :catchall_0 */
/* .line 695 */
} // .end local v4 # "data":Ljava/lang/String;
} // .end local v10 # "e":Ljava/lang/Exception;
} // .end local v13 # "ioe":Ljava/lang/Exception;
/* .restart local v9 # "data":Ljava/lang/String; */
/* :catchall_1 */
/* move-exception v2 */
/* move-object v4, v9 */
} // .end local v9 # "data":Ljava/lang/String;
/* .restart local v4 # "data":Ljava/lang/String; */
/* .line 678 */
} // .end local v4 # "data":Ljava/lang/String;
/* .restart local v9 # "data":Ljava/lang/String; */
/* :catch_4 */
/* move-exception v13 */
/* move-object v4, v9 */
} // .end local v9 # "data":Ljava/lang/String;
/* .restart local v4 # "data":Ljava/lang/String; */
/* goto/16 :goto_3 */
} // .end local v4 # "data":Ljava/lang/String;
/* .restart local v9 # "data":Ljava/lang/String; */
/* .restart local v14 # "responseCode":I */
/* .restart local v15 # "url":Ljava/net/URL; */
} // :cond_8
/* move-object v4, v9 */
} // .end local v9 # "data":Ljava/lang/String;
/* .restart local v4 # "data":Ljava/lang/String; */
/* goto/16 :goto_1 */
} // .end method
