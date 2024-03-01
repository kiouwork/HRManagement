package com.fby.project.team.service;

/**
 * ClassName: TeamException
 * Package: com.fby.project.team.service
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/4 - 3:17
 * @Version: V0.1
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -35252111525L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
