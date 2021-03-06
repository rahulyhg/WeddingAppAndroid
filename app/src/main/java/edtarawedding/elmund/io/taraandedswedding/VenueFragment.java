package edtarawedding.elmund.io.taraandedswedding;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A placeholder fragment containing a simple view.
 */
public class VenueFragment extends Fragment {

    View v;

    public VenueFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_venue, container, false);

        if(v == null){
            String url = "http://www.hatfield-house.co.uk";

            WebView wbvBrowser = (WebView) rootView.findViewById(R.id.webView);

            wbvBrowser.getSettings().setJavaScriptEnabled(true);
            wbvBrowser.getSettings().setBuiltInZoomControls(true);
            wbvBrowser.getSettings().setDisplayZoomControls(false);
            wbvBrowser.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            wbvBrowser.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);

            wbvBrowser.setWebViewClient(new WebViewClient() {

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    view.setVisibility(View.VISIBLE);
                }

                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return false;
                }
            });

            wbvBrowser.loadUrl(url);

            v = rootView;

        }else{
            return v;
        }

        return rootView;
    }
}
