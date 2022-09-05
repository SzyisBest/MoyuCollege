package college.moyu.handler;


import college.moyu.utils.PageUtils;
import com.aliyun.oss.common.utils.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;


import static college.moyu.constant.CommonConst.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project MoyuCollege
 * @description 分页拦截器
 * @date 2022/9/5 17:43:23
 */
public class PageableHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String currentPage = request.getParameter(CURRENT);
        String pageSize = Optional.ofNullable(request.getParameter(SIZE)).orElse(DEFAULT_SIZE);
        if (!StringUtils.isNullOrEmpty(currentPage)) {
            PageUtils.setCurrentPage(new Page<>(Long.parseLong(currentPage),Long.parseLong(pageSize)));
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        PageUtils.remove();
    }
}
