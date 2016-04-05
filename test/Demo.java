import com.sinaapp.msdxblog.apkUtil.entity.ApkInfo;
import com.sinaapp.msdxblog.apkUtil.utils.ApkUtil;
import com.sinaapp.msdxblog.apkUtil.utils.IconUtil;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String apkpath = "E:\\export\\testCenter.apk";
			if (args.length > 0) {
				apkpath = args[0];
			}
			ApkInfo apkInfo = new ApkUtil().getApkInfo(apkpath);
			// 打印获取到的信息
			System.out.println(apkInfo);
			// 获取Icon并保存到指定位置
			IconUtil.extractFileFromApk(apkpath, apkInfo.getApplicationIcon(), "E:\\export\\icon.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
